package com.iemr.ecd.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.iemr.ecd.dao.CallSectionMapping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CallSectionMappingDTO {
	
	private Integer callConfigId;
	private Integer psmId;
	private String createdBy;
	private List<CallSectionMapping> sections;
	
	

}
