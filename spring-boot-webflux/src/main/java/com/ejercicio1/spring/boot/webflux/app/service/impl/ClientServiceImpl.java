package com.ejercicio1.spring.boot.webflux.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio1.spring.boot.webflux.app.model.Cliente;
import com.ejercicio1.spring.boot.webflux.app.repositorio.ClienteReposi;
import com.ejercicio1.spring.boot.webflux.app.service.ClientService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl implements ClientService<Cliente, String> {

	@Autowired
	private ClienteReposi clienteReposi;
	@Override
	public Mono<Cliente> createClient(Cliente cliente) {
		
		return clienteReposi.save(cliente);
	}

	@Override
	public Mono<Cliente> updateClient(Cliente cliente) {
		return clienteReposi.save(cliente);
		
	}

	@Override
	public Mono<Void> deleteClient(String id) {
		
		return clienteReposi.deleteById(id);
	}

	@Override
	public Flux<Cliente> findAllClient() {
		
		return clienteReposi.findAll();
	}

	
	
}
