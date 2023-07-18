package com.iemr.ecd.dao;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

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
@Table(name = "t_mctsoutboundcalls")
@Entity
public class CallAllocation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OBCallID", insertable = false)
	private Long callAllocationId;
    
//	@Transient
	private String recordType;
//	@Transient
	private String phoneNoType;
    
	@Column(name = "CallDateFrom")
	private Timestamp fDate;
	
	@Column(name = "CallDateTo")
	private Timestamp tDate;
    
	@Column(name = "NoOfTrials")
	private Integer noOfCalls;
	
	private Integer[] toUserIds;
	
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

}
