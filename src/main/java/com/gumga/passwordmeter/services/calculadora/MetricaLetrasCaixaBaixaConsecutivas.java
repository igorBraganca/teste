package com.gumga.passwordmeter.services.calculadora;

import org.springframework.stereotype.Component;

@Component
public class MetricaLetrasCaixaBaixaConsecutivas implements CalculadoraMetricas {

	private static final int PESO = 2;
	private final ContadorCarcteresConsecutivos contador;

	public MetricaLetrasCaixaBaixaConsecutivas() {
		contador = new ContadorCarcteresConsecutivos(ListaCaracteres.CARACTERES_CAIXA_BAIXA);
	}

	@Override
	public int calcular(String senha) {
		return contador.contarQuantidadeCaracteresConsecutivos(senha) * PESO * -1;
	}
}
