package com.gumga.passwordmeter.services.calculadora;

import org.springframework.stereotype.Component;

@Component
public class MetricaQuantidadeSimbolos implements CalculadoraMetricas {
	
	private static final int PESO = 6;
	private final ContadorCaracteres contador;

	public MetricaQuantidadeSimbolos() {
		contador = new ContadorCaracteres("'!@#$%¨&*()+-=`´[]{}~^/?;:<>.,\\|\"" + "ÁÀÃÂÄÇÉÈÊËÍÌÎÏÓÒÕÔÖÚÙÛÜ" + "áàãâäçéèêëíìîïóòõôöúùûü");
	}
	
	@Override
	public int calcular(String senha) {
		return contador.contarQuantidadeCaracteres(senha) * PESO;
	}

}
