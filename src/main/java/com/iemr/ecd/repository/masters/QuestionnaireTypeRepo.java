package com.iemr.ecd.repository.masters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.masters.QuestionnaireType;

@Repository
public interface QuestionnaireTypeRepo extends CrudRepository<QuestionnaireType, Integer> {
	
	List<QuestionnaireType> findByDeleted(Boolean deleted);

}
