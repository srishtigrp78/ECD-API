package com.iemr.ecd.repository.masters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.masters.GradeMaster;

@Repository
public interface GradeMasterRepo extends CrudRepository<GradeMaster, Integer> {
	
	List<GradeMaster> findByDeleted(Boolean deleted);

}
