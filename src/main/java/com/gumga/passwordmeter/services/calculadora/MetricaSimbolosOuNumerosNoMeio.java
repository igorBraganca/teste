package com.gumga.passwordmeter.services.calculadora;

import org.springframework.stereotype.Component;

@Component
public class MetricaSimbolosOuNumerosNoMeio implements CalculadoraMetricas {
	private static final int PESO = 2;
	private final ContadorCaracteres contador;

	public MetricaSimbolosOuNumerosNoMeio() {
		contador = new ContadorCaracteres(ListaCaracteres.SIMBOLOS + ListaCaracteres.ALGARISMOS);
	}
	
	@Override
	public int calcular(String senha) {
		if(senha.length() <= 2) { 
			return 0;
		}
		
		String texto = senha.substring(1, senha.length()-1);
		
		return contador.contarQuantidadeCaracteres(texto) * PESO;
	}
}
