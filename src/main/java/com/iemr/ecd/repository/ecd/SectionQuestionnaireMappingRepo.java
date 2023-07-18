package com.iemr.ecd.repository.ecd;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.SectionQuestionnaireMapping;

@Repository
public interface SectionQuestionnaireMappingRepo extends CrudRepository<SectionQuestionnaireMapping, Integer> {
	List<SectionQuestionnaireMapping> findByPsmIdAndDeleted(int psmId, boolean deleted);
}
