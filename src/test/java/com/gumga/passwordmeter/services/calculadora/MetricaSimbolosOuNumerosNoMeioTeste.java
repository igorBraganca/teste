package com.gumga.passwordmeter.services.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class MetricaSimbolosOuNumerosNoMeioTeste {
	
	@Test
	public void deveRetornar2QuantidadeDeSimbolosOuNumerosNoMeio() {
		final CalculadoraMetricas m = new MetricaSimbolosOuNumerosNoMeio();
		
		String texto = "";
		Assert.assertEquals("2 x quantidade_simbolos(\"" + texto + "\") deve ser 0", 0, m.calcular(texto));
		
		texto = "12";
		Assert.assertEquals("2 x quantidade_simbolos(\"" + texto + "\") deve ser 0", 0, m.calcular(texto));
		
		texto = "123";
		Assert.assertEquals("2 x quantidade_simbolos(\"" + texto + "\") deve ser 2", 2, m.calcular(texto));
		
		texto = "1234567890";
		Assert.assertEquals("2 x quantidade_simbolos(\"" + texto + "\") deve ser 16", 16, m.calcular(texto));
		
		texto = "a1234567890a";
		Assert.assertEquals("2 x quantidade_simbolos(\"" + texto + "\") deve ser 20", 20, m.calcular(texto));
		
		texto = "!@#$";
		Assert.assertEquals("2 x quantidade_simbolos(\"" + texto + "\") deve ser 4", 4, m.calcular(texto));
		
		texto = "!1234@#$";
		Assert.assertEquals("2 x quantidade_simbolos(\"" + texto + "\") deve ser 12", 12, m.calcular(texto));
		
		texto = "b!1234@#$b";
		Assert.assertEquals("2 x quantidade_simbolos(\"" + texto + "\") deve ser 16", 16, m.calcular(texto));
	}
}
