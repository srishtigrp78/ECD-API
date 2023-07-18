package com.iemr.ecd.repo.call_conf_allocation;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.CallSectionMapping;

@Repository
public interface CallSectionMappingRepo extends CrudRepository<CallSectionMapping, Integer> {

	List<CallSectionMapping> findByPsmIdAndCallConfigIdAndDeleted(Integer psmId, Integer callConfigId, Boolean deleted);

	List<CallSectionMapping> findByPsmIdAndDeleted(Integer psmId, Boolean deleted);

}
