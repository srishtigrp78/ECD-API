package com.iemr.ecd.dao_temp;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class FetchMotherOutboundWorklist {

	private Long obCallId;
	private Long beneficiaryRegId;
	private Integer allocatedUserId;
	private Integer providerServiceMapId;
	private String outboundCallType;
	private Timestamp callDateFrom;
	private Integer noOfTrials;
	private String displayOBCallType;
	private String name;
	private String mCTSIdNo;
	private String phoneNoOfWhom;
	private String whomPhoneNo;
	private Boolean highRisk;

	private String husbandName;
	private String address;
	private String healthBlock;
	private String phcName;
	private String subFacility;
	private Timestamp lmpDate;
	private String ashaName;
	private String anmName;
	private Timestamp nextCallDate;
	private String lapseTime;
	private Timestamp recordUploadDate;

	private Timestamp edd;

	// new columns
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
