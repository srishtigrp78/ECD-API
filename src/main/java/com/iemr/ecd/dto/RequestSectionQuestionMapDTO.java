package com.iemr.ecd.dto;

import java.sql.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class RequestSectionQuestionMapDTO {

	private Long id;

	private Integer sectionId;
	private Integer[] questionIds;
	private Integer psmId;
	private Integer rank;
	private boolean deleted;
	private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private Date lastModDate;

}
