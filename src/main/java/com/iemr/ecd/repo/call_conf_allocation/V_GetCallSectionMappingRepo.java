package com.iemr.ecd.repo.call_conf_allocation;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.V_GetCallSectionMapping;

@Repository
public interface V_GetCallSectionMappingRepo extends CrudRepository<V_GetCallSectionMapping, Integer> {

	List<V_GetCallSectionMapping> findByCallConfigIdAndSectionIdAndPsmId(Integer callConfigId, Integer sectionId,
			Integer psmId);

	List<V_GetCallSectionMapping> findBySectionIdAndPsmId(Integer sectionId, Integer psmId);

}
