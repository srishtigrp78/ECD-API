package com.iemr.ecd.repository.masters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.masters.UserServiceRoleMapping;

@Repository
public interface UserServiceRoleMappingRepo extends CrudRepository<UserServiceRoleMapping, Integer> {

	List<UserServiceRoleMapping> findByRoleIdAndDeleted(Integer roleId, Boolean deleted);

	List<UserServiceRoleMapping> findByRoleIdAndPsmIdAndWorkingLocationID(Integer roleId, Integer psmId, Integer wlId);
	
	UserServiceRoleMapping findByUserIdAndRoleIdAndPsmIdAndDeleted(Integer userId, Integer roleId, Integer psmId, Boolean deleted);
	

}
