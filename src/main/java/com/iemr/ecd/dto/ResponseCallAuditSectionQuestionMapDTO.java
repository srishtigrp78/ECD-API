package com.iemr.ecd.dto;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ResponseCallAuditSectionQuestionMapDTO {

	private Integer sectionId;
	private String sectionName;
	private Integer sectionRank;
	private Integer questionId;
	private String question;
	private Integer questionRank;
	private Integer psmId;

	private List<QualityQuestionareOptionsDTO> options;

	private boolean deleted;
	private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private Date lastModDate;

}
