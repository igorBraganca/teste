package com.gumga.passwordmeter.services.calculadora;

public class MetricaQuantidadeCaracteresCaixaAlta implements CalculadoraMetricas {

	private static final String CARACTERES = "AÁÀÃÂÄBCÇDEÉÈÊËFGHIÍÌÎÏJKLMNOÓÒÕÔÖPQRSTUÚÙÛÜVWXYZ";
	private static final int PESO = 2;

	@Override
	public int calcular(String senha) {
		int quantidade = 0;
		
		for (int i = 0; i < senha.length(); i++) {
			if (CARACTERES.contains(String.valueOf(senha.charAt(i)))) {
				quantidade++;
			}
		}

		return (senha.length() - quantidade) * PESO;
	}
}
