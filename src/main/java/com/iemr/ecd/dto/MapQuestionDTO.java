package com.iemr.ecd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MapQuestionDTO {

	private int parentQuestionId;
	private int childQuestionId;
	private String answer;
	private int psmId;
	private String createdBy;

}
