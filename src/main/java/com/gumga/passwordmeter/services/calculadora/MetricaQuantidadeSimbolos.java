package com.gumga.passwordmeter.services.calculadora;

import org.springframework.stereotype.Component;

@Component
public class MetricaQuantidadeSimbolos implements CalculadoraMetricas {

	private static final String SIMBOLOS = "'!@#$%&*()_+-=[{]};:?<>.,";
	private static final int PESO = 6;

	@Override
	public int calcular(String senha) {

		int quantidade = 0;

		for (int i = 0; i < senha.length(); i++) {
			if (SIMBOLOS.contains(String.valueOf(senha.charAt(i)))) {
				quantidade++;
			}
		}

		return quantidade * PESO;
	}

}
