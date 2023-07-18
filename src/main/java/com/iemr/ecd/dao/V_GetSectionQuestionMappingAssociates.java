package com.iemr.ecd.dao;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "v_get_section_question_mapping_associate")
@Entity
public class V_GetSectionQuestionMappingAssociates {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false)
	private Integer id;

	@Column(name = "ProviderServiceMapID")
	private Integer psmId;

	@Column(name = "Sectionid")
	private Integer sectionid;
	@Column(name = "sectionName")
	private String sectionName;
	@Column(name = "SectionQuestionRank")
	private Integer sectionQuestionRank;

	@Column(name = "Questionid")
	private Integer questionid;
	@Column(name = "Question")
	private String question;
	@Column(name = "QuestionRank")
	private Integer questionRank;

	@Column(name = "QuestionTypeID")
	private Integer questionTypeID;
	@Column(name = "QuestionType")
	private String questionType;
	@Column(name = "deleted")
	private Boolean deleted;

	@Column(name = "CallSectionRank")
	private Integer callSectionRank;
	@Column(name = "AnswerType")
	private String answerType;

	@Column(name = "callConfigId")
	private Integer callConfigId;

	@Transient
	private List<QuestionnaireValues> options;
	@Transient
	private String[] optionsArr;
}
