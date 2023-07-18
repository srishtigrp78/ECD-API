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
public class QualityAuditorWorklistRequestDTO {

	private Integer psmId;
	private Integer languageId;
	private Integer agentId;
	private Integer roleId;
	private Boolean isValid;

	private Integer year;
	private Integer month;
	private Integer cycleId;

	private Timestamp fromDate;
	private Timestamp toDate;

//	private String fDate;
//	private String tDate;
//	private String agentName;
//	private String language;
	// private String month;

}
