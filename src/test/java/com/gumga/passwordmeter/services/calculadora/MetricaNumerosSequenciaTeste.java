package com.gumga.passwordmeter.services.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class MetricaNumerosSequenciaTeste {

	@Test
	public void deveContarAQuantidadeDeSequenciaDeTresNumerosEMultiplicarPorTres() {
		final CalculadoraMetricas m = new MetricaNumerosSequenciais();
		
		String texto = "";
		Assert.assertEquals(0, m.calcular(texto));
		
		texto = "0123456789";
		Assert.assertEquals(-24, m.calcular(texto));
		
		texto = "9876543210";
		Assert.assertEquals(-24, m.calcular(texto));
		
		texto = "01234567899876543210";
		Assert.assertEquals(-24, m.calcular(texto));
		
		texto = "01234987654321056789";
		Assert.assertEquals(-24, m.calcular(texto));
		
		texto = "01234s5678s9";
		Assert.assertEquals(-15, m.calcular(texto));
		
		texto = "0123456s789012s345678s9";
		Assert.assertEquals(-24, m.calcular(texto));
		
		texto = "0a1s2d3f4g5h6j7k8l9";
		Assert.assertEquals(0, m.calcular(texto));
	}
}
