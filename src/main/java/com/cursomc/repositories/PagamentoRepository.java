package com.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursomc.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{

}
