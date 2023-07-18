package com.iemr.ecd.dto.supervisor;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseEligibleCallRecordsDTO {

	private int totalIntroductoryRecord;
	private int totalLowRiskRecord;
	private int totalHighRiskRecord;

	private int totalRecord;

	private int totalAllocatedRecord;

}
