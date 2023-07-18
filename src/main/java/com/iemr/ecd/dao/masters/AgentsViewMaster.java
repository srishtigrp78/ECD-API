package com.iemr.ecd.dao.masters;

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
@Table(name = "v_getAgentsByRoleId")
@Entity
public class AgentsViewMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USRMappingID", insertable = false)
	private Integer usrMappingId;

	@Column(name = "UserID")
	private Integer userId;

	@Column(name = "FirstName")
	private String firstName;

	@Column(name = "MiddleName")
	private String middleName;

	@Column(name = "LastName")
	private String lastName;

	@Column(name = "RoleID")
	private Integer roleId;

	@Column(name = "AgentID")
	private String agentId;

}
