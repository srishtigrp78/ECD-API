package com.iemr.ecd.repository.quality;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.AgentQualityAuditorMap;

@Repository
public interface AgentQualityAuditorMapRepo extends CrudRepository<AgentQualityAuditorMap, Integer> {

	List<AgentQualityAuditorMap> findByPsmId(Integer psmId);

	@Query(value = " CALL Pr_QualityAuditorWorklist(:fDate, :tDate,:psmId, :langId, :agentId, :roleId, :isValid ) ", nativeQuery = true)
	public List<String[]> getQualityAuditorWorklist(@Param("fDate") Timestamp fDate, @Param("tDate") Timestamp tDate,
			@Param("psmId") Integer psmId, @Param("langId") Integer langId, @Param("agentId") Integer agentId,
			@Param("roleId") Integer roleId, @Param("isValid") Boolean isValid);

}
