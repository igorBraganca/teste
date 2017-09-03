package com.gumga.passwordmeter.services.calculadora;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("requesito-minimo")
public class MetricaRequisitoMinimoTamanhoMaiorQueOito implements CalculadoraMetricas {

	@Override
	public int calcular(String senha) {
		if(senha.length() > 8) {
			return 1;
		}
		
		return 0;
	}
}
