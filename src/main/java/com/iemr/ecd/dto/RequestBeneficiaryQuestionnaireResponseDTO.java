package com.iemr.ecd.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.iemr.ecd.dao.associate.ECDCallResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestBeneficiaryQuestionnaireResponseDTO {
	
	private Long obCallId;
	private Long motherId;
	private Long childId;
	private String ecdCallType;
	private String callId;
	private Long benCallId;
	private Integer psmId;
	private String createdBy;
	private List<ECDCallResponse> questionnaireResponse;

}
