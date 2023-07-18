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
public class RequestSectionQuestionnaireMappingDTO {

	private int sectionId;
	private String createdBy;
	private int psmId;
	private Integer id;
	private Integer rank;
	private String modifiedBy;
	private Boolean deleted;

	private List<Questionnaire> questionIds;

}
