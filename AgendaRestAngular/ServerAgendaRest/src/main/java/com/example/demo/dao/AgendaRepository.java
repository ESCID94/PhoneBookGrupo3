/*
 * 
 */
package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.demo.model.Persona;


/**
 * The Interface Repository.
 */
@RepositoryRestResource
public interface AgendaRepository extends JpaRepository<Persona, Integer>{
	
}
