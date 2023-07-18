package com.iemr.ecd.service.outbound_worklist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iemr.ecd.dao.associate.Bencall;
import com.iemr.ecd.dto.associate.CallStatisticsDTO;
import com.iemr.ecd.repo.call_conf_allocation.CallStatisticsRepo;
import com.iemr.ecd.utils.advice.exception_handler.ECDException;

@Service
public class CallStatisticsImpl {

	@Autowired
	private CallStatisticsRepo callStatisticsRepo;

	public CallStatisticsDTO getCallStatisticsByAgentId(String agentId) {
		int callVerifiedCount = 0;
		int callAnsweredCount = 0;

		try {
			CallStatisticsDTO callStatistics = new CallStatisticsDTO();

			List<Bencall> data = callStatisticsRepo.getCallCurrentDateStatistics(agentId);

			if (data != null && data.size() > 0) {
//			callStatistics.setTotalCalls(data.size());
				for (Bencall obj : data) {
					if (obj.getIsCallAnswered() != null && obj.getIsCallAnswered() == true) {
						callAnsweredCount++;
					}
					if (obj.getIsCallVerified() != null && obj.getIsCallVerified() == true) {
						callVerifiedCount++;
					}
				}
				callStatistics.setTotalCallsAnswered(callAnsweredCount);
				callStatistics.setTotalCallsVerified(callVerifiedCount);
			}

			return callStatistics;
		} catch (Exception e) {
			throw new ECDException(e);
		}

	}

}
