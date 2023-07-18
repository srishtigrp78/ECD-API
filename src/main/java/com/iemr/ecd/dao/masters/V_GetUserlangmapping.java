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
@Table(name = "v_get_userlangmapping")
@Entity
public class V_GetUserlangmapping {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userlangid", insertable = false)
	private Integer userLangId;

	@Column(name = "userid")
	private Integer userId;

	@Column(name = "languageid")
	private Integer languageId;

	@Column(name = "LanguageName")
	private String languageName;


}
