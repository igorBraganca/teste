package com.gumga.passwordmeter.services.calculadora;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("requesito-minimo")
public class MetricaRequisitosMinimos implements CalculadoraMetricas {

	private final CalculadoraMetricas tamanho = new MetricaTamanho();
	private final CalculadoraMetricas upperCase = new MetricaQuantidadeCaracteresCaixaAlta();
	private final CalculadoraMetricas lowerCase = new MetricaQuantidadeCaracteresCaixaBaixa();
	private final CalculadoraMetricas numbers = new MetricaQuantidadeAlgarismos();
	private final CalculadoraMetricas symbols = new MetricaQuantidadeSimbolos();
	
	@Override
	public int calcular(String senha) {
		int soma = 0;
		
		if(upperCase.calcular(senha) > 0) {
			soma++;
		}
		
		if(lowerCase.calcular(senha) > 0) {
			soma++;
		}
		
		if(numbers.calcular(senha) > 0) {
			soma++;
		}
		
		if(symbols.calcular(senha) > 0) {
			soma++;
		}
		
		if(soma < 3) {
			return 0;
		}
		
		if(tamanho.calcular(senha)/4 >= 8) {
			return soma + 1;
		} else {
			return 0;
		}
	}
}
