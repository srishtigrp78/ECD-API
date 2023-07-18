package com.iemr.ecd.dao_temp;

import java.math.BigInteger;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pr_GetCallHistory {
	
	private String callId;
	private Long motherId;
	private String motherName;
	private Long childId;
	private String childName;
	private String phoneNo;
	private String ashaName;
	private String role;
	private Timestamp lmpDate;
	private Timestamp dob;
	private Timestamp callTime;
	private String ecdCallType;
	private String typeOfComplaint;
	private String complaintRemarks;
	private String adviseProvided;
	
}
