package com.iemr.ecd.dao.masters;

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
@Table(name = "m_role")
@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RoleID", insertable = false)
	private Integer roleId;

	@Column(name = "RoleName")
	private String roleName;

	@Column(name = "RoleDesc")
	private String roleDesc;

	@Column(name = "RoleFor")
	private Integer roleFor;

	@Column(name = "Feature")
	private String feature;

	@Column(name = "ProviderServiceMapID")
	private Integer psmId;
	
	@Column(name = "isWrapUpTime")
	private Boolean isWrapUpTime;
	
	@Column(name = "Wrapuptime")
	private Integer wrapUpTime;


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
