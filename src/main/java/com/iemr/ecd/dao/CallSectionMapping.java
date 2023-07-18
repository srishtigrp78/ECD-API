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
@Table(name = "m_callsectionmapping")
@Entity
public class CallSectionMapping {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", insertable = false)
	private Integer id;
	
	@Column(name = "callConfigId")
	private Integer callConfigId;
	
	@Column(name = "SectionID")
	private Integer sectionId;
	
	
	@Column(name = "CallSectionRank")
	private Integer sectionRank;

	@Column(name = "OutboundCallType")
	private String outboundCallType;
	
	@Column(name = "IsChecked")
	private Boolean isChecked;

	@Column(name = "ProviderServiceMapID")
	private Integer psmId;

	@Column(name = "Deleted")
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
