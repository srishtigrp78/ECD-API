package com.iemr.ecd.repository.ecd;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao_temp.V_GetDialPreference;

@Repository
public interface V_GetDialPreferenceRepo extends CrudRepository<V_GetDialPreference, Integer> {
	List<V_GetDialPreference> findByPsmId(Integer psmId);
}
