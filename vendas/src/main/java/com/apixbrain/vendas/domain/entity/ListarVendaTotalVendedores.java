package com.apixbrain.vendas.domain.entity;

import lombok.Data;

@Data
public class ListarVendaTotalVendedores {
	
	private Long id;
	
	private String nome;
	
	private Double totalvendasvendedor;
	
	private Double mediavendasdiarias;
	
	private int quantvendaperiodoinformado;  
	
	
	public ListarVendaTotalVendedores() {
		super();
	}
	
	public ListarVendaTotalVendedores(Long id, String nome, Double totalvendasvendedor, Double mediavendasdiarias,
			int quantvendaperiodoinformado) {
		super();
		this.id = id;
		this.nome = nome;
		this.totalvendasvendedor = totalvendasvendedor;
		this.mediavendasdiarias = mediavendasdiarias;
		this.quantvendaperiodoinformado = quantvendaperiodoinformado;
	}
	
	
	public Double totalmedias(Double media, int contador) {
		double totalmedia = (media / contador);
			return arredondar(totalmedia);
	}

	private static double arredondar(double media) {
		return Math.round(media * 100.0) / 100.0;
	}

}