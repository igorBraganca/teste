package com.gumga.passwordmeter.services.calculadora;

import org.springframework.stereotype.Component;

@Component
public class MetricaLetrasSequenciais implements CalculadoraMetricas {

	private static final int PESO = 3;
	private final ContadorSequenciasDeTres contador;

	public MetricaLetrasSequenciais() {
		contador = new ContadorSequenciasDeTres("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcba");
	}

	@Override
	public int calcular(String senha) {
		return contador.contar(senha.toLowerCase()) * PESO * -1;
	}

}
