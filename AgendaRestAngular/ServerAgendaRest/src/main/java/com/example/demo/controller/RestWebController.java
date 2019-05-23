package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Persona;
import com.example.demo.services.AgendaService;
import java.util.List;
// TODO: Auto-generated Javadoc

/**
 * The Class RestWebController.
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({ "/personas" })
@Component
public class RestWebController {

	/** The service. */
	@Autowired
	private AgendaService service;

	/** The Constant logger. */
	@SuppressWarnings(value = { "unused" })
	private static final Logger logger = LoggerFactory.getLogger(RestWebController.class);

	/**
	 * Creates the.
	 *
	 * @param persona the persona
	 * @return the persona
	 */
	@PostMapping
	public Persona create(@RequestBody Persona persona) {
		return service.add(persona);
	}

	/**
	 * Find one.
	 *
	 * @param id the id
	 * @return the persona
	 */
	@GetMapping(path = { "/{id}" })
	public Persona findOne(@PathVariable("id") int id) {
		return service.get(id);
	}

	/**
	 * Update.
	 *
	 * @param persona the persona
	 * @return the persona
	 */
	@PutMapping
	public Persona update(@RequestBody Persona persona) {
		persona.setIdpersona(persona.getIdpersona());
		return service.update(persona);
	}

	/**
	 * Delete.
	 *
	 * @param id the id
	 */
	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id") int id) {
		service.delete(id);
		// Volver al listado de contactos
	}

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	@GetMapping
	public List<Persona> findAll() {
		return (List<Persona>) service.list();
	}
}
