package com.iemr.ecd.dao.associate;

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
@Table(name = "t_mctsoutboundcalls")
@Entity
public class OutboundCalls {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OBCallID", insertable = false)
	private Long obCallId;

	@Column(name = "MotherID")
	private Long motherId;

	@Column(name = "ChildID")
	private Long childId;

	@Column(name = "BeneficiaryRegID")
	private Long beneficiaryRegId;

	@Column(name = "AllocatedUserID")
	private Integer allocatedUserId;

	@Column(name = "OutboundCallType")
	private String ecdCallType;

	@Column(name = "DisplayOBCallType")
	private String displayEcdCallType;

	@Column(name = "CallDateFrom")
	private Timestamp callDateFrom;

	@Column(name = "CallDateTo")
	private Timestamp callDateTo;

	@Column(name = "PrefferedCallDate")
	private Timestamp nextCallDate;

	@Column(name = "CallStatus")
	private String callStatus;

	@Column(name = "NoOfTrials")
	private Integer callAttemptNo;

	@Column(name = "AllocationStatus")
	private String allocationStatus;

	@Column(name = "IsSMSSent")
	private Boolean isSMSSent;

	@Column(name = "IsHighRisk")
	private Boolean isHighRisk;

	@Column(name = "HighRisk_Reason")
	private String highRiskReason;

	@Column(name = "IsHrni")
	private Boolean isHrni;

	@Column(name = "Hrni_Reason")
	private String hrniReason;

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

	@Column(name = "phoneNumberType")
	private String phoneNumberType;

}
