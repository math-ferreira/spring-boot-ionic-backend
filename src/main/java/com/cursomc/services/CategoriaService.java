package com.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursomc.domain.Categoria;
import com.cursomc.repositories.CategoriaRepository;
import com.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	
	public List<Categoria> findAll() {
		List<Categoria> listObj = repo.findAll();
		return listObj;
	}
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto Categoria não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getSimpleName()));
	}
	
	public Categoria insert(Categoria obj) {
		return repo.save(obj);
	}
}