package com.iemr.ecd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParentAnswer {
	
	private int parentQuesId;
	private String[] parentAnswerList;

}
