package com.iemr.ecd.repository.report;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.report.EcdReport;
@Repository
public interface EcdReportRepo extends CrudRepository<EcdReport, Long> {
	
	@Query(value="call db_reporting.Pr_ECDCallDetailsReport(:startDate,:endDate,:agentId,:psmId)", nativeQuery=true)
	public List<Object[]> getCallDetailsReport(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId);
	
	@Query(value="call db_reporting.Pr_ECDCallSummaryReport(:startDate,:endDate,:agentId,:psmId,:role)", nativeQuery=true)
	public List<Object[]> getCallSummaryReport(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId, @Param("role") String role);
	
	@Query(value="call db_reporting.Pr_ECDCumulativeDistrictReport(:startDate,:endDate,:agentId,:psmId,:role)", nativeQuery=true)
	public List<Object[]> getCumulativeDistrictReport(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId, @Param("role") String role);
	
	@Query(value="call db_reporting.Pr_ECDBeneficiarywisefollowupdetails(:startDate,:endDate,:agentId,:psmId)", nativeQuery=true)
	public List<Object[]> getBeneficiarywisefollowupdetails(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId);
	
	@Query(value="call db_reporting.Pr_ECDCallUniqueDetailsReport(:startDate,:endDate,:agentId,:psmId)", nativeQuery=true)
	public List<Object[]> getCallDetailReportUnique(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId);
	
	@Query(value="call db_reporting.Pr_ECDBirthDefectReport(:startDate,:endDate,:agentId,:psmId)", nativeQuery=true)
	public List<Object[]> getBirthDefectReport(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId);
	
	@Query(value="call db_reporting.Pr_ECDAashaHomeVisitGapReport(:startDate,:endDate,:agentId,:psmId)", nativeQuery=true)
	public List<Object[]> getAashaHomeVisitGapReport(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId);
	
	@Query(value="call db_reporting.Pr_ECDCalciumIFATabNonadherenceReport(:startDate,:endDate,:agentId,:psmId)", nativeQuery=true)
	public List<Object[]> getCalciumIFATabNonadherenceReport(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId);
	
	@Query(value="call db_reporting.Pr_ECDAbsenceInVHSNDReport(:startDate,:endDate,:agentId,:psmId)", nativeQuery=true)
	public List<Object[]> getAbsenceInVHSNDReport(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId);
	
	@Query(value="call db_reporting.Pr_ECDVaccineDropOutIdentifiedReport(:startDate,:endDate,:agentId,:psmId)", nativeQuery=true)
	public List<Object[]> getVaccineDropOutIdentifiedReport(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId);
	
	@Query(value="call db_reporting.Pr_ECDVaccineLeftOutIdentifiedReport(:startDate,:endDate,:agentId,:psmId)", nativeQuery=true)
	public List<Object[]> getVaccineLeftOutIdentifiedReport(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId);
	
	@Query(value="call db_reporting.Pr_ECDDevelopmentalDelayReport(:startDate,:endDate,:agentId,:psmId)", nativeQuery=true)
	public List<Object[]> getDevelopmentalDelayReport(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId);
	
	@Query(value="call db_reporting.Pr_ECDAbortionReport(:startDate,:endDate,:agentId,:psmId)", nativeQuery=true)
	public List<Object[]> getAbortionReport(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId);
	
	@Query(value="call db_reporting.Pr_ECDDeliveryStatusReport(:startDate,:endDate,:agentId,:psmId)", nativeQuery=true)
	public List<Object[]> getDeliveryStatusReport(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId);
	
	@Query(value="call db_reporting.Pr_ECDHRPWCasesIdentifiedReport(:startDate,:endDate,:agentId,:psmId)", nativeQuery=true)
	public List<Object[]> getHRPWCasesIdentifiedReport(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId);
	
	@Query(value="call db_reporting.Pr_ECDInfantsHighRiskReport(:startDate,:endDate,:agentId,:psmId)", nativeQuery=true)
	public List<Object[]> getInfantsHighRiskReport(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId);
	
	@Query(value="call db_reporting.Pr_ECDMaternalDeathReport(:startDate,:endDate,:agentId,:psmId)", nativeQuery=true)
	public List<Object[]> getMaternalDeathReport(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId);
	
	@Query(value="call db_reporting.Pr_ECDStillBirthReport(:startDate,:endDate,:agentId,:psmId)", nativeQuery=true)
	public List<Object[]> getStillBirthReport(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId);
	
	@Query(value="call db_reporting.Pr_ECDBabyDeathReport(:startDate,:endDate,:agentId,:psmId)", nativeQuery=true)
	public List<Object[]> getBabyDeathReport(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId);
	
	@Query(value="call db_reporting.Pr_ECDNotConnectedPhonelistDiffformatReport(:startDate,:endDate,:agentId,:psmId)", nativeQuery=true)
	public List<Object[]> getNotConnectedPhonelistDiffformatReport(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId);
	
	@Query(value="call db_reporting.Pr_ECDJSYRelatedComplaintsReport(:startDate,:endDate,:agentId,:psmId)", nativeQuery=true)
	public List<Object[]> getJSYRelatedComplaintsReport(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId);
	
	@Query(value="call db_reporting.Pr_ECDMiscarriageReport(:startDate,:endDate,:agentId,:psmId)", nativeQuery=true)
	public List<Object[]> getMiscarriageReport(@Param("startDate") Timestamp startDate,
			@Param("endDate") Timestamp endDate, @Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId);

}
