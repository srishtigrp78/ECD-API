package com.iemr.ecd.dao.report;

import java.sql.Timestamp;

import com.google.gson.annotations.Expose;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Table(name = "fact_bencall", schema = "db_reporting")
@Data
public class EcdReport {
	
	@Transient
	String callDuartion ;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Fact_BenCallID")
	private Long factBenCallId;

	@Expose
	@Column(name = "BenCallID")
	private Long benCallId;

	
	@Column(name = "BeneficiaryRegID")
	private Long beneficiaryRegId;

	@Expose
	@Column(name = "CallID")
	private String callId;

	@Expose
	@Column(name = "SessionID")
	private String sessionId;

	@Expose
	@Column(name = "PhoneNo")
	private String phoneNo;

	@Column(name = "ProviderServiceMapID")
	private Integer psmId;

	@Column(name = "CallTypeID")
	private Integer callTypeId;

	@Expose
	@Column(name = "CallTypeName")
	private String callTypeName;

	@Expose
	@Column(name = "CallSubTypeName")
	private String callSubTypeName;

	@Expose
	@Column(name = "CallTime")
	private Timestamp callTime;

	@Expose
	@Column(name = "Remarks")
	private String remarks;

	@Expose
	@Column(name = "CallClosureType")
	private String callClosureType;

	@Expose
	@Column(name = "CallReceivedUserID")
	private Integer agentId;

	@Expose
	@Column(name = "ReceivedRoleName")
	private String role;

	@Expose
	@Column(name = "ReceivedAgentID")
	private String receivedAgentId;	

	@Expose
	@Column(name = "CallEndUserID")
	private Integer callEndUserId;

	@Expose
	@Column(name = "Category")
	private String category;

	@Expose
	@Column(name = "SubCategory")
	private String subCategory;

	@Expose
	@Column(name = "CDICallStatus")
	private String cdiCallStatus;

	@Expose
	@Column(name = "IsOutbound")
	private Boolean isOutbound;

	@Expose
	@Column(name = "IsCalledEarlier")
	private Boolean isCalledEarlier;

	@Column(name = "CreatedBy")
	private String createdBy;

	
	@Column(name = "CreatedDate")
	private Timestamp createdDate;
	
	@Expose
	@Column(name = "CallDuration")
	private String callDuration;
	
	@Expose
	@Column(name = "CZCallDuration")
	private Integer czCallDuration;


	@Transient
	private Timestamp startDate;

	@Transient
	private Timestamp endDate;
	
	

	
	

}
