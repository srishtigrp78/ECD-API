package com.iemr.ecd.service.report;

import java.io.ByteArrayInputStream;

public interface ReportService {
	
	public ByteArrayInputStream getCallDetailsReport(String request, String filename) throws Exception;
	public ByteArrayInputStream getCallSummaryReport(String request, String filename) throws Exception;
	public ByteArrayInputStream getCumulativeDistrictReport(String request, String filename) throws Exception;
	public ByteArrayInputStream getBeneficiarywisefollowupdetails(String request, String filename) throws Exception;
	public ByteArrayInputStream getBirthDefectReport(String request, String filename) throws Exception;
	public ByteArrayInputStream getAashaHomeVisitGapReport(String request, String filename) throws Exception;
	public ByteArrayInputStream getCalciumIFATabNonadherenceReport(String request, String filename) throws Exception;
	public ByteArrayInputStream getAbsenceInVHSNDReport(String request, String filename) throws Exception;
	public ByteArrayInputStream getVaccineDropOutIdentifiedReport(String request, String filename) throws Exception;
	public ByteArrayInputStream getVaccineLeftOutIdentifiedReport(String request, String filename) throws Exception;
	public ByteArrayInputStream getCallDetailReportUnique(String request, String filename) throws Exception;
	public ByteArrayInputStream getDevelopmentalDelayReport(String request, String filename) throws Exception;
	public ByteArrayInputStream getAbortionReport(String request, String filename) throws Exception;
	public ByteArrayInputStream getDeliveryStatusReport(String request, String filename) throws Exception;
	public ByteArrayInputStream getHRPCasesIdentifiedReport(String request, String filename) throws Exception;
	public ByteArrayInputStream getInfantsHighRiskReport(String request, String filename) throws Exception;
	public ByteArrayInputStream getMaternalDeathReport(String request, String filename) throws Exception;
	public ByteArrayInputStream getStillBirthReport(String request, String filename) throws Exception;
	public ByteArrayInputStream getBabyDeathReport(String request, String filename) throws Exception;
	public ByteArrayInputStream getNotConnectedPhonelistDiffformatReport(String request, String filename) throws Exception;
	public ByteArrayInputStream getJSYRelatedComplaintsReport(String request, String filename) throws Exception;
	public ByteArrayInputStream getMiscarriageReport(String request, String filename) throws Exception;

}
