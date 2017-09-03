package com.gumga.passwordmeter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gumga.passwordmeter.entidades.Senha;
import com.gumga.passwordmeter.services.CalcularNotaService;

@RestController
public class CalcularNotaController {
	
	private final CalcularNotaService service;
	
	@Autowired
	public CalcularNotaController(CalcularNotaService service) {
		this.service = service;
	}
	
	@RequestMapping("/api/calcular")
	public Senha calcularNota(@RequestBody Senha senha) {
		int nota = service.calcularNota(senha.getValor());
		
		return new Senha(senha.getValor(), nota);
	}

}
