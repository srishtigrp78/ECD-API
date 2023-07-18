package com.iemr.ecd.dto;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Component;

import com.iemr.ecd.dao.QuestionnaireSections;

import lombok.Data;

@Component
@Data
public class MapCallAndSectionDTO {

	private Long id;
	private Long callConfigId;
	private Integer sectionId;
	private String sectionName;
	private Integer sectionRank;

	private Integer psmId;
	private Boolean deleted;
	private String createdBy;
	private Timestamp createdDate;
	private String modifiedBy;
	private Date lastModDate;
}
