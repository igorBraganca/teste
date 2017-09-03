package com.gumga.passwordmeter.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gumga.passwordmeter.entidades.Senha;

@RestController
public class CalcularNotaController {
	
	@RequestMapping("/api/calcular")
	public Senha calcularNota(@RequestBody Senha senha) {
		return new Senha("", senha.getValor().length());
	}

}
