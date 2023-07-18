package com.iemr.ecd.repository.masters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.masters.Cycles;
@Repository
public interface CycleRepo extends CrudRepository<Cycles, Integer> {
	
	List<Cycles> findByDeleted(Boolean deleted);

}
