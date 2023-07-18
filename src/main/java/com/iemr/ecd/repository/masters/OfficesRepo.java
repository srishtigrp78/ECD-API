package com.iemr.ecd.repository.masters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.masters.Offices;

@Repository
public interface OfficesRepo extends CrudRepository<Offices, Integer> {

	List<Offices> findByDeleted(Boolean deleted);

	List<Offices> findByPsmId(Integer psmId);

	List<Offices> findByDistrictId(Integer distId);
	
	List<Offices> findByDistrictIdAndPsmId(Integer distId, Integer psmId);

	// List<Offices> findByLocationName(String locName);

}
