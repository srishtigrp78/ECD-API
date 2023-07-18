package com.iemr.ecd.repository.ecd;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.associate.Bencall;
import com.iemr.ecd.dao.masters.UserServiceRoleMapping;

@Repository
public interface BencallRepo extends CrudRepository<Bencall, Long> {

	Bencall findByBenCallId(Long benCallId);
}
