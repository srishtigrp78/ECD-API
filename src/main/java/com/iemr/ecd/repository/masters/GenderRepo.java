package com.iemr.ecd.repository.masters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.masters.Gender;


@Repository
public interface GenderRepo extends CrudRepository<Gender, Integer> {
	
	List<Gender> findByDeleted(Boolean deleted);

}

