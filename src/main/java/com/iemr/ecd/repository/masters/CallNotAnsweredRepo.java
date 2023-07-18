package com.iemr.ecd.repository.masters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.masters.CallNotAnsweredReason;

@Repository
public interface CallNotAnsweredRepo extends CrudRepository<CallNotAnsweredReason, Integer> {
	
	List<CallNotAnsweredReason> findByDeleted(Boolean deleted);

}
