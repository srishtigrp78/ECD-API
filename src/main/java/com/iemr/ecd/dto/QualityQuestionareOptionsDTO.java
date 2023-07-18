package com.iemr.ecd.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QualityQuestionareOptionsDTO {

	private Integer id;
	private String option;
	private Integer score;

}
