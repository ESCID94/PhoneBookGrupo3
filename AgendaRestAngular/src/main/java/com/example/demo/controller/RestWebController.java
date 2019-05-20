package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Persona;
import com.example.demo.services.AgendaService;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping({ "/" })
public class RestWebController<T, ID extends Serializable> {

	@Autowired
	private AgendaService<T, ID> service;
	
//	public AgendaService<T, Serializable> (AgendaService service){
//		this.service = service;
//	}

	@PostMapping
	public Persona create(@RequestBody Persona persona) {
		return (Persona) service.add((T) persona);
	}

	@GetMapping(path = { "/{id}" })
	public Persona findOne(@PathVariable("id") int id) {
		return (Persona) service.get(id);
	}

	@PutMapping(path = { "/{id}" })
	public Persona update(@PathVariable("id") int id, @RequestBody Persona persona) {
		persona.setIdpersona(id);
		return (Persona) service.update((T) persona);
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
