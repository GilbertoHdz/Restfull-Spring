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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView showEditarUsuarioForm(@PathVariable Integer id){
		ModelAndView model = new ModelAndView();
		Test test= testService.findTodoById(id);
		model.addObject("test", test);
		  model.setViewName("/home");//login
		return model;
	}
	
}
