package com.iemr.ecd.repository.masters;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.masters.Language;

@Repository
public interface LanguageRepo extends CrudRepository<Language, Integer> {
	
	List<Language> findByDeleted(Boolean deleted);

}
