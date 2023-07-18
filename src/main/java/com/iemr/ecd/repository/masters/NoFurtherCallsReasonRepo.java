package com.iemr.ecd.repository.masters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.masters.NoFurtherCallsReason;

@Repository
public interface NoFurtherCallsReasonRepo extends CrudRepository<NoFurtherCallsReason, Integer> {
	
	List<NoFurtherCallsReason> findByDeleted(Boolean deleted);

}
