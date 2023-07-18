package com.iemr.ecd.repository.quality;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.V_get_Qualityaudit_SectionQuestionaireValues;

@Repository
public interface V_get_Qualityaudit_SectionQuestionaireValuesRepo
		extends CrudRepository<V_get_Qualityaudit_SectionQuestionaireValues, String> {

	List<V_get_Qualityaudit_SectionQuestionaireValues> findByPsmIdOrderByQuestionId(Integer psmId);

}
