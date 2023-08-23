package com.iemr.ecd.repository.ecd;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import com.iemr.ecd.dao.MapQuestion;

@Repository
public interface MapQuestionRepo extends CrudRepository<MapQuestion, Integer> {
	
	@Query(value = "call Pr_ECDMapQuestions(:psmId)", nativeQuery = true)
	List<String[]> getMappedParentChildQuestionnaire(@Param("psmId") Integer psmId);

}
