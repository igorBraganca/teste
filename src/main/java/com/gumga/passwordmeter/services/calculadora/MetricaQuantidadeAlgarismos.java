package com.gumga.passwordmeter.services.calculadora;

public class MetricaQuantidadeAlgarismos implements CalculadoraMetricas {

	private static final String ALGARISMOS = "0123456789";
	private static final int PESO = 4;
	
	@Override
	public int calcular(String senha) {
		int quantidade = 0;

		for (int i = 0; i < senha.length(); i++) {
			if (ALGARISMOS.contains(String.valueOf(senha.charAt(i)))) {
				quantidade++;
			}
		}

		return quantidade * PESO;
		
	}

}
