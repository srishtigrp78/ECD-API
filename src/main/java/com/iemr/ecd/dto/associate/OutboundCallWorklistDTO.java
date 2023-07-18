package com.iemr.ecd.dto.associate;

import java.sql.Date;
import java.sql.Timestamp;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class OutboundCallWorklistDTO {
	
	private Long obCallId;
	private Long motherId;
	private String motherName;
	private Long childId;
	private String childName;
	private String husbandName;
	private String address;
	private String healthBlock;
	private String phcName;
	private String subFacility;
	private String ashaName;
	private String anmName;
	private Timestamp lmpDate;
	private Timestamp nextCallDate;
	private Long beneficiaryRegId;
	private String ecdCallType;
	private String displayEcdCallType;
	private String whomPhoneNo;
	private String phoneNo;
	private Boolean isHighRisk;
	private String lapseTime;
	private Integer callAttemptNo;
	private String callStatus;
	private Timestamp recordUploadDate;
    private Timestamp dob;
    private Boolean deleted;
	private String createdBy;
	private Timestamp createdDate;
	private String modifiedBy;
	private Date lastModDate;
    
	

}
