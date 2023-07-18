package com.iemr.ecd.repository.ecd;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.V_GetSectionQuestionMapping;

@Repository
public interface V_GetSectionQuestionMappingRepo extends CrudRepository<V_GetSectionQuestionMapping, Integer> {
	List<V_GetSectionQuestionMapping> findBySectionid(Integer sectionId);

	List<V_GetSectionQuestionMapping> findByPsmId(Integer psmId);
}
