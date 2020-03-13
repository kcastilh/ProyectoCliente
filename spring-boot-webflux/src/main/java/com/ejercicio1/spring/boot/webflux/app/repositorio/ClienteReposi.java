package com.ejercicio1.spring.boot.webflux.app.repositorio;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ejercicio1.spring.boot.webflux.app.model.Cliente;

public interface ClienteReposi extends ReactiveMongoRepository<Cliente, String>{

	
	
}
