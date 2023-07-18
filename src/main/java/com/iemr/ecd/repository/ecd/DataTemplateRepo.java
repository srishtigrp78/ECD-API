package com.iemr.ecd.repository.ecd;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.ecd.dao.DataTemplate;

@Repository
public interface DataTemplateRepo extends CrudRepository<DataTemplate, Integer>{
	
	DataTemplate findByPsmIdAndFileTypeAndDeleted(Integer psmId, String fileType, Boolean deleted);
	
	

}
