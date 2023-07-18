package com.iemr.ecd.dto.report;

import java.io.Serializable;
import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BenCallDetail implements Serializable {
	
	private String startDate;
	private String endDate;
	private String role;
	private Integer agentId;
	private Integer psmId;

}
