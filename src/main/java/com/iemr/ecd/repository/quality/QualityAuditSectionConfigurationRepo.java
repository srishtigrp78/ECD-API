package com.iemr.ecd.repository.quality;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.QualityAuditSectionConfiguration;

@Repository
public interface QualityAuditSectionConfigurationRepo extends CrudRepository<QualityAuditSectionConfiguration, Integer>{
	
	List<QualityAuditSectionConfiguration> findByPsmId(Integer psmId);

}
