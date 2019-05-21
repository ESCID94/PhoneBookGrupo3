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

import com.example.demo.model.Persona;
import com.example.demo.services.IPersonaServicios;

/**
 * The controller
 * 
 * @author Lucas
 *
 */
@Controller
public class HomeController {

	/**
	 * The Ipersona service
	 */
	@Autowired
	private IPersonaServicios ipersonaService;

	/**
	 * The Constant logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Handle request.
	 * 
	 * @return The model and view
	 * @throws Exception the exception
	 */
	@RequestMapping("/")
	public ModelAndView handleRequest() throws Exception {
		logger.info("---------------------------en Listado de Personas");
		List<Persona> listPersona = ipersonaService.list();
		ModelAndView model = new ModelAndView("PersonaList");
		model.addObject("PersonaList", listPersona);
		return model;
	}

	/**
	 * New Persona
	 *
	 *
	 * @return the model and view
	 */
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newPersona() {
		logger.info("-- en New Persona");
		ModelAndView model = new ModelAndView("PersonaForm");
		model.addObject("persona", new Persona());
		return model;
	}

	/**
	 * Edit the Persona
	 * 
	 * @param request the request
	 * @return the model and view
	 */
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editPersona(HttpServletRequest request) {
		logger.info("-- en Edit Persona");
		int idpersona = Integer.parseInt(request.getParameter("idpersona"));
		Persona persona = ipersonaService.get(idpersona);
		ModelAndView model = new ModelAndView("PersonaForm");
		model.addObject("persona", persona);
		return model;
	}

	/**
	 * Delete Persona.
	 *
	 * @param request the request
	 * @return the model and view
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deletePersona(HttpServletRequest request) {
		logger.info("-- en Delete");
		int idpersona = Integer.parseInt(request.getParameter("idpersona"));
		ipersonaService.delete(idpersona);
		return new ModelAndView("redirect:/");
	}

	/**
	 * Save Persona.
	 *
	 * @param user the user
	 * @return the model and view
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView savePersona(@ModelAttribute Persona persona) {
		logger.info("-- en SAVE");
		ipersonaService.add(persona);
		return new ModelAndView("redirect:/");
	}
}
