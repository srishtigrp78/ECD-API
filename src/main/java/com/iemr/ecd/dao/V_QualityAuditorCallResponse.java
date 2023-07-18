package com.iemr.ecd.dao;

import java.sql.Timestamp;

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
@Table(name = "v_temp")
@Entity
public class V_QualityAuditorCallResponse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false)
	private Long id;

	@Column(name = "Bencallid")
	private Long benCallId;

	@Column(name = "outboundCallType")
	private String ecdCallType;

	@Column(name = "Sectionid")
	private Integer sectionId;

	@Column(name = "QuestionID")
	private Integer questionId;

	@Column(name = "Answer")
	private String answer;

	@Column(name = "Score")
	private Integer score;

	@Column(name = "ProviderServiceMapID")
	private Integer psmId;

	@Column(name = "Deleted", insertable = false)
	private Boolean deleted;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "CreatedDate", insertable = false, updatable = false)
	private Timestamp createdDate;

	@Column(name = "ModifiedBy")
	private String modifiedBy;

	@Column(name = "LastModDate", insertable = false, updatable = false)
	private Timestamp lastModDate;

	@Column(name = "sectionNameN")
	private String sectionName;

	@Column(name = "Question")
	private String question;

	@Column(name = "SectionRank")
	private Integer sectionRank;

	@Column(name = "QuestionRank")
	private Integer questionRank;

}
