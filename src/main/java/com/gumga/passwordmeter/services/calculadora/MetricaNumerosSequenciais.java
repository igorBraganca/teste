package com.gumga.passwordmeter.services.calculadora;

import org.springframework.stereotype.Component;

@Component
public class MetricaNumerosSequenciais implements CalculadoraMetricas {

	private static final int PESO = 3;
	private final ContadorSequenciasDeTres contador;

	public MetricaNumerosSequenciais() {
		contador = new ContadorSequenciasDeTres("0123456789", "9876543210");
	}

	@Override
	public int calcular(String senha) {
		return contador.contar(senha.toLowerCase()) * PESO * -1;
	}

}
