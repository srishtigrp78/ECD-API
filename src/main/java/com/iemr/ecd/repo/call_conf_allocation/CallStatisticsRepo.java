package com.iemr.ecd.repo.call_conf_allocation;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.associate.Bencall;


@Repository
public interface CallStatisticsRepo extends CrudRepository<Bencall, Long>{
	
	@Query(value = "SELECT * FROM t_bencall WHERE ReceivedAgentID = :agentId AND createdDate = CURRENT_DATE() order by 1 desc", nativeQuery = true)
	List<Bencall> getCallCurrentDateStatistics(@Param("agentId") String agentId);

}
