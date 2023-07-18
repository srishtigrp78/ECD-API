package com.iemr.ecd.dao_temp;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pr_GetHRPDetails {
	
	private Long motherId;
	private Long childId;
	private String reasonsForHrp;
	private String otherHrpReason;
	private String reasonsForHrni;
	private String otherHrni;
	private String congentialAnomalies;
	private String otherCongentialAnomalies;
	

}
