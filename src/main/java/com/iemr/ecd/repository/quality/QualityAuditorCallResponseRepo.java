package com.iemr.ecd.repository.quality;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.QualityAuditorCallResponse;

@Repository
public interface QualityAuditorCallResponseRepo extends CrudRepository<QualityAuditorCallResponse, Long> {
	List<QualityAuditorCallResponse> findByBenCallId(Long benCallId);
}
