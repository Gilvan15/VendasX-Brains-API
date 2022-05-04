package com.apixbrain.vendas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.apixbrain.vendas.domain.entity.Vendedor;


@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Long> {


}
