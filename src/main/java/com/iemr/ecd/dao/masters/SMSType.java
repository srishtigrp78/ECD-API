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
@Table(name = "m_smstype")
@Entity
public class SMSType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SMSTypeID", insertable = false)
	private Integer smsTypeId;

	@Column(name = "SMSType")
	private String smsType;

	@Column(name = "SMSTypeDesc")
	private String smsTypeDesc;
	
	@Column(name = "ServiceID")
	private Integer serviceId;


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