package com.iemr.ecd.repository.quality;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.V_QualityAuditorCallResponse;

@Repository
public interface V_QualityAuditorCallResponseRepo extends CrudRepository<V_QualityAuditorCallResponse, Long> {
	List<V_QualityAuditorCallResponse> findByBenCallId(Long benCallId);
}
