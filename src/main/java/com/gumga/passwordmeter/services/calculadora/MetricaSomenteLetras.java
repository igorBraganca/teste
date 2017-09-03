package com.gumga.passwordmeter.services.calculadora;

import org.springframework.stereotype.Component;

@Component
public class MetricaSomenteLetras implements CalculadoraMetricas {
	
	private final ContadorCaracteres contador;

	public MetricaSomenteLetras() {
		contador = new ContadorCaracteres(ListaCaracteres.SIMBOLOS + ListaCaracteres.ALGARISMOS);
	}
	
	@Override
	public int calcular(String senha) {
		if(contador.contarQuantidadeCaracteres(senha) == 0) {
			return senha.length() * -1;
		}
		
		return 0;
	}
}
