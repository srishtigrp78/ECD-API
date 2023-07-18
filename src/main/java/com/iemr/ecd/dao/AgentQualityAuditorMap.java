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
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "m_qualityauditoragentmapping")
@Entity
public class AgentQualityAuditorMap {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false)
	private Integer id;
	
	@Column(name = "QualityAuditorID")
	private Integer qualityAuditorId;
	
	@Column(name = "QualityAuditorName")
	private String qualityAuditorName;
	
	@Column(name = "Roleid")
	private Integer roleId;
	
	@Column(name = "Rolename")
	private String roleName;
	
	@Column(name = "Agentid")
	private Integer agentId;
	
	@Column(name = "AgetName")
	private String agentName;
	
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
	private Integer[] agentIds;
	
	@Transient
	private String[] agentNames;
	

}
