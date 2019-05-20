/*
 * 
 */
package com.example.demo.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * The Interface Repository.
 *
 * @param <T> the generic type
 * @param <ID> the generic type
 */
@RepositoryRestResource
public interface AgendaRepository<T, ID extends Serializable> extends JpaRepository<T, Serializable>{
	
}
