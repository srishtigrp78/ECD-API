package com.iemr.ecd.dao;

import java.sql.Timestamp;
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
@Table(name = "m_questionnaire")
@Entity
public class Questionnaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QuestionID", insertable = false)
	private Integer questionnaireId;

	@Column(name = "Question")
	private String questionnaire;

	@Column(name = "QuestionTypeID")
	private Integer questionnaireTypeId;

	@Column(name = "QuestionType")
	private String questionnaireType;

	@Column(name = "AnswerType")
	private String answerType;

	@Column(name = "QuestionRank")
	private Integer questionRank;

	@Column(name = "ProviderServiceMapID")
	private Integer psmId;

	@Column(name = "Deleted", insertable = false)
	private Boolean deleted;

	@Column(name = "CreatedBy", updatable = false)
	private String createdBy;

	@Column(name = "CreatedDate", insertable = false, updatable = false)
	private Timestamp createdDate;

	@Column(name = "ModifiedBy")
	private String modifiedBy;

	@Column(name = "LastModDate", insertable = false, updatable = false)
	private Timestamp lastModDate;

	@Transient
	private String[] options;

	@Transient
	private Integer rank;

	@Transient
	private List<QuestionnaireValues> questionnaireValues;

	@Transient
	private Integer secQuesMapId;
}
