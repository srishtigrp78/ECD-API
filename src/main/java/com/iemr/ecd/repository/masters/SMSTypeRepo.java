package com.iemr.ecd.repository.masters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.masters.SMSType;

@Repository
public interface SMSTypeRepo extends CrudRepository<SMSType, Integer> {
	
	List<SMSType> findByDeleted(Boolean deleted);

}
