package com.iemr.ecd.repository.masters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.masters.V_GetUserlangmapping;

@Repository
public interface V_GetUserlangmappingRepo extends CrudRepository<V_GetUserlangmapping, Integer> {
	
	List<V_GetUserlangmapping> findByUserId(Integer userId);

}
