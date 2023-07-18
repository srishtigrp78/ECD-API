package com.iemr.ecd.dto;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class ResponseAutoPreviewDialingDTO {
	
	private Boolean isAutoPreviewDial;
	private Integer previewWindowTime;

}
