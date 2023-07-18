package com.iemr.ecd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseFetchQualityChartsDataDTO {
	
	private String name;
	private Integer value;

}
