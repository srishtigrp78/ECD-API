package com.iemr.ecd.dao;

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
@Table(name = "v_get_call_section_mapping")
@Entity
public class V_GetCallSectionMapping {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false)
	private Integer id;

	@Column(name = "callconfigid")
	private Integer callConfigId;

	@Column(name = "sectionid")
	private Integer sectionId;

	@Column(name = "callsectionrank")
	private Integer sectionRank;

	@Column(name = "sectionname")
	private String sectionName;

	@Column(name = "ischecked")
	private Boolean isChecked;

	@Column(name = "providerservicemapid")
	private Integer psmId;

	@Column(name = "deleted")
	private Boolean deleted;

}
