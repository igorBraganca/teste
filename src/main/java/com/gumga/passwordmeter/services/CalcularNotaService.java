package com.gumga.passwordmeter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gumga.passwordmeter.services.calculadora.CalculadoraMetricas;

@Component
public class CalcularNotaService {

	private final List<CalculadoraMetricas> calculadoras;
	
	@Autowired
	public CalcularNotaService(List<CalculadoraMetricas> calculadoras) {
		this.calculadoras = calculadoras;
	}
	
	public int calcularNota(String senha) {
		int nota = 0;
		
		if(calculadoras != null) {
			for (CalculadoraMetricas calculadora : calculadoras) {
				nota += calculadora.calcular(senha);
			}
		}
		
		return nota;
	}
}
