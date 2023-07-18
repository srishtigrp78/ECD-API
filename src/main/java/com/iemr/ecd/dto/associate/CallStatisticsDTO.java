package com.iemr.ecd.dto.associate;

import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class CallStatisticsDTO {
	
	private Integer totalCallsAnswered;
	private Integer totalCallsVerified;

}
