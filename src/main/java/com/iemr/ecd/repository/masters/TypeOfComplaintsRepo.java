package com.iemr.ecd.repository.masters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.masters.TypeOfComplaints;

@Repository
public interface TypeOfComplaintsRepo extends CrudRepository<TypeOfComplaints, Integer> {
	
	List<TypeOfComplaints> findByDeleted(Boolean deleted);

}
