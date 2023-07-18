package com.iemr.ecd.repo.call_conf_allocation;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.SampleSelectionConfiguration;

@Repository

public interface SampleSelectionConfigurationRepo extends CrudRepository<SampleSelectionConfiguration, Integer>{
	
	List<SampleSelectionConfiguration> findByPsmId(Integer psmId);

	List<SampleSelectionConfiguration> findByCycleIdAndDeletedAndPsmId(Integer cycleId, Boolean deleted, Integer psmId);


}
