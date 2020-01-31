package com.cursomc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cursomc.domain.Pedido;
import com.cursomc.services.PedidoService;

@Service
@RequestMapping("/pedidos")
public class PedidoResource {

	@Autowired
	private PedidoService service;
	
	@RequestMapping()
	public ResponseEntity<List<Pedido>> findAll(){
		List<Pedido> listObj = service.findAll();
		return ResponseEntity.ok(listObj);
	}
	
	@RequestMapping("/{id}")
	public ResponseEntity<Pedido> find(@PathVariable Integer id){
		Pedido obj = service.find(id);
		return ResponseEntity.ok(obj);
	}
}
