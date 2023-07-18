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
@Table(name = "m_usernotificationmap")
@Entity
public class UserNotificationMap {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserNotificationMapID", insertable = false)
	private Long id;

	@Column(name = "NotificationID")
	private Long notificationId;
	@Column(name = "UserID")
	private Integer userId;

	@Column(name = "RoleID")
	private Integer roleId;

	@Column(name = "NotificationState")
	private String notificationState;

	@Column(name = "NotificationTypeID")
	private Integer notificationTypeID;

	@Column(name = "ProviderServiceMapID")
	private Integer providerServiceMapID;

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
