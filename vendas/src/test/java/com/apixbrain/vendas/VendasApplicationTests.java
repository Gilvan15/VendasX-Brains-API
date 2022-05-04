package com.apixbrain.vendas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.apixbrain.vendas.domain.entity.ListarVendaTotalVendedores;
import com.apixbrain.vendas.domain.entity.Venda;
import com.apixbrain.vendas.domain.entity.Vendedor;
import com.apixbrain.vendas.domain.repository.VendasRepository;
import com.apixbrain.vendas.domain.repository.VendedorRepository;

@SpringBootTest
class VendasApplicationTests {

	@Autowired
	private VendasRepository vendasRepository;

	@Autowired
	private VendedorRepository vendedorRepository;

	Double totalmedia;
	Double vtotalmeida;

	@Test
	void contextLoads() throws ParseException {

		/*
		Anotações commitis:

			01 "commit inicial - estrutura basica do projeto vendaxbraintest com as dependencias: h2,web,jpa,lombok,devtools - mavem"
			02 "criação do pacote raíz: domain"
			03 "criação dos sub pacotes: entity, controllers, repository e service"
		*/

		
		

		
	}

		
}


