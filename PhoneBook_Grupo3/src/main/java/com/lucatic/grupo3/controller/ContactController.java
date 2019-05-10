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

import com.lucatic.grupo3.model.Contact;
import com.lucatic.grupo3.repository.ContactRepository;

@RestController
@RequestMapping("/contacts")
public class ContactController {

	private final ContactRepository repository;

	@Autowired
	public ContactController(ContactRepository repository) {
		this.repository = repository;
	}
	
	@SuppressWarnings("serial")
	@ResponseStatus(HttpStatus.NOT_FOUND)
	class contactNotFoundException extends RuntimeException {

		public contactNotFoundException() {
			super("contact does not exist");
		}
	}
	
	//@GetMapping is a specialized RequestMapping. 
	//It specifies that HTTP GET requests to /contacts 
	//are mapped to the readcontacts() method.
	@GetMapping
	//@RequestMapping(method = RequestMethod.GET)
	Collection<Contact> readcontacts(){
		return this.repository.findAll();
	}
	
	
	/*
	 * this orElseThrow method at the end of the findById call and what does it do? 
	 * It is part of the java.util.Optional API. It returns the wrapped contact object
	 *  if present, otherwise it throws the exception provided by the exception supplier. 
	 *  However, we can substitute the supplier with a method reference to our custom 
	 *  exception class’ constructor. When this exception is thrown, a “404 Not Found” 
	 *  status code is returned, as described above.
     * https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html#orElseThrow-java.util.function.Supplier-.
	 */

	@GetMapping("/{id}")
	Contact readcontact(@PathVariable Long id) {
		return this.repository.findById(id)
				.orElseThrow(contactNotFoundException::new);
	}
	
	// @RequestBody contact contact significa que un contacto será el cuerpo de la respuesta
	@PostMapping
	ResponseEntity<?> addcontact(@RequestBody Contact contact){
		Contact result = this.repository.save(contact);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(result.getId())
				.toUri();
		
		/*
		 * Inside the method body, we build a java.net.URI object using ServletUriComponentsBuilder. 
		 * It builds the object by capturing the URI of the current request and appending the 
		 * placeholder /{id} to create a template. buildAndExpand(result.getId()) 
		 * inserts the id of the newly created contact into the template. 
		 * The result is the URI of the new resource.
		 */

		return ResponseEntity.created(location).build();		
	}
	
	@PutMapping
	Contact updatecontact(@RequestBody Contact contact) {
		return this.repository.update(contact)
				.orElseThrow(contactNotFoundException::new);
	}
	
	@DeleteMapping("/{id}")
	void deletecontact(@PathVariable Long id) {
		this.repository.delete(id)
			.orElseThrow(contactNotFoundException::new);
	}	
}
