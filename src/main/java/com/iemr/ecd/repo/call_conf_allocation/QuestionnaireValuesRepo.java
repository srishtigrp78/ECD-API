package com.iemr.ecd.repo.call_conf_allocation;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.QuestionnaireValues;

@Repository
public interface QuestionnaireValuesRepo extends CrudRepository<QuestionnaireValues, Long> {

	public List<QuestionnaireValues> findByQuestionIdAndDeleted(Integer questionId, Boolean deleted);

}
