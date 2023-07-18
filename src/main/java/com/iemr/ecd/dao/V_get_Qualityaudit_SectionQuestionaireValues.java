package com.iemr.ecd.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "V_get_Qualityaudit_Sectionquestionairevalues")
@Entity
public class V_get_Qualityaudit_SectionQuestionaireValues {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false)
	private String id;

	@Column(name = "sectionId")
	private Integer sectionId;

	@Column(name = "sectionName")
	private String sectionName;

	@Column(name = "SectionRank")
	private Integer sectionRank;

	@Column(name = "questionId")
	private Integer questionId;

	@Column(name = "Question")
	private String question;

	@Column(name = "QuestionRank")
	private Integer questionRank;

	@Column(name = "optionId")
	private Integer optionId;

	@Column(name = "QuestionValues")
	private String questionValues;

	@Column(name = "Score")
	private Integer score;

	@Column(name = "ProviderServiceMapID")
	private Integer psmId;

}
