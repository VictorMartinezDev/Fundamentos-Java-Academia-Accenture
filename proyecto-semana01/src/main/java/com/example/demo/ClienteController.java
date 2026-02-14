package com.example.demo;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Cliente;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	
	private final ClienteService clienteService;

	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	//CREATE
	@PostMapping()
	public ResponseEntity<Cliente> addCliente(@RequestBody Cliente cliente){
		
		return ResponseEntity.status(HttpStatus.CREATED)
							 .body(clienteService.addCliente(cliente));
	}
	
	//READ
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> getAllCliente(@PathVariable Long id){
		
		return ResponseEntity.status(HttpStatus.OK).body(clienteService.getCliente(id));
	}
	
	@GetMapping()
	public ResponseEntity<List<Cliente>> getAllCliente(){
		
		return ResponseEntity.status(HttpStatus.OK).body(clienteService.getAllCliente());
	}
	
	//UPDATE
	@PutMapping("/{id}")
	public ResponseEntity<Cliente> updateCliente(@PathVariable Long id, @RequestBody Cliente cliente){
		
		return ResponseEntity.status(HttpStatus.OK).body(clienteService.updateCliente(id, cliente));
	}
	
	//DELETE
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCliente(@PathVariable Long id){
		clienteService.deleteCliente(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
	}
	

}
