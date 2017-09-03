package com.gumga.passwordmeter.services.calculadora;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("metrica-condicionais")
public class MetricaQuantidadeAlgarismos implements CalculadoraMetricas {

	private static final int PESO = 4;
	private final ContadorCaracteres contador;

	public MetricaQuantidadeAlgarismos() {
		contador = new ContadorCaracteres("0123456789");
	}

	@Override
	public int calcular(String senha) {
		return contador.contarQuantidadeCaracteres(senha) * PESO;
	}
}
