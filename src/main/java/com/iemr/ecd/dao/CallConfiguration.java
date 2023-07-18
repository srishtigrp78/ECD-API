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
@Table(name = "m_mctscallconfiguration")
@Entity
public class CallConfiguration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MCTSCallConfigID", insertable = false)
	private Long callConfigId;

	@Column(name = "OutboundCallType")
	private String callType;

	@Column(name = "DisplayOBCallType")
	private String displayName;

	@Column(name = "BaseLine")
	private String baseLine;

	@Column(name = "TermRange")
	private Integer termRange;

	@Column(name = "EffectiveFrom")
	private Timestamp effectiveStartDate;

	@Column(name = "EffectiveUpto")
	private Timestamp effectiveEndDate;

	@Column(name = "ConfigTerms")
	private String configTerms;

	@Column(name = "NoOfAttempts")
	private Integer noOfAttempts;

	@Column(name = "NextAttemptPeriod")
	private Integer nextAttemptPeriod;

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

	@Column(name = "ConfigId")
	private Long configId;

}
