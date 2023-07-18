package com.iemr.ecd.dao_temp;

import java.math.BigInteger;
import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class FetchChildOutboundWorklist {

	private Long beneficiaryRegId;
	private String outboundCallType;
	private String displayOBCallType;
	private Timestamp callDateFrom;
	private Integer noOfTrials;
	private String mCTSIdNoChildId;
	private String childName;
	private String motherId;
	private String motherName;
	private String PhoneNoOf;
	private String PhoneNo;
	private Long obCallId;

	private String address;
	private String healthBlock;
	private String phcName;
	private String subFacility;
	private String ashaName;
	private String anmName;
	private Timestamp dob;
	private Timestamp nextCallDate;
	private Boolean isHrni;
	private String lapseTime;
	private Timestamp recordUploadDate;

	// new fields / columns
	private String fatherName;
	private String gender;
	private Integer stateId;
	private String stateName;
	private Integer districtId;
	private String districtName;
	private Integer blockId;

	private String blockName;
	private Integer districtBranchId;
	private String villageName;
	private String alternatePhoneNo;
	private String ashaPhoneNo;
	private String anmPhoneNo;
}
