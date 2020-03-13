package com.ejercicio1.spring.boot.webflux.app.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientService<M,N>{

	Mono<M> createClient(M m);
	Mono<M> updateClient(M m);
	Mono<Void> deleteClient(N n );
	
	Flux<M> findAllClient();
}
