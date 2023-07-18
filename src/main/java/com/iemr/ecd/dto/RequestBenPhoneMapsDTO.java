package com.iemr.ecd.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestBenPhoneMapsDTO {
	
	private Integer parentBenRegID;
	private Integer benificiaryRegID;
	private String phoneNo;
	private String createdBy;
	private String modifiedBy;

}
