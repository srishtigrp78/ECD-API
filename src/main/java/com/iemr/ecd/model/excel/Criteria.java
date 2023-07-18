package com.iemr.ecd.model.excel;

import lombok.Data;

@Data
public class Criteria {
	
	String Start_Date;
	String End_Date;
	String Agent_Id;
	String Role;
	
	public String getAgent_Id() {
		return Agent_Id;
	}

	public void setAgent_Id(String agent_Id) {
		Agent_Id = agent_Id;
	}

	public String getStart_Date() {
		return Start_Date;
	}

	public void setStart_Date(String start_Date) {
		Start_Date = start_Date;
	}

	public String getEnd_Date() {
		return End_Date;
	}

	public void setEnd_Date(String end_Date) {
		End_Date = end_Date;
	}

	public String getRole() {
		return Role;
	}

	public void setType(String role) {
		Role = role;
	}

}
