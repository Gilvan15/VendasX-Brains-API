package com.apixbrain.vendas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apixbrain.vendas.domain.entity.Venda;



@Repository
public interface VendasRepository extends JpaRepository<Venda, Long> {


}
