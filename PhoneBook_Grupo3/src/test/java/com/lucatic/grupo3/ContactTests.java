package com.lucatic.grupo3;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lucatic.grupo3.model.Contacto;
import com.lucatic.grupo3.model.Direccion;
import com.lucatic.grupo3.model.Persona;
import com.lucatic.grupo3.model.Provincia;
import com.lucatic.grupo3.model.Telefono;
import com.lucatic.grupo3.repository.ContactoRepository;

public class ContactTests {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void debeDevolverJSONEnUnObjeto() throws MalformedURLException {

		Persona persona = new Persona();
		Direccion direccion = new Direccion();
		Provincia provincia = new Provincia();
		Telefono telefono = new Telefono();

		ObjectMapper objectMapper = new ObjectMapper();

		URL urlPer = new URL("file:src/main/resources/persona.json");
		URL urlDir = new URL("file:src/main/resources/direccion.json");
		URL urlPro = new URL("file:src/main/resources/provincia.json");
		URL urlTel = new URL("file:src/main/resources/telefono.json");
		try {
			persona = objectMapper.readValue(urlPer, Persona.class);
			direccion = objectMapper.readValue(urlDir, Direccion.class);
			provincia = objectMapper.readValue(urlPro, Provincia.class);
			telefono = objectMapper.readValue(urlTel, Telefono.class);
			Contacto contacto = new Contacto(1L, persona, direccion, telefono, provincia);
			System.out.println(contacto.toString());
			ContactoRepository c = new ContactoRepository();
			c.save(contacto);
			
			c.update(contacto);

		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
