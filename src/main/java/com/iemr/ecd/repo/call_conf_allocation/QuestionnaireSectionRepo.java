package com.iemr.ecd.repo.call_conf_allocation;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.QuestionnaireSections;

@Repository
public interface QuestionnaireSectionRepo extends CrudRepository<QuestionnaireSections, Long> {

	List<QuestionnaireSections> findByPsmId(Integer psmIds);
	
	List<QuestionnaireSections> findByPsmIdAndDeleted(Integer psmId, Boolean deleted);

}
