package com.iemr.ecd.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class RequestSaveCallQualityRatingsDTO {

	

	private Integer psmId;
	private Integer qualityAuditorId;
	private Long benCallId;
	private Integer sectionId;
	private String sectionName;
	private Integer questionId;
	private String questionName;
	private Integer agentId;
	private String agentName;
	private String answer;
	private Integer score;
	private Integer finalScore;
	private String finalGrade;
	private String callRemarks;
	private String outboundCallType;
	private String createdBy;

}
