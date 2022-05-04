package com.apixbrain.vendas.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apixbrain.vendas.domain.entity.Venda;
import com.apixbrain.vendas.domain.repository.VendasRepository;


@Service
public class CadastroVendasService {
	
	
	@Autowired
	private VendasRepository vendasRepository;
	
	@Transactional
	public Venda salvar(Venda vendas) {
		
		return vendasRepository.save(vendas);

	}
	
}
