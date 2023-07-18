package com.iemr.ecd.repository.masters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.masters.Role;

@Repository
public interface RoleRepo extends CrudRepository<Role, Integer> {
	
	List<Role> findByPsmIdAndDeleted(Integer psmId, Boolean deleted);

}
