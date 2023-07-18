package com.iemr.ecd.service.call_conf_allocation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iemr.ecd.dao.AlertNotificationLocMsg;
import com.iemr.ecd.repo.call_conf_allocation.AlertNotifyLocMsgRepo;
import com.iemr.ecd.utils.advice.exception_handler.ECDException;

@Service
public class AlertNotifyLocMsgImpl {

	@Autowired
	private AlertNotifyLocMsgRepo alertNotifyLocMsgRepo;
//	@Autowired
//	private UserServiceRoleMappingRepo userServiceRoleMappingRepo;
//	@Autowired
//	private UserNotificationMapRepo userNotificationMapRepo;

	public List<AlertNotificationLocMsg> createAlertNotificationLocMsg(
			AlertNotificationLocMsg alertNotificationLocMsg) {
		AlertNotificationLocMsg obj;
		List<AlertNotificationLocMsg> alertNotificationLocMsgs = new ArrayList<>();

		if (alertNotificationLocMsg != null && alertNotificationLocMsg.getOfficeId() != null
				&& alertNotificationLocMsg.getOfficeId().length > 0) {
			for (Integer i : alertNotificationLocMsg.getOfficeId()) {
				obj = new AlertNotificationLocMsg();
				obj.setCreatedBy(alertNotificationLocMsg.getCreatedBy());
				obj.setRoleId(alertNotificationLocMsg.getRoleId());
				obj.setValidFrom(alertNotificationLocMsg.getValidFrom());
				obj.setValidTo(alertNotificationLocMsg.getValidTo());
				obj.setSubject(alertNotificationLocMsg.getSubject());
				obj.setMessage(alertNotificationLocMsg.getMessage());
				obj.setPsmId(alertNotificationLocMsg.getPsmId());
				obj.setTypeId(alertNotificationLocMsg.getTypeId());
				obj.setWorkingLocationID(i);

				alertNotificationLocMsgs.add(obj);
			}

		} else {
			alertNotificationLocMsgs.add(alertNotificationLocMsg);
		}

		return (List<AlertNotificationLocMsg>) alertNotifyLocMsgRepo.saveAll(alertNotificationLocMsgs);

	}

	public List<AlertNotificationLocMsg> getAlertNotificationLocMsgs() {
		return alertNotifyLocMsgRepo.findByDeleted(false);
	}

	public AlertNotificationLocMsg getAlertNotificationLocMsgById(Long id) {
		Optional<AlertNotificationLocMsg> resultSet = alertNotifyLocMsgRepo.findById(id);
		if (resultSet.isPresent())
			return resultSet.get();
		else
			throw new ECDException("No such element found");
	}

	public List<AlertNotificationLocMsg> getAlertNotificationLocMsgByPSMId(Integer psmId) {
		return alertNotifyLocMsgRepo.findByPsmId(psmId);
	}

	public List<AlertNotificationLocMsg> getAlertNotificationLocMsgByRoleIdAndPSMId(Integer roleId, Integer psmId) {
		return alertNotifyLocMsgRepo.findByRoleIdAndPsmId(roleId, psmId);
	}

	public List<AlertNotificationLocMsg> updateAlertNotificationLocMsg(
			List<AlertNotificationLocMsg> alertNotificationLocMsg) {

		return (List<AlertNotificationLocMsg>) alertNotifyLocMsgRepo.saveAll(alertNotificationLocMsg);

	}
}
