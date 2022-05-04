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
			04 "criação das entidades no pacote entity: Venda e Vendedor"
			05 "criação do mapeameto relacional das entidades Venda e Vendedor"
			06 "criaçao do relacionamento OneToMany e ManyToOne das entidades"
			07 "abilitar accesso ao h2 em aplications.properties: spring.h2.console.enabled=true"
			08 "Verificação do mapeamento relacional das tabelas no banco H2"
			09 "criação do arquivo import.sql para popular as tabelas no H2"
			10 "criação das classes Repositorys: VendaRepository, VendedorRepository"
			11 "criação das classes Serviços: VendaService, VendedorService"
			12 "criacao das classes controllers: VendaController, VendedorController"
			13 "criação e implementação dos métodos adicionar e listar em VendaController"
			14 "criação e implementação dos métodos adicionar e listar em VendedorController"
			15 "verificação do endpoint no postman do métodos adicioar Venda"
			16 "verificação do endpoint no postman do métodos Listar Vendas"
			17 "verificação do endpoint no postman do métodos adicioar Vendedor"
		
		*/

		
		

		
	}

		
}


