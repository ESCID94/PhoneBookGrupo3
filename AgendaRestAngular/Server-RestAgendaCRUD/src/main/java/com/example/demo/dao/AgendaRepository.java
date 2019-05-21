/*
 * 
 */
package com.example.demo.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Persona;


/**
 * The Interface Repository.
 *
 * @param <T> the generic type
 * @param <ID> the generic type
 */
@RepositoryRestResource
public interface AgendaRepository extends JpaRepository<Persona, Integer>{
	
}
