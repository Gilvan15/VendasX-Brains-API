package com.apixbrain.vendas.domain.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.apixbrain.vendas.domain.entity.ListarVendaTotalVendedores;
import com.apixbrain.vendas.domain.entity.Venda;
import com.apixbrain.vendas.domain.entity.Vendedor;
import com.apixbrain.vendas.domain.repository.VendasRepository;
import com.apixbrain.vendas.domain.repository.VendedorRepository;
import com.apixbrain.vendas.domain.service.CadastroVendasService;


@RestController
@RequestMapping(value = "/vendas")
public class VendasController {

	@Autowired
	private VendasRepository vendasRepository;

	@Autowired
	private VendedorRepository vendedorRepository;

	@Autowired
	private CadastroVendasService cadastroVendas;
	
	ListarVendaTotalVendedores lv = new ListarVendaTotalVendedores();

	@GetMapping
	public List<Venda> listar() {
		return vendasRepository.findAll();
	}
	

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Venda adicionar(@RequestBody Venda venda) {
		return cadastroVendas.salvar(venda);
	}
	
//	
	@GetMapping("/listafiltrada")
	public List<ListarVendaTotalVendedores> listarVendedores(@RequestParam String dateInicio, @RequestParam String dateFinal ) throws ParseException  {
//	public List<ListarVendaTotalVendedores> listarVendedores(@RequestBody String dateInicio) throws ParseException  {
		
		SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
		
		String sDateInicio = dateInicio.replace("-","/")	;
		String sDateFinal  = dateFinal.replace("-","/");

		Date date1 = formatter1.parse(sDateInicio);
		Date date2 = formatter1.parse(sDateFinal);
				
//		System.out.println(testeData);

		List<ListarVendaTotalVendedores> listTemp = new ArrayList<>();

		List<Venda> vendas = vendasRepository.findAll();
		List<Vendedor> vendedor = vendedorRepository.findAll();

		for (Vendedor vd : vendedor) {

			int contador = (int) vendas.stream().filter(vds -> (vds.getVendedor().getId() == vd.getId() && vds.getDataVenda().after(date1)
					&& vds.getDataVenda().before(date2)))
					.count();
			
			double  somatotalVenda = vendas.stream()
					.filter(vds -> (vds.getVendedor().getId() == vd.getId() && vds.getDataVenda().after(date1)
							&& vds.getDataVenda().before(date2)))
					.map(item -> item.getValor()).mapToDouble(Double::doubleValue). sum();
			
			double  vsomatotalVenda = Math.round(somatotalVenda * 100)/100D;
			

			if (somatotalVenda != 0) {
				double vtotalmeida = lv.totalmedias(somatotalVenda, contador);
				listTemp.add(new ListarVendaTotalVendedores(vd.getId(), vd.getNome(), vsomatotalVenda, vtotalmeida, contador));
			}

		}

		return listTemp;
	}

}