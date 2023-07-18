package com.iemr.ecd.repo.call_conf_allocation;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.Questionnaire;

@Repository
public interface EcdQuestionnaireRepo extends CrudRepository<Questionnaire, Integer> {

	List<Questionnaire> findByPsmId(Integer psmId);

	Questionnaire findByQuestionnaireId(int qId);

	@Query(value = " select q.* from m_questionnaire q "
			+ " left join m_sectionqamapping s on s.questionid=q.questionid and s.ProviderServiceMapID=q.ProviderServiceMapID"
			+ " where q.deleted is false and s.sectionid is null AND q.ProviderServiceMapID =:psmId ", nativeQuery = true)
	public List<Questionnaire> getUnMappedQuestionnairesByPSMId(@Param("psmId") Integer psmId);

	@Query(value = " SELECT q.*\r\n"
			+ "FROM m_questionnaire q\r\n"
			+ "LEFT JOIN m_sectionqamapping s ON s.questionid = q.questionid AND s.ProviderServiceMapID = q.ProviderServiceMapID\r\n"
			+ "WHERE q.deleted = false\r\n"
			+ "  AND q.ProviderServiceMapID = :psmId\r\n"
			+ "  AND q.questionid NOT IN (\r\n"
			+ "    SELECT questionid\r\n"
			+ "    FROM m_sectionqamapping\r\n"
			+ "    WHERE sectionid = :sectionId\r\n"
			+ "      AND ProviderServiceMapID = q.ProviderServiceMapID\r\n"
			+ "  ) ", nativeQuery = true)
	public List<Questionnaire> getUnMappedQuestionnaires(@Param("psmId") Integer psmId,
			@Param("sectionId") Integer sectionId);
}
