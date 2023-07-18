package com.iemr.ecd.repo.call_conf_allocation;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.UserNotificationMap;

@Repository
public interface UserNotificationMapRepo extends CrudRepository<UserNotificationMap, Long> {

}
