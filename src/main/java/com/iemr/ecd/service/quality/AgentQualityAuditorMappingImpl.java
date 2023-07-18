package com.iemr.ecd.service.quality;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.iemr.ecd.dao.AgentQualityAuditorMap;
import com.iemr.ecd.repository.quality.AgentQualityAuditorMapRepo;
import com.iemr.ecd.utils.advice.exception_handler.ECDException;

import jakarta.transaction.Transactional;

@Service
public class AgentQualityAuditorMappingImpl {
	@Autowired
	private AgentQualityAuditorMapRepo agentQualityAuditorMapRepo;

	@Transactional(rollbackOn = Exception.class)
	public String createAgentQualityAuditorMapping(AgentQualityAuditorMap agentQualityAuditorMap) {
		try {
			AgentQualityAuditorMap mapObj;
			List<AgentQualityAuditorMap> agentMapDetails = new ArrayList<>();
			if (agentQualityAuditorMap != null && agentQualityAuditorMap.getAgentIds() != null
					&& agentQualityAuditorMap.getAgentIds().length > 0) {
				int j = 0;
				String[] agentNamesArr = agentQualityAuditorMap.getAgentNames();
				for (Integer i : agentQualityAuditorMap.getAgentIds()) {
					mapObj = new AgentQualityAuditorMap();
					mapObj.setQualityAuditorId(agentQualityAuditorMap.getQualityAuditorId());
					mapObj.setQualityAuditorName(agentQualityAuditorMap.getQualityAuditorName());
					mapObj.setRoleId(agentQualityAuditorMap.getRoleId());
					mapObj.setRoleName(agentQualityAuditorMap.getRoleName());
					mapObj.setAgentId(i);
					mapObj.setAgentName(agentNamesArr[j]);
					mapObj.setPsmId(agentQualityAuditorMap.getPsmId());
					mapObj.setCreatedBy(agentQualityAuditorMap.getCreatedBy());

					agentMapDetails.add(mapObj);
					j++;
				}
			} else {
				agentMapDetails.add(agentQualityAuditorMap);
			}
			agentQualityAuditorMapRepo.saveAll(agentMapDetails);

			Map<String, Object> responseMap = new HashMap<>();
			responseMap.put("response", "Agent Quality Auditor Mapping Created Successfully");
			return new Gson().toJson(responseMap);
		} catch (Exception e) {
			throw new ECDException(e);
		}

	}

	public List<AgentQualityAuditorMap> getAgentQualityAuditorMappingByPSMId(Integer psmId) {
		try {
			return agentQualityAuditorMapRepo.findByPsmId(psmId);
		} catch (Exception e) {
			throw new ECDException(e);
		}
	}

	@Transactional(rollbackOn = Exception.class)
	public String updateAgentQualityAuditorMapping(AgentQualityAuditorMap agentQualityAuditorMap) {

		try {
			if (agentQualityAuditorMap != null && agentQualityAuditorMap.getId() != null)
				agentQualityAuditorMapRepo.save(agentQualityAuditorMap);

			Map<String, Object> responseMap = new HashMap<>();
			responseMap.put("response", "Agent Quality Auditor Mapping Updated Successfully");
			return new Gson().toJson(responseMap);
		} catch (Exception e) {
			throw new ECDException(e);
		}

	}

}
