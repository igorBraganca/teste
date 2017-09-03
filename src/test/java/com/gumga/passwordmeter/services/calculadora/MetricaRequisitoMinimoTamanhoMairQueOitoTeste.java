package com.gumga.passwordmeter.services.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class MetricaRequisitoMinimoTamanhoMairQueOitoTeste {

	@Test
	public void deveRetornar1SeTamanhoMaiorQueOito() {
		final CalculadoraMetricas m = new MetricaRequisitoMinimoTamanhoMaiorQueOito();

		String texto = "0123456789";
		Assert.assertEquals(1, m.calcular(texto));

		texto = "";
		Assert.assertEquals(0, m.calcular(texto));
		
		texto = "012345";
		Assert.assertEquals(0, m.calcular(texto));
		
		texto = "anvjhsekjhdd";
		Assert.assertEquals(1, m.calcular(texto));
		
		texto = "abcxg";
		Assert.assertEquals(0, m.calcular(texto));
		
		texto = "NSDUFBncn";
		Assert.assertEquals(1, m.calcular(texto));
	}
}
