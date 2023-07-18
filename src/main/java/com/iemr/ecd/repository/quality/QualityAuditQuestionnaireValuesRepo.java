package com.iemr.ecd.repository.quality;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.iemr.ecd.dao.QualityAuditQuestionnaireValues;

public interface QualityAuditQuestionnaireValuesRepo extends CrudRepository<QualityAuditQuestionnaireValues, Integer>{
	
	public List<QualityAuditQuestionnaireValues> findByQuestionIdAndDeleted(Integer questionId, Boolean deleted);
	
	List<QualityAuditQuestionnaireValues> findByQuestionIdAndPsmIdAndDeleted(Integer questionId, Integer psmId, Boolean deleted);

}
