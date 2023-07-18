package com.iemr.ecd.repo.call_conf_allocation;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.AlertNotificationLocMsg;

@Repository
public interface AlertNotifyLocMsgRepo extends CrudRepository<AlertNotificationLocMsg, Long> {

	List<AlertNotificationLocMsg> findByDeleted(Boolean deleted);

	List<AlertNotificationLocMsg> findByPsmId(Integer psmId);

	@Query(" SELECT t FROM AlertNotificationLocMsg t WHERE t.roleId=:roleId AND t.psmId=:psmId AND "
			+ " current_date() BETWEEN t.validFrom AND t.validTo ")
	List<AlertNotificationLocMsg> findByRoleIdAndPsmId(Integer roleId, Integer psmId);
}
