package com.iemr.ecd.dto;

import java.math.BigInteger;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ResponseEligibleRecordsDTO {

	private BigInteger totalRecords;
	private BigInteger totalIntroductoryRecords;
	private BigInteger totalLowRiskRecords;
	private BigInteger totalHighRiskRecords;
	private BigInteger totalAllocatedRecords;

}
