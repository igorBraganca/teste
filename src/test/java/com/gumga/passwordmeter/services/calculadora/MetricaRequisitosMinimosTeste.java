package com.gumga.passwordmeter.services.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class MetricaRequisitosMinimosTeste {

	@Test
	public void deveRetornar0SeRequisitoTamanhoNaoAlcancado() {
		final CalculadoraMetricas m = new MetricaRequisitosMinimos();

		String texto = "aA1!";
		Assert.assertEquals(0, m.calcular(texto));

		texto = "";
		Assert.assertEquals(0, m.calcular(texto));
		
		texto = "012345";
		Assert.assertEquals(0, m.calcular(texto));
		
		texto = "abc12A@";
		Assert.assertEquals(0, m.calcular(texto));
		
		texto = "abcxg";
		Assert.assertEquals(0, m.calcular(texto));
	}
	
	@Test
	public void deveRetornar0SeRequisitoTamanhoAlcancadoMenosTresTiposCaracteres() {
		final CalculadoraMetricas m = new MetricaRequisitosMinimos();

		String texto = "A13524335";
		Assert.assertEquals(0, m.calcular(texto));

		texto = "AAABBBB2222";
		Assert.assertEquals(0, m.calcular(texto));
		
		texto = "!@#$%4444";
		Assert.assertEquals(0, m.calcular(texto));
	}
	
	@Test
	public void deveRetornar45SeRequisitoTamanhoAlcancadoMaisTresTiposCaracteres() {
		final CalculadoraMetricas m = new MetricaRequisitosMinimos();

		String texto = "aA13524335";
		Assert.assertEquals(4, m.calcular(texto));

		texto = "aaaBBBB2222";
		Assert.assertEquals(4, m.calcular(texto));
		
		texto = "!@#$%44ffa";
		Assert.assertEquals(4, m.calcular(texto));
	}
	
	@Test
	public void deveRetornar5SeRequisitoTamanhoAlcancadoMaisQuatroTiposCaracteres() {
		final CalculadoraMetricas m = new MetricaRequisitosMinimos();

		String texto = "aA13524335@";
		Assert.assertEquals(5, m.calcular(texto));

		texto = "aaaBBBB2222@";
		Assert.assertEquals(5, m.calcular(texto));
		
		texto = "!@#$%44ffaA";
		Assert.assertEquals(5, m.calcular(texto));
	}
}
