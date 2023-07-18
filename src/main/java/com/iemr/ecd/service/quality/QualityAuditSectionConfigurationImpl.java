package com.iemr.ecd.service.quality;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.iemr.ecd.dao.QualityAuditSectionConfiguration;
import com.iemr.ecd.repository.quality.QualityAuditSectionConfigurationRepo;
import com.iemr.ecd.utils.advice.exception_handler.ECDException;

import jakarta.transaction.Transactional;

@Service
public class QualityAuditSectionConfigurationImpl {
	@Autowired
	private QualityAuditSectionConfigurationRepo qualityAuditSectionConfigurationRepo;

	@Transactional(rollbackOn = Exception.class)
	public String createQualityAuditSectionConfiguration(
			List<QualityAuditSectionConfiguration> qualityAuditSectionConfiguration) {
		try {
			qualityAuditSectionConfigurationRepo.saveAll(qualityAuditSectionConfiguration);

			Map<String, Object> responseMap = new HashMap<>();
			responseMap.put("response", "Section Configuration Created Successfully");
			return new Gson().toJson(responseMap);
		} catch (Exception e) {
			throw new ECDException(e);
		}

	}

	public List<QualityAuditSectionConfiguration> getQualityAuditSectionConfigurationByPSMId(Integer psmId) {
		try {
			return qualityAuditSectionConfigurationRepo.findByPsmId(psmId);
		} catch (Exception e) {
			throw new ECDException(e);
		}
	}

	public String updateQualityAuditSectionConfiguration(
			QualityAuditSectionConfiguration qualityAuditSectionConfiguration) {
		try {
			if (qualityAuditSectionConfiguration != null && qualityAuditSectionConfiguration.getSectionId() != null)
				qualityAuditSectionConfigurationRepo.save(qualityAuditSectionConfiguration);

			Map<String, Object> responseMap = new HashMap<>();
			responseMap.put("response", "Agent Quality Auditor Mapping Updated Successfully");
			return new Gson().toJson(responseMap);
		} catch (Exception e) {
			throw new ECDException(e);
		}

	}

}
