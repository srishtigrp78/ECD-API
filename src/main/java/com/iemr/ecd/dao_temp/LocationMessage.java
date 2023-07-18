package com.iemr.ecd.dao_temp;

import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "m_notification")
public class LocationMessage {
    
	@Column(name = "NotificationID")
	private Long locationId;
	
	@Column(name = "ValidFrom")
	private Timestamp validFrom;
	
	@Column(name = "ValidTill")
	private Timestamp validTo;
	
	@Column(name = "Notification")
	private String subject;
	
	@Column(name = "NotificationDesc")
	private String message;

	@Column(name = "ProviderServiceMapID")
	private Integer psmId;
	
	private Integer[] workLocationId;
	
//	private String cluster;

	
	@Column(name = "Deleted")
	private Boolean deleted;
	
	@Column(name = "CreatedBy")
	private String createdBy;
	
	@Column(name = "CreatedDate")
	private Timestamp createdDate;
	
	@Column(name = "ModifiedBy")
	private String modifiedBy;
	
	@Column(name = "LastModDate")
	private Date lastModDate;

}
