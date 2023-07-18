package com.iemr.ecd.repo.call_conf_allocation;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.associate.MotherRecord;

import jakarta.transaction.Transactional;

@Repository
public interface MotherRecordRepo extends CrudRepository<MotherRecord, Long> {

//	@Query(" SELECT m FROM MotherRecord m WHERE m.isAllocated is false AND date(m.createdDate) BETWEEN "
//			+ " date(:fDate) AND date(:tDate)")
//	public List<MotherRecord> getMotherRecordForAllocation(@Param("fDate") Timestamp fDate,
//			@Param("tDate") Timestamp tDate);

	public List<MotherRecord> findByIsAllocatedAndWhomPhoneNoAndCreatedDateBetween(Boolean isAllocated,
			String phoneType, Timestamp fromDate, Timestamp toDate);

	@Query(value = " SELECT * FROM t_mothervalidrecord WHERE IsAllocated is false AND "
			+ " CreatedDate BETWEEN :fDate AND :tDate AND PhoneNo_Of_Whom =:phoneType LIMIT :recordLimit ", nativeQuery = true)
	public List<MotherRecord> getMotherRecordForAllocation(@Param("fDate") Timestamp fDate,
			@Param("tDate") Timestamp tDate, @Param("phoneType") String phoneType,
			@Param("recordLimit") int recordLimit);

	@Modifying
	@Transactional
	@Query(" UPDATE MotherRecord SET isAllocated = true WHERE ecdIdNo IN :motherId ")
	public int updateIsAllocatedStatus(@Param("motherId") List<Long> motherId);

	// get eligible introductory Records
	@Query(value = " SELECT COUNT(1) FROM MotherRecord as t WHERE t.isAllocated=:isAllocated AND "
			+ " t.createdDate >=:fDate AND t.createdDate <=:tDate AND t.whomPhoneNo=:whomPhoneNo  ")
	public int getRecordCount(@Param("isAllocated") Boolean isAllocated, @Param("fDate") Timestamp fDate,
			@Param("tDate") Timestamp tDate, @Param("whomPhoneNo") String whomPhoneNo);

	@Modifying
	@Transactional
	@Query(" UPDATE MotherRecord SET beneficiaryRegID = :beneficiaryRegID, motherName = :motherName, husbandName = :husbandName, whomPhoneNo = :whomPhoneNo, phoneNo = :phoneNo, "
			+ "lmpDate = :lmpDate, edd = :edd, address = :address, ashaName = :ashaName, ashaPh = :ashaPh, anmName = :anmName, anmPh = :anmPh, PHCName = :PHCName, blockName = :blockName WHERE ecdIdNo = :motherId ")
	public int updateBeneficiaryRegIdForMother(@Param("beneficiaryRegID") Long beneficiaryRegID,
			@Param("motherId") Long motherId, @Param("motherName") String motherName,
			@Param("husbandName") String husbandName, @Param("whomPhoneNo") String whomPhoneNo,
			@Param("phoneNo") String phoneNo, @Param("lmpDate") Timestamp lmpDate, @Param("edd") Timestamp edd,
			@Param("address") String address, @Param("ashaName") String ashaName, @Param("ashaPh") String ashaPh, @Param("anmName") String anmName,
			@Param("anmPh") String anmPh, @Param("PHCName") String PHCName, @Param("blockName") String blockName);

	@Modifying
	@Transactional
	@Query(" UPDATE MotherRecord SET motherName = :motherName, husbandName = :husbandName, whomPhoneNo = :whomPhoneNo, phoneNo = :phoneNo, "
			+ "lmpDate = :lmpDate, edd = :edd, address = :address, ashaName = :ashaName, ashaPh = :ashaPh, anmName = :anmName, anmPh = :anmPh, PHCName = :PHCName, blockName = :blockName WHERE ecdIdNo = :motherId AND beneficiaryRegID = :beneficiaryRegID")
	public int updateBeneficiaryDetails(@Param("beneficiaryRegID") Long beneficiaryRegID,
			@Param("motherId") Long motherId, @Param("motherName") String motherName,
			@Param("husbandName") String husbandName, @Param("whomPhoneNo") String whomPhoneNo,
			@Param("phoneNo") String phoneNo, @Param("lmpDate") Timestamp lmpDate, @Param("edd") Timestamp edd,
			@Param("address") String address, @Param("ashaName") String ashaName, @Param("ashaPh") String ashaPh, @Param("anmName") String anmName,
			@Param("anmPh") String anmPh, @Param("PHCName") String PHCName, @Param("blockName") String blockName);

	public MotherRecord findByEcdIdNo(Long motherId);

	@Modifying
	@Transactional
	@Query(" UPDATE MotherRecord SET isAllocated = false WHERE ecdIdNo IN :motherId ")
	public int updateIsAllocatedFalse(@Param("motherId") List<Long> motherId);

}