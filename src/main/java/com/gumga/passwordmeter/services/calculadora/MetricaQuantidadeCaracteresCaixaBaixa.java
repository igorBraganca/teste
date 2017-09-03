package com.gumga.passwordmeter.services.calculadora;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("metrica-condicionais")
public class MetricaQuantidadeCaracteresCaixaBaixa implements CalculadoraMetricas {
	
	private static final int PESO = 2;
	private final ContadorCaracteres contador;

	public MetricaQuantidadeCaracteresCaixaBaixa() {
		contador = new ContadorCaracteres("abcdefghijklmnopqrstuvwxyz");
	}
	
	@Override
	public int calcular(String senha) {
		int quantidade = contador.contarQuantidadeCaracteres(senha);
		
		if(quantidade == 0) {
			return 0;
		}
		
		return (senha.length() - quantidade) * PESO;
	}
}
