package com.iemr.ecd.dto;

import java.sql.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ResponseSaveCallQualityRatingsDTO {

	private Long id;
	private Integer sectionId;
	private Integer sectionName;
	private Integer questionnaireId;
	private String questionnaire;
	private String questionnaireType;
	private Integer sectionRank;
	private Integer questionnaireRank;
	private Integer psmId;
	private boolean deleted;
	private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private Date lastModDate;

}
