package com.iemr.ecd.repository.masters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.masters.AgentsViewMaster;

@Repository
public interface AgentsViewMasterRepo extends CrudRepository<AgentsViewMaster, Integer> {
	
	List<AgentsViewMaster> findByRoleId(Integer roleId);

}
