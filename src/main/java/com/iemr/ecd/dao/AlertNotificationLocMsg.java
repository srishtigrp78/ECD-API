package com.iemr.ecd.dao;

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
@Table(name = "m_notification")
@Entity
public class AlertNotificationLocMsg {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NotificationID", insertable = false)
	private Long id;

	@Column(name = "NotificationTypeID")
	private Integer typeId;

	@Column(name = "ValidFrom")
	private Timestamp validFrom;

	@Column(name = "ValidTill")
	private Timestamp validTo;

	@Column(name = "Notification")
	private String subject;

	@Column(name = "NotificationDesc")
	private String message;

//	private String cluster;

	@Column(name = "ProviderServiceMapID")
	private Integer psmId;

	@Column(name = "RoleID")
	private Integer roleId;

	@Column(name = "WorkingLocationID")
	private Integer workingLocationID;
	
	@Column(name = "WorkingLocationIDS")
	private String workingLocationIds;

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
	private Integer[] officeId;

	
	
	
	
	

}
