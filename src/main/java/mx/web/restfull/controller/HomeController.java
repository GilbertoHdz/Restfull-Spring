package mx.web.restfull.controller;

import java.util.List;

import mx.web.restfull.model.Test;
import mx.web.restfull.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@Autowired
	TestService testService;
	
	@RequestMapping(value = "test/list", method = RequestMethod.GET)
	String showTodoList(Model model){
		List<Test> list = testService.findAllTest();
		model.addAttribute("tests", list);
        return "home";
    }
	
	
	@RequestMapping(value="test/get/{id}", method=RequestMethod.GET)
	String showEditarUsuarioForm(@PathVariable Integer id, Model model){
		Test test= testService.findTodoById(id);
		model.addAttribute("test", test);
		return "home";
	}
	
}
