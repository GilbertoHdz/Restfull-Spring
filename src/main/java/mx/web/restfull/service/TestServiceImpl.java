package mx.web.restfull.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.web.restfull.dao.TestDao;
import mx.web.restfull.model.Test;

@Service("testService")
public class TestServiceImpl implements TestService {
	
	@Autowired
	TestDao testDAO;

	public List<Test> findAllTest() {
		// TODO Auto-generated method stub
		List<Test> list = testDAO.findAll();
		return list;
	}

	public Test findTodoById(Integer id) {
		// TODO Auto-generated method stub
		Test t = testDAO.findById(id);
		return t;
	}
	
	


	
}
