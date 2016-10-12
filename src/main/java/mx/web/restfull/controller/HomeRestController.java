package mx.web.restfull.controller;

import java.util.List;

import mx.web.restfull.model.Test;
import mx.web.restfull.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
	
	@Autowired
	TestService testService;
	
	@RequestMapping(value = "rest/allTest/", method = RequestMethod.GET)
	public ResponseEntity<List<Test>> listAllUsers() {
		List<Test> tests = testService.findAllTest();
		if (tests.isEmpty()) {
			return new ResponseEntity<List<Test>>(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Test>>(tests, HttpStatus.OK);
	}
	
}
