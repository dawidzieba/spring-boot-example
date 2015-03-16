package pl.example.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BaseController {

	Integer counter = 0;
	
	private Integer userCounter(){
		return ++counter;
	}

	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public String welcomName(ModelMap model, @PathVariable String name) {
		model.addAttribute("message", name);
		model.addAttribute("userCounter", userCounter());
		return "index";
	}
}
