package mx.web.restfull.service;

import java.util.List;

import mx.web.restfull.model.Test;

public interface TestService {
	
	List<Test> findAllTest(); 
	Test findTodoById(Integer id);
}
