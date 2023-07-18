package com.iemr.ecd.repository.ecd;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.iemr.ecd.dao.V_GetSectionQuestionMappingAssociates;

public interface V_GetSectionQuestionMappingAssociatesRepo
		extends CrudRepository<V_GetSectionQuestionMappingAssociates, Long> {
	List<V_GetSectionQuestionMappingAssociates> findBySectionid(Integer sectionId);

	List<V_GetSectionQuestionMappingAssociates> findByPsmId(Integer psmId);

	List<V_GetSectionQuestionMappingAssociates> findByPsmIdAndCallConfigId(Integer psmId, Integer callConfigId);

}
