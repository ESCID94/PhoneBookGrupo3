package com.lucatic.grupo3.controller;

import java.net.URI;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.lucatic.grupo3.model.Contacto;
import com.lucatic.grupo3.services.ContactoService;

@RestController
@RequestMapping("/Contactos")
public class ContactoController {

	private final ContactoService service;

	@Autowired
	public ContactoController(ContactoService service) {
		this.service = service;
	}
	
	@SuppressWarnings("serial")
	@ResponseStatus(HttpStatus.NOT_FOUND)
	class ContactoNotFoundException extends RuntimeException {

		public ContactoNotFoundException() {
			super("Contacto does not exist");
		}
	}
	
	//@GetMapping is a specialized RequestMapping. 
	//It specifies that HTTP GET requests to /Contactos 
	//are mapped to the readContactos() method.
	@GetMapping
	//@RequestMapping(method = RequestMethod.GET)
	Collection<Contacto> readContactos(){
		return this.service.findAll();
	}
	
	
	/*
	 * this orElseThrow method at the end of the findById call and what does it do? 
	 * It is part of the java.util.Optional API. It returns the wrapped Contacto object
	 *  if present, otherwise it throws the exception provided by the exception supplier. 
	 *  However, we can substitute the supplier with a method reference to our custom 
	 *  exception class’ constructor. When this exception is thrown, a “404 Not Found” 
	 *  status code is returned, as described above.
     * https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html#orElseThrow-java.util.function.Supplier-.
	 */

	@GetMapping("/{id}")
	Contacto readContacto(@PathVariable Long id) {
		return this.service.findById(id)
				.orElseThrow(ContactoNotFoundException::new);
	}
	
	// @RequestBody Contacto Contacto significa que un Contactoo será el cuerpo de la respuesta
	@PostMapping
	ResponseEntity<?> addContacto(@RequestBody Contacto Contacto){
		Contacto result = this.service.save(Contacto);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(result.getId())
				.toUri();
		
		/*
		 * Inside the method body, we build a java.net.URI object using ServletUriComponentsBuilder. 
		 * It builds the object by capturing the URI of the current request and appending the 
		 * placeholder /{id} to create a template. buildAndExpand(result.getId()) 
		 * inserts the id of the newly created Contacto into the template. 
		 * The result is the URI of the new resource.
		 */

		return ResponseEntity.created(location).build();
	}
	
	@PutMapping
	Contacto updateContacto(@RequestBody Contacto Contacto) {
		return this.service.update(Contacto)
				.orElseThrow(ContactoNotFoundException::new);
	}
	
	@DeleteMapping("/{id}")
	void deleteContacto(@PathVariable Long id) {
		this.service.delete(id)
			.orElseThrow(ContactoNotFoundException::new);
	}	
}