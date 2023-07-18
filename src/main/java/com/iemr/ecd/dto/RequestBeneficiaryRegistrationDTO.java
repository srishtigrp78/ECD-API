package com.iemr.ecd.dto;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestBeneficiaryRegistrationDTO {

	private Long beneficiaryRegID;
	private Long motherId;
	private Long childId;
	private String name;
	private String motherName;
	private Timestamp dOB;
	private String dateOfBirth;
	private String spouseName;
	private Boolean emergencyRegistration;
	private Integer genderID;
	private String genderName;
	private String phoneNo;
	private String phoneNoOfWhom;
	private String alternatePhoneNo;
	private Timestamp lmp;
	private Timestamp edd;
	private String ashaName;
	private String ashaPh;
	private String anmName;
	private String anmPh;
	private String blockName;
	private String phcName;

	private RequestBeneficiaryDemographicsDTO i_bendemographics;
	private List<RequestBenPhoneMapsDTO> benPhoneMaps;
	private Boolean changeInSelfDetails;
	private Boolean changeInOtherDetails;
	private Boolean changeInAddress;
	private Boolean changeInContacts;
	private Boolean changeInFamilyDetails;
	private Integer vanID;
	private Integer providerServiceMapID;
	private String createdBy;
	private String modifiedBy;

	private String firstName;
	private String lastName;
}
