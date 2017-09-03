package com.gumga.passwordmeter.services.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class MetricaSimbolosSequenciaTeste {

	@Test
	public void deveContarAQuantidadeDeSequenciaDeTresSimbolosEMultiplicarPorTres() {
		final CalculadoraMetricas m = new MetricaSimbolosSequenciais();
		
		String texto = "";
		Assert.assertEquals(0, m.calcular(texto));
		
		texto = ")!@#$%¨&*(";
		Assert.assertEquals(-15, m.calcular(texto));
		
		texto = "(*&¨%$#@!)";
		Assert.assertEquals(-15, m.calcular(texto));
		
		texto = ")!@#$%¨&*((*&¨%$#@!)";
		Assert.assertEquals(-15, m.calcular(texto));
		
		texto = ")sdf!@#$dsgsdg%sd¨&*((*fdh&h435sdfhgsdf¨%$#@sdf!)";
		Assert.assertEquals(-12, m.calcular(texto));
	}
}
