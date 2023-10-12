/*
* AMRIT – Accessible Medical Records via Integrated Technology
* Integrated EHR (Electronic Health Records) Solution
*
* Copyright (C) "Piramal Swasthya Management and Research Institute"
*
* This file is part of AMRIT.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see https://www.gnu.org/licenses/.
*/
package com.iemr.ecd.dto;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeneficiaryCasesheetDTO {
	private Long beneficiaryRegId;
	private Long benCallId;
	private Long motherId;
	private Long childId;
	private String beneficiaryName;
	private String motherName;
	private String spouseName;
	private Integer genderID;
	private String genderName;
	private String phoneNo;
	private String phoneNoOfWhom;
	private String alternatePhoneNo;
	
	private String dateOfBirth;
	private String lmp;
	private String edd;
	private Integer age;
	private String address;
	private String ashaName;
	private String ashaPh;
	private String anmName;
	private String anmPh;
	private String phcName;
	private String blockName;
	private String outboundCallType;
	
	private Boolean isFurtherCallRequired;
	private String reasonForNoFurtherCalls;
	private Boolean isCallVerified;
	private Boolean isCallAnswered;
	private String reasonForCallNotAnswered;
	private Boolean isCallDisconnected;
	private String typeOfComplaint;
	private String complaintRemarks;
	private String nextAttemptDate;
	private String callRemarks;
	private String sendAdvice;
	private Boolean isWrongNumber;
	private Integer providerServiceMapID;
	private String createdDate;
	
}


