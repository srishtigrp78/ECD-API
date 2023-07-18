package com.iemr.ecd.repo.call_conf_allocation;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.GradeConfiguration;

@Repository
public interface GradeConfigurationRepo extends CrudRepository<GradeConfiguration, Integer> {

	List<GradeConfiguration> findByDeleted(Boolean deleted);

	List<GradeConfiguration> findByPsmId(Integer psmId);

	List<GradeConfiguration> findByPsmIdAndDeleted(Integer psmId, Boolean deleted);

}
