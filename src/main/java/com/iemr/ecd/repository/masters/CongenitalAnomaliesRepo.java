package com.iemr.ecd.repository.masters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.masters.CongenitalAnomalies;

@Repository
public interface CongenitalAnomaliesRepo extends CrudRepository<CongenitalAnomalies, Integer> {
	
	List<CongenitalAnomalies> findByDeleted(Boolean deleted);

}
