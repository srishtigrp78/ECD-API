package com.iemr.ecd.repository.masters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.masters.SMSParameters;

@Repository
public interface ValueRepo extends CrudRepository<SMSParameters, Integer> {
	
	List<SMSParameters> findByDeleted(Boolean deleted);

}
