package com.iemr.ecd.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.iemr.ecd.dao.Questionnaire;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseSectionQuestionnaireMappingDTO {
	private int sectionId;
	private String sectionName;
	private String createdBy;
	private int psmId;

	private String modifiedBy;
	private Boolean deleted;

	private List<Questionnaire> questionIds;
}
