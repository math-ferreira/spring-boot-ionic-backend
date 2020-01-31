package com.cursomc.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cursomc.domain.Estado;
import com.cursomc.repositories.EstadoRepository;
import com.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class EstadoService {

	@Autowired
	EstadoRepository repo;

	public List<Estado> findAll() {
		List<Estado> listObj = repo.findAll();
		return listObj;
	}

	public Estado find(Integer id) {
		Optional<Estado> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto Estado não encontrado! Id: " + id + ", Tipo: " + Estado.class.getSimpleName()));

	}
}
