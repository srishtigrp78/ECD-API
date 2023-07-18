package com.iemr.ecd.dto;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestCallAllocationDTO {

	private Integer[] fromUserIds;
	private Integer[] toUserIds;
	private Integer userId;
	private Integer noOfCalls;
	private Integer roleId;
	private String roleName;

	private String fDate;
	private String tDate;
	
	@Schema(hidden = true)
	private Timestamp fromDate;
	private Timestamp toDate;

	private String recordType;
	private String phoneNoType;

	private Integer providerServiceMapId;
	private Integer psmId;
	private String createdBy;

	private Boolean isIntroductory;

}
