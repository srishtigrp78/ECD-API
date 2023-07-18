package com.iemr.ecd.dto.associate;

import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class CallClosureDTO {
	
	private Long benCallId;
	private Long obCallId;
	private Long motherId;
	private Long childId;
	private Integer userId;
	private Integer agentId;
	private String role;
	private String phoneNo;
	private Integer psmId;
	private String ecdCallType;
	private String callId;
	private Boolean isOutbound;
	private Long beneficiaryRegId;
	private Boolean isFurtherCallRequired;
	private Integer reasonForNoFurtherCallsId;
	private String reasonForNoFurtherCalls;
	private Boolean isCallVerified;
	private Boolean isCallAnswered;
	private Integer reasonForCallNotAnsweredId;
	private String reasonForCallNotAnswered;
	private Boolean isCallDisconnected;
	private Integer ComplaintId;
	private String typeOfComplaint;
	private String complaintRemarks;
	private String nextAttemptDate;
	private String callRemarks;
	private String sendAdvice;
	private String altPhoneNo;
	private Boolean isStickyAgentRequired;
	private Boolean isHrp;
	private Boolean isHrni;
	private Boolean deleted;
	private String createdBy;
	private Timestamp createdDate;
	private String modifiedBy;
	private Date lastModDate;
	
	private Timestamp nextCallDate;
    

}
