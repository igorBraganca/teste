package com.gumga.passwordmeter.services.calculadora;

import org.springframework.stereotype.Component;

@Component
public class MetricaSimbolosOuNumerosNoMeio implements CalculadoraMetricas {

	private static final String SIMBOLOS = "'!@#$%&*()_+-=[{]};:?<>.,";
	private static final String ALGARISMOS = "0123456789";
	private static final int PESO = 2;
	
	@Override
	public int calcular(String senha) {
		if(senha.length() <= 2) { 
			return 0;
		}
		
		String texto = senha.substring(1, senha.length()-1);

		int quantidade = 0;

		for (int i = 0; i < texto.length(); i++) {
			if (SIMBOLOS.contains(String.valueOf(texto.charAt(i))) || ALGARISMOS.contains(String.valueOf(texto.charAt(i)))) {
				quantidade++;
			}
		}

		return quantidade * PESO;
		
	}

}
