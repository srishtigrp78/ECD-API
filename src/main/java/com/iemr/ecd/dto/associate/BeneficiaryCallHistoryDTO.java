package com.iemr.ecd.dto.associate;

import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class BeneficiaryCallHistoryDTO {
	
	private Long obCallId;
	private Long userId;
	private Long agentId;
	private String role;
	private String phoneNo;
	private Integer psmId;
	private String ecdCallType;
	private Integer callId;
	private Boolean isOutbound;
	private Long beneficiaryRegId;
	private String typeOfComplaint;
	private String complaintRemarks;
	private String callRemarks;
	private Timestamp callTime;
	private Boolean isCallVerified;
	private Boolean isCallAnswered;
	private Boolean isCallDisconnected;
	private String callDuration;
	private Timestamp callEndTime;
	private Boolean deleted;
	private String createdBy;
	private Timestamp createdDate;
	private String modifiedBy;
	private Date lastModDate;
    
	

}
