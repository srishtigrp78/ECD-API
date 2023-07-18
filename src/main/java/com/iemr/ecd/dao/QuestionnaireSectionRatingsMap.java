package com.iemr.ecd.dao;

import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionnaireSectionRatingsMap {
	
	
	private Integer id;
	private Integer sectionID;
	private String sectionName;
	private Integer questionId;
	private String questionName;
	private String answer;
	private Integer score;
	private Integer finalScore;
	private String finalGrade;
	private String callRemarks;
	private Integer agentId;
	private String ecdCallType;
	private Integer psmId;
	private Boolean deleted;
	private String createdBy;
	private Timestamp createdDate;
	private String modifiedBy;
	private Timestamp lastModDate;
	

}
