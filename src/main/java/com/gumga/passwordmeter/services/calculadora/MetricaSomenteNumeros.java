package com.gumga.passwordmeter.services.calculadora;

import org.springframework.stereotype.Component;

@Component
public class MetricaSomenteNumeros implements CalculadoraMetricas {
	
	private final ContadorCaracteres contador;

	public MetricaSomenteNumeros() {
		contador = new ContadorCaracteres(ListaCaracteres.SIMBOLOS + ListaCaracteres.CARACTERES_CAIXA_ALTA + ListaCaracteres.CARACTERES_CAIXA_BAIXA);
	}
	
	@Override
	public int calcular(String senha) {
		if(contador.contarQuantidadeCaracteres(senha) == 0) {
			return senha.length() * -1;
		}
		
		return 0;
	}
}
