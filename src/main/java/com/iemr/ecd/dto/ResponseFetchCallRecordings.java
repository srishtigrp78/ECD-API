package com.iemr.ecd.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ResponseFetchCallRecordings {
	
	private String beneficiaryId;
	private String beneficiaryName;
	private Integer phoneNumber;
	private Integer agentId;
	private String agentName;
	private String callType;
	private Long benCallId;
	private boolean isCallAudited;
	private Integer roleId;
	private String role;

}
