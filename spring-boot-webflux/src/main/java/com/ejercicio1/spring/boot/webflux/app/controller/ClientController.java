package com.ejercicio1.spring.boot.webflux.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio1.spring.boot.webflux.app.model.Cliente;
import com.ejercicio1.spring.boot.webflux.app.service.ClientService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping ("/client")
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@PostMapping ("/creatclient")
	public Mono<Cliente> createclient(@RequestBody Cliente cliente)
	{
		return clientService.createClient(cliente);
	}
	
	@PutMapping("/updateclient")
	public Mono<Cliente> updateclient(@RequestBody Cliente cliente)
	{
		return clientService.updateClient(cliente);
	}
	@GetMapping("/listclient")
	public Flux<Cliente> findAllclient(){
		return clientService.findAllClient();
	}
	
	@DeleteMapping("/Deleteclient/{id}")
	public Mono<Void> deleteclient(@PathVariable String id){
		return clientService.deleteClient(id);
	}
	
}
