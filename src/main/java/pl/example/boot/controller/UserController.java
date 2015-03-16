package pl.example.boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pl.example.boot.model.User;

@Controller
public class UserController {

	private List<User> users = new ArrayList<User>();
	
	@ModelAttribute("user")
	public User contructUser() {
		return new User();
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String getUsers(ModelMap model) {
		model.addAttribute("users", users);
		return "user/list";
	}
		
	@RequestMapping(value = "/users/add", method = RequestMethod.GET)
	public String addUser() {
		return "user/add";
	}
	
	@RequestMapping(value = "/users/add", method = RequestMethod.POST)
	public String processAddUser(@ModelAttribute("user") User user, ModelMap model) {
		users.add(user);
		return "redirect:/users";
	}
	
	/*@RequestMapping(value = "/users/add", method = RequestMethod.GET)
	public ModelAndView addUser() {
		return new ModelAndView("/user/add", "user", new User());
	}*/
}
