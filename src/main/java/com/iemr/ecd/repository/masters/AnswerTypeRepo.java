package com.iemr.ecd.repository.masters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.masters.AnswerType;

@Repository
public interface AnswerTypeRepo extends CrudRepository<AnswerType, Integer> {
	
	List<AnswerType> findByDeleted(Boolean deleted);

}
