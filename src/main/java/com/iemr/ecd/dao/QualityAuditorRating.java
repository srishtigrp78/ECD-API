package com.iemr.ecd.dao;

import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.stereotype.Component;

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
@Table(name = "t_qualityauditorrating")
@Entity
public class QualityAuditorRating {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false)
	private Long id;
	
	@Column(name = "BenCallID")
	private Long benCallId;
	
	@Column(name = "Agentid")
	private Integer agentId;
	
	@Column(name = "QualityAuditorid")
	private Integer qualityAuditorId;
	
	@Column(name = "Gradeid")
	private Integer gradeId;
	
	@Column(name = "Grade")
	private String finalGrade;
	
	@Column(name = "FinalScore")
	private Integer finalScore;
	
	@Column(name = "CallRemarks")
	private String callRemarks;
	
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
	

}
