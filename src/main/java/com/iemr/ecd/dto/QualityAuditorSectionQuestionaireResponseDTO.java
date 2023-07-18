package com.iemr.ecd.dto;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QualityAuditorSectionQuestionaireResponseDTO {
	
	private Integer sectionId;
	private String sectionName;
	private Integer questionId;
	private String question;
	private Integer sectionRank;
	private Integer questionRank;
	private String answerType;
	private Integer psmId;
	private Boolean deleted;
	private String createdBy;
	private Timestamp createdDate;
	private String modifiedBy;
	private Timestamp lastModDate;
	
	private List<String> options;
	private List<Integer> scores;
	

}
