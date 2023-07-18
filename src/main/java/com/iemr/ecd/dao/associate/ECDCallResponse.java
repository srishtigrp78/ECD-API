package com.iemr.ecd.dao.associate;

import java.sql.Timestamp;

import com.iemr.ecd.dao.QuestionnaireSections;

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
@Table(name = "t_mctscallresponse")
@Entity
public class ECDCallResponse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MctsCallResponseID", insertable = false)
	private Long ecdCallResponseId;

	@Column(name = "MotherID")
	private Long motherId;

	@Column(name = "ChildID")
	private Long childId;

	@Column(name = "CallDetailID")
	private Long callDetailID;

	@Column(name = "BenCallID")
	private Long benCallId;

	@Column(name = "obcallid")
	private Long obCallId;

	@Column(name = "outboundCallType")
	private String ecdCallType;

	@Column(name = "QuestionID")
	private Integer questionId;

	@Column(name = "SectionID")
	private Integer sectionId;

	@Column(name = "Question")
	private String question;

	@Column(name = "Answer")
	private String answer;

	@Column(name = "ReasonsforHrni")
	private String reasonsForHrniDB;

	@Column(name = "OtherHrni")
	private String otherHrni;

	@Column(name = "CongentialAnomalies")
	private String congentialAnomaliesDB;

	@Column(name = "OtherCongentialAnomalies")
	private String otherCongentialAnomalies;

	@Column(name = "ProbableCauseOfDefect")
	private String probableCauseOfDefect;

	@Column(name = "ReasonsForHrp")
	private String reasonsForHrpDB;

	@Column(name = "OtherHrpReason")
	private String otherHrpReason;

	@Column(name = "Remarks")
	private String remarks;
	
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
	@Transient
	private String[] reasonsForHrp;
	@Transient
	private String[] reasonsForHrni;
	@Transient
	private String[] congentialAnomalies;
	

}
