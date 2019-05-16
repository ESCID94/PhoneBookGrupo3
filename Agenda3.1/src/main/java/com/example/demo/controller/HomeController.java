package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.User;
import com.example.demo.services.IUserService;

/**
 * 
 * The controller
 * @author Lucas
 *
 */
@Controller
public class HomeController {
	
	@Autowired
	private IUserService iuserService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public ModelAndView handleRequest() throws Exception{
		logger.info("---------------------------en Listado");
		List<User> listUsers = iuserService.list();
		ModelAndView model = new ModelAndView("UserList");
		model.addObject("userList", listUsers);
		return model;
	}
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newUser() {
		logger.info("-- en New");
		ModelAndView model = new ModelAndView("UserForm");
		model.addObject("user", new User());
		return model;
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editUser(HttpServletRequest request) {
		logger.info("--en EDIT");
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = iuserService.get(userId);
		ModelAndView model = new ModelAndView("UserForm");
		model.addObject("user" , user);
		return model;
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.GET)
	public ModelAndView deleteUser(HttpServletRequest request) {
		logger.info("-- en Delete");
		int userId = Integer.parseInt(request.getParameter("id"));
		iuserService.delete(userId);
		return new ModelAndView("redirect:/");
	}
	
	 @RequestMapping(value="/save" , method = RequestMethod.POST)
	 public ModelAndView saveUser(@ModelAttribute User user) {
		 logger.info("-- en SAVE");
		 iuserService.add(user);
		 return new ModelAndView("redirect:/");
	 }
}
