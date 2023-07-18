package com.iemr.ecd.dao.masters;

import java.sql.Timestamp;

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
@Table(name = "m_userservicerolemapping")
@Entity
public class UserServiceRoleMapping {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USRMappingID", insertable = false)
	private Integer usrMappingId;

	@Column(name = "UserID")
	private Integer userId;

	@Column(name = "RoleID")
	private Integer roleId;

	@Column(name = "AgentID")
	private String agentId;

	@Column(name = "AgentPassword")
	private String agentPassword;

	@Column(name = "CZRole")
	private String czRole;
	
	@Column(name = "ProviderServiceMapID")
	private Integer psmId;


	@Column(name = "WorkingLocationID")
	private Integer workingLocationID;
	
	@Column(name = "ServiceProviderID")
	private Integer serviceProviderId;

	@Column(name = "PreviewWindowTime")
	private Integer previewWindowTime;
	
	@Column(name = "isAutoPreviewDial")
	private Boolean isAutoPreviewDial;
	
	
	@Column(name = "isOutbound")
	private Boolean isOutbound;
	
	@Column(name = "isInbound")
	private Boolean isInbound;

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
	private Boolean isDialPreference;

	


}
