package com.iemr.ecd.repository.masters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.masters.HRPReasons;

@Repository
public interface HRPReasonsRepo extends CrudRepository<HRPReasons, Integer> {
	
	List<HRPReasons> findByDeleted(Boolean deleted);

}
