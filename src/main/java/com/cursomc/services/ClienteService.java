package com.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursomc.domain.Cliente;
import com.cursomc.repositories.ClienteRepository;
import com.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	
	public List<Cliente> findAll(){
		List<Cliente> listObj = repo.findAll();
		return listObj;
	}
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto Cliente não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getSimpleName()));
	}
	
}
