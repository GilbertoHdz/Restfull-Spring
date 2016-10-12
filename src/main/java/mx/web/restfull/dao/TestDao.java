package mx.web.restfull.dao;

import java.util.List;

import mx.web.restfull.model.Test;

public interface TestDao {
	
	List<Test> findAll();
	Test findById(Integer id);
	
}
