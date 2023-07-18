package com.iemr.ecd.repository.masters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.masters.Frequency;

@Repository
public interface FrequencyRepo extends CrudRepository<Frequency, Integer> {
	
	List<Frequency> findByDeleted(Boolean deleted);

}
