package com.iemr.ecd.repository.ecd;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.associate.ECDCallResponse;

@Repository
public interface ECDCallResponseRepo extends JpaRepository<ECDCallResponse, Long> {

	@Query(value = "call Pr_GetHRPDetails(:motherId, :childId)", nativeQuery = true)
	List<String[]> getHrpHrniDetailsOld(@Param("motherId") Long motherId, @Param("childId") Long childId);

	@Query(value = " SELECT t FROM ECDCallResponse t WHERE t.motherId=:motherId AND t.reasonsForHrpDB IS NOT NULL ORDER BY 1 DESC ")
	Page<ECDCallResponse> getHrpDetailsMother(Pageable pageable, @Param("motherId") Long motherId);

	@Query(value = " SELECT t FROM ECDCallResponse t WHERE t.childId=:childId AND t.reasonsForHrniDB IS NOT NULL ORDER BY 1 DESC ")
	Page<ECDCallResponse> getHrniDetailsChild(Pageable pageable, @Param("childId") Long childId);

//	@Query(value = "call Pr_GetHRPDetails(:childId)", nativeQuery = true)
//	List<String[]> getHrniDetailsForChild(@Param("childId") Long childId);

}
