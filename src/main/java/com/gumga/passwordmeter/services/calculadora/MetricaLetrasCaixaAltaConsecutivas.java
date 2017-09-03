package com.gumga.passwordmeter.services.calculadora;

import org.springframework.stereotype.Component;

@Component
public class MetricaLetrasCaixaAltaConsecutivas implements CalculadoraMetricas {

	private static final int PESO = 2;
	private final ContadorCarcteresConsecutivos contador;

	public MetricaLetrasCaixaAltaConsecutivas() {
		contador = new ContadorCarcteresConsecutivos(ListaCaracteres.CARACTERES_CAIXA_ALTA);
	}

	@Override
	public int calcular(String senha) {
		return contador.contarQuantidadeCaracteresConsecutivos(senha) * PESO * -1;
	}
}
