package com.iemr.ecd.service.associate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.iemr.ecd.dao.QualityAuditorRating;
import com.iemr.ecd.dao.masters.UserServiceRoleMapping;
import com.iemr.ecd.dao_temp.V_GetDialPreference;
import com.iemr.ecd.dto.ResponseAutoPreviewDialingDTO;
import com.iemr.ecd.dto.ResponseGetRatingsDTO;
import com.iemr.ecd.repository.ecd.V_GetDialPreferenceRepo;
import com.iemr.ecd.repository.masters.UserServiceRoleMappingRepo;
import com.iemr.ecd.repository.quality.QualityAuditorRatingRepo;
import com.iemr.ecd.utils.advice.exception_handler.ECDException;
import com.iemr.ecd.utils.advice.exception_handler.InvalidRequestException;

import jakarta.transaction.Transactional;

@Service
public class AutoPreviewDialingImpl {

	@Autowired
	private UserServiceRoleMappingRepo userServiceRoleMappingRepo;
	@Autowired
	private QualityAuditorRatingRepo qualityAuditorRatingRepo;

	@Autowired
	private V_GetDialPreferenceRepo V_GetDialPreferenceRepo;

	@Transactional(rollbackOn = Exception.class)
	public String addDialPreference(UserServiceRoleMapping userServiceRoleMapping) {
		try {
			UserServiceRoleMapping obj = userServiceRoleMappingRepo.findByUserIdAndRoleIdAndPsmIdAndDeleted(
					userServiceRoleMapping.getUserId(), userServiceRoleMapping.getRoleId(),
					userServiceRoleMapping.getPsmId(), false);

			if (obj != null) {
				obj.setIsAutoPreviewDial(userServiceRoleMapping.getIsDialPreference());
				obj.setPreviewWindowTime(userServiceRoleMapping.getPreviewWindowTime());

				userServiceRoleMappingRepo.save(obj);
			} else
				throw new InvalidRequestException("Invalid request", "please pass valid userId and roleId");

			Map<String, Object> responseMap = new HashMap<>();
			responseMap.put("response", "Dial Preference Added Successfully");
			return new Gson().toJson(responseMap);
		} catch (Exception e) {
			throw new ECDException(e);
		}

	}

	public List<V_GetDialPreference> getDialPreference(int psmId) {
		try {
			return V_GetDialPreferenceRepo.findByPsmId(psmId);
		} catch (Exception e) {
			throw new ECDException(e);
		}

	}

	public ResponseAutoPreviewDialingDTO getAutoPreviewDialingByUserIdAndRoleIdAndPsmId(Integer userId, Integer roleId,
			Integer psmId) {
		try {
			UserServiceRoleMapping mapping = userServiceRoleMappingRepo.findByUserIdAndRoleIdAndPsmIdAndDeleted(userId,
					roleId, psmId, false);
			if (mapping != null)
				return new ResponseAutoPreviewDialingDTO(mapping.getIsAutoPreviewDial(),
						mapping.getPreviewWindowTime());
			else
				return new ResponseAutoPreviewDialingDTO();
		} catch (Exception e) {
			throw new ECDException(e);
		}

	}

	public List<ResponseGetRatingsDTO> getRatingsByUserIdAndPsmId(Integer userId, Integer psmId) {
		try {
			List<QualityAuditorRating> ratings = qualityAuditorRatingRepo.getLatestRatingsByAgentIdAndPsmId(userId,
					psmId);
			List<ResponseGetRatingsDTO> responseList = new ArrayList<>();
			ResponseGetRatingsDTO response;
			if (ratings != null) {
				for (QualityAuditorRating qualityAuditorRating : ratings) {

					response = new ResponseGetRatingsDTO();
					response.setScoreInPercentage(qualityAuditorRating.getFinalScore() + "%");
					response.setGrade(qualityAuditorRating.getFinalGrade());
					response.setDate(qualityAuditorRating.getCreatedDate());
					responseList.add(response);
				}

			}
			return responseList;
		} catch (Exception e) {
			throw new ECDException(e);
		}
	}

}
