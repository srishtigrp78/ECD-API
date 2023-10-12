package com.iemr.ecd.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ECDMapQuestions {
    
	private Integer id;
	private Integer parentQuestionId;
	private String parentQuestion;
	private String[] answer;
	private Integer childQuestionId;
	private String childQuestion;
	private Integer psmId;
	private Boolean deleted;

}
