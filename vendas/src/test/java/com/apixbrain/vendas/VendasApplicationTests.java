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
		
		
		String sDateInicio = "31/03/2022";
		String sDateFinal = "31/04/2022";
		SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");

		Date date1 = formatter1.parse(sDateInicio);
		Date date2 = formatter1.parse(sDateFinal);

		List<ListarVendaTotalVendedores> listTemp = new ArrayList<>();

		List<Venda> vendas = vendasRepository.findAll();
		List<Vendedor> vendedor = vendedorRepository.findAll();

		
		for (Vendedor vd : vendedor) {
			
			int contador = (int) vendas.stream().filter(vds -> (vds.getVendedor().getId() == vd.getId()))
			.count();
			
			double somatotalVenda = vendas.stream().filter(vds -> (vds.getVendedor().getId() == vd.getId() && vds.getDataVenda().after(date1)
							&& vds.getDataVenda().before(date2)))
					.map(item -> item.getValor()).mapToDouble(Double::doubleValue).sum();

			if (somatotalVenda != 0) {
				vtotalmeida = totalmedias(somatotalVenda, contador);
				listTemp.add(new ListarVendaTotalVendedores(vd.getId(), vd.getNome(), somatotalVenda, vtotalmeida, contador));
			}

		}
		
		for(ListarVendaTotalVendedores lt: listTemp) {
			
			System.out.println(lt.getId() + "-" + lt.getNome() + " - " + "- " 
			+ lt.getTotalvendasvendedor() +" - " + lt.getMediavendasdiarias());
			
		}

		
	}

	public Double totalmedias(Double media, int contador) {

		totalmedia = (media / contador);
		return arredondar(totalmedia);
	}

	private static double arredondar(double media) {
		return Math.round(media * 100.0) / 100.0;

	}	
		
}


