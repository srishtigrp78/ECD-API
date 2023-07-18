package com.iemr.ecd.repository.masters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.masters.HRNIReasons;

@Repository
public interface HRNIReasonsRepo extends CrudRepository<HRNIReasons, Integer> {
	
	List<HRNIReasons> findByDeleted(Boolean deleted);

}
