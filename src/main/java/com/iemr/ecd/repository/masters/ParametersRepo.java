package com.iemr.ecd.repository.masters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.masters.SMSParametersMapping;

@Repository
public interface ParametersRepo extends CrudRepository<SMSParametersMapping, Integer> {
	
	List<SMSParametersMapping> findByDeleted(Boolean deleted);

}
