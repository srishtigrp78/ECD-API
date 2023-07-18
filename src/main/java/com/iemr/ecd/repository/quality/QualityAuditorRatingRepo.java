package com.iemr.ecd.repository.quality;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.QualityAuditorRating;

@Repository
public interface QualityAuditorRatingRepo extends CrudRepository<QualityAuditorRating, Long> {

	// change SP name
	@Query(value = "call Pr_trend_overall_quality_rating(:psmId, :frequency, :month)", nativeQuery = true)
	List<String[]> getTrendAnalysisOfCentreOverallQualityRatings(@Param("psmId") Integer psmId,
			@Param("frequency") String frequency, @Param("month") String month);

	@Query(value = "call Pr_actor_wise_quality_rating(:psmId, :roleName, :month)", nativeQuery = true)
	List<String[]> getActorWiseQualityRatings(@Param("psmId") Integer psmId, @Param("roleName") String roleName,
			@Param("month") String month);

	@Query(value = "call Pr_tenture_wise_quality_rating(:psmId, :roleName)", nativeQuery = true)
	List<String[]> getTenureWiseQualityRatings(@Param("psmId") Integer psmId, @Param("roleName") String roleName);

	@Query(value = "call Pr_grade_wise_agent_count(:psmId, :frequency, :frequencyValue)", nativeQuery = true)
	List<String[]> getGradeWiseAgentCount(@Param("psmId") Integer psmId, @Param("frequency") String frequency,
			@Param("frequencyValue") String frequencyValue);

	QualityAuditorRating findByBenCallId(Long benCallId);

	// not suggested, please write the query with correct JPA approach - Neeraj
	@Query(value = "SELECT * FROM t_qualityauditorrating WHERE Agentid = :agentId AND ProviderServiceMapID = :psmId ORDER BY LastModDate DESC LIMIT 3", nativeQuery = true)
	List<QualityAuditorRating> getLatestRatingsByAgentIdAndPsmId(@Param("agentId") Integer agentId,
			@Param("psmId") Integer psmId);

}
