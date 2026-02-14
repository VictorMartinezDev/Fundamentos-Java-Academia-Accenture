package com.example.demo.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.ClienteResponseDto;
import com.example.demo.entity.Cliente;
import com.example.demo.exception.ClienteAlreadyExistsException;
import com.example.demo.exception.ClienteNotFoundException;
import com.example.demo.repository.ClienteRepository;

@Service
public class ClienteService {
	
	private final ClienteRepository clienteRepository;
	
	public ClienteService( ClienteRepository clienteRepository) {

		this.clienteRepository = clienteRepository;
	}
	
	
	//CREATE
	public Cliente addCliente(Cliente cliente) {
		
		if(clienteRepository.existsByNameAndNumberPhone(cliente.getName(), cliente.getNumberPhone())) {
			throw new ClienteAlreadyExistsException("El cliente " + cliente.getName() +
						" ya se encuentra registrado con el numero: " + cliente.getNumberPhone());
		}
		else return clienteRepository.save(cliente);
		
		
	}
	
	//READ
	public Cliente getCliente(Long id){
		
		return clienteRepository.findById(id).
				                 orElseThrow(()-> new ClienteNotFoundException("Cliente no encontrado") );
	}
	
	public List<Cliente> getAllCliente(){
		
		return clienteRepository.findAll();
	}
	
	//UPDATE
	
	public Cliente updateCliente(Long id, Cliente clienteActualizado) {
		
		Cliente cliente = clienteRepository.findById(id).orElseThrow(()-> new ClienteNotFoundException("Cliente no encontrado"));
		
		cliente.setName(clienteActualizado.getName());
		cliente.setAge(clienteActualizado.getAge());
		cliente.setEmail(clienteActualizado.getEmail());
		cliente.setNumberPhone(clienteActualizado.getNumberPhone());
		cliente.setBirthdate(clienteActualizado.getBirthdate());
		
		return clienteRepository.save(cliente);
	}
	
	//DELETE
	
	public void deleteCliente(Long id) {
		
		if(clienteRepository.existsById(id)) {
			
			clienteRepository.deleteById(id);
		}
		else {
			throw new ClienteNotFoundException("Id de cliente no encontrado, no podemos proceder con la operación");
		}
		
		
	}
	

}
