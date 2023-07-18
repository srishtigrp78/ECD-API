package com.iemr.ecd.repository.quality;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.associate.Bencall;

@Repository
public interface T_benCallRepo extends CrudRepository<Bencall, Long> {
	

	
	

}
