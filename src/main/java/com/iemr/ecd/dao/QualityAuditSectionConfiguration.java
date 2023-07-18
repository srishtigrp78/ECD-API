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
@Table(name = "m_qualityauditsection")
@Entity
public class QualityAuditSectionConfiguration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false)
	private Integer sectionId;
	
	@Column(name = "Name")
	private String sectionName;
	
	@Column(name = "SectionRank")
	private Integer rank;
	
	@Column(name = "SectionDesc")
	private String sectionDesc;
	
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
