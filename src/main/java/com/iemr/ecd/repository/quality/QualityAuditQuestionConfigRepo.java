package com.iemr.ecd.repository.quality;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.QualityAuditQuestionConfig;

@Repository
public interface QualityAuditQuestionConfigRepo extends CrudRepository<QualityAuditQuestionConfig, Integer>{
	
	@Query(value = "call Pr_QualityAuditorSectionQuestionaire(:psmId)", nativeQuery = true)
	List<String[]> getQualityAuditQuestionnaire(@Param("psmId") Integer psmId);


}
