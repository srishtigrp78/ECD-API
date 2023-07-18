package com.iemr.ecd.dto.supervisor;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RCHFileUploadDto {

	private int providerServiceMapID;
	private int userID;
	private String createdBy;
	private String fieldFor;
	private String fileName;
	private String fileExtension;
	private String fileContent;

}
