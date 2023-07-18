package com.iemr.ecd.dao_temp;

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

@Entity
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "v_getdialpreference")
public class V_GetDialPreference {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USRMappingID")
	private Integer id;

	@Column(name = "UserID")
	private Integer userID;

	@Column(name = "FirstName")
	private String firstName;

	@Column(name = "MiddleName")
	private String middleName;

	@Column(name = "LastName")
	private String lastName;

	@Column(name = "RoleID")
	private Integer roleID;

	@Column(name = "RoleName")
	private String roleName;

	@Column(name = "isAutoPreviewDial")
	private Boolean isAutoPreviewDial;

	@Column(name = "PreviewWindowTime")
	private Integer previewWindowTime;

	@Column(name = "ProviderServiceMapID")
	private Integer psmId;

}