package com.gumga.passwordmeter.services.calculadora;

public class MetricaNumerosConsecutivas implements CalculadoraMetricas {

	private static final int PESO = 2;
	private final ContadorCarcteresConsecutivos contador;

	public MetricaNumerosConsecutivas() {
		contador = new ContadorCarcteresConsecutivos(ListaCaracteres.ALGARISMOS);
	}

	@Override
	public int calcular(String senha) {
		return contador.contarQuantidadeCaracteresConsecutivos(senha) * PESO * -1;
	}
}
