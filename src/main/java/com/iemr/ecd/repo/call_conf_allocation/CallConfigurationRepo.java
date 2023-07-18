package com.iemr.ecd.repo.call_conf_allocation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.CallConfiguration;

@Repository
public interface CallConfigurationRepo extends CrudRepository<CallConfiguration, Long> {

	List<CallConfiguration> findTop10ByDeleted(Boolean deleted);

	CallConfiguration findByCallConfigId(Long callConfigId);

	List<CallConfiguration> findByPsmIdAndDeleted(Integer psmId, Boolean deleted);

	@Query(" SELECT t FROM CallConfiguration AS t WHERE t.psmId=:psmId "
			+ " AND t.effectiveStartDate <= current_date() AND t.effectiveEndDate >= current_date() "
			+ " AND t.callType !='Introductory' AND t.deleted = 0 ")
	public ArrayList<CallConfiguration> getCallConfiguration(@Param("psmId") Integer psmId);

	@Query(" SELECT t FROM CallConfiguration AS t WHERE t.psmId=:psmId AND t.callType=:callType "
			+ " AND t.effectiveStartDate <= current_date() AND t.effectiveEndDate >= current_date() AND t.deleted = 0 ")
	public CallConfiguration getCallConfigurationByProviderAndCallType(@Param("psmId") Integer psmId,
			@Param("callType") String callType);

}
