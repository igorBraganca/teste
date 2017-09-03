package com.gumga.passwordmeter.services.calculadora;

import org.springframework.stereotype.Component;

@Component
public class MetricaTamanho implements CalculadoraMetricas {

	private static final int PESO = 4;
	
	@Override
	public int calcular(String senha) {
		return senha.length() * PESO;
	}

}
