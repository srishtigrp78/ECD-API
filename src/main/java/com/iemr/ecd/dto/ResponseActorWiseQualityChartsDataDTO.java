package com.iemr.ecd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseActorWiseQualityChartsDataDTO {
	
	private String name;
	private Integer value;
	private Integer agentId;

}
