package mx.web.restfull.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import mx.web.restfull.model.Test;

import org.springframework.stereotype.Repository;

@Repository("testDAO")
public class TestDaoImpl implements TestDao {
	
	private Map<Integer, Test> dataStore = new HashMap<Integer, Test>();
	private static final AtomicInteger counter = new AtomicInteger();
	
	public TestDaoImpl(){
		loadDataStore();
	}
	
	private void loadDataStore(){
		dataStore.put(counter.incrementAndGet(), new Test(counter.incrementAndGet(), "admin", "admin@abc.com", "123"));
		dataStore.put(counter.incrementAndGet(), new Test(counter.incrementAndGet(), "Sam", "test2@abc.com", "123"));
		dataStore.put(counter.incrementAndGet(), new Test(counter.incrementAndGet(), "Tomy", "test1@abc.com", "123"));
		dataStore.put(counter.incrementAndGet(), new Test(counter.incrementAndGet(), "TiroLoco", "test3@abc.com", "123"));
	}

	
	public List<Test> findAll() {
		// TODO Auto-generated method stub
		ArrayList<Test> lista = new ArrayList<Test>();
		lista.addAll(dataStore.values());
		return lista;
	}

	public Test findById(Integer id) {
		// TODO Auto-generated method stub
		Test t = dataStore.get(id);
		return t;
	}
	
	
}
