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
@Table(name = "m_samplesize")
@Entity
public class SampleSelectionConfiguration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false)
	private Integer id;

	@Column(name = "CycleID")
	private Integer cycleId;
	
	@Column(name = "Cycle")
	private String cycleName;

	@Column(name = "From_Day")
    private Integer fromDay;
	
	@Column(name = "TO_Day")
	private Integer toDay;
	
	@Column(name = "ANC_SampleSize")
	private Integer ancSampleSize;
	
	@Column(name = "PNC_SampleSize")
	private Integer pncSampleSize;
	
	@Column(name = "Total_SampleSize")
	private Integer totalSampleSize;

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
