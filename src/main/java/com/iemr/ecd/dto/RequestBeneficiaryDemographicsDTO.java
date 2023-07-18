package com.iemr.ecd.dto;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestBeneficiaryDemographicsDTO {

	private Long beneficiaryRegID;
	private String addressLine1;
	private Integer stateID;
	private Integer districtID;
	private Integer blockID;
	private Integer districtBranchID;
	private String createdBy;
	private String modifiedBy;
	
}
