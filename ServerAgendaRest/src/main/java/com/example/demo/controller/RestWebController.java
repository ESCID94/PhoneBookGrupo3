package com.example.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Persona;
import com.example.demo.services.AgendaService;

import java.io.Serializable;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({ "/" })
public class RestWebController {

	@Autowired
	private AgendaService service;
	
//	public AgendaService<T, Serializable> (AgendaService service){
//		this.service = service;
//	}

	/**
	 * The Constant logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(RestWebController.class);

//	
//	/**
//	 * Handle request.
//	 * 
//	 * @return The model and view
//	 * @throws Exception the exception
//	 */
//	@RequestMapping("/")
//	public ModelAndView handleRequest() throws Exception {
//		logger.info("---------------------------en Listado de Personas");
//		List<Persona> listPersona = (List<Persona>) service.list();
//		ModelAndView model = new ModelAndView("PersonaList");
//		model.addObject("PersonaList", listPersona);
//		return model;
//	}
//
//	/**
//	 * New Persona
//	 *
//	 *
//	 * @return the model and view
//	 */
//	@RequestMapping(value = "/new", method = RequestMethod.GET)
//	public ModelAndView newPersona() {
//		logger.info("-- en New Persona");
//		ModelAndView model = new ModelAndView("PersonaForm");
//		model.addObject("persona", new Persona());
//		return model;
//	}
//
//	/**
//	 * Edit the Persona
//	 * 
//	 * @param request the request
//	 * @return the model and view
//	 */
//	@RequestMapping(value = "/edit", method = RequestMethod.GET)
//	public ModelAndView editPersona(HttpServletRequest request) {
//		logger.info("-- en Edit Persona");
//		int idpersona = Integer.parseInt(request.getParameter("idpersona"));
//		Persona persona = (Persona) service.get(idpersona);
//		ModelAndView model = new ModelAndView("PersonaForm");
//		model.addObject("persona", persona);
//		return model;
//	}
//
//	/**
//	 * Delete Persona.
//	 *
//	 * @param request the request
//	 * @return the model and view
//	 */
//	@RequestMapping(value = "/delete", method = RequestMethod.GET)
//	public ModelAndView deletePersona(HttpServletRequest request) {
//		logger.info("-- en Delete");
//		int idpersona = Integer.parseInt(request.getParameter("idpersona"));
//		service.delete(idpersona);
//		return new ModelAndView("redirect:/");
//	}
//
//	/**
//	 * Save Persona.
//	 *
//	 * @param user the user
//	 * @return the model and view
//	 */
//	@RequestMapping(value = "/save", method = RequestMethod.POST)
//	public ModelAndView savePersona(@ModelAttribute Persona persona) {
//		logger.info("-- en SAVE");
//		service.add(persona);
//		return new ModelAndView("redirect:/");
//	}
	
	@PostMapping
	public Persona create(@RequestBody Persona persona) {
		return service.add(persona);
	}

	@GetMapping(path = { "/{id}" })
	public Persona findOne(@PathVariable("id") int id) {
		return service.get(id);
	}

	@PutMapping(path = { "/{id}" })
	public Persona update(@PathVariable("id") int id, @RequestBody Persona persona) {
		persona.setIdpersona(id);
		return service.update(persona);
	}

	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id") int id) {
		service.delete(id);
		//Volver al listado de contactos
	}

	@GetMapping
	public List<Persona> findAll() {
		return (List<Persona>) service.list();
	}
}
