package com.gumga.passwordmeter.services.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class MetricaLetrasCaixaAltaConsecutivasTeste {

	@Test
	public void deveRetornar2VezesQuantidadeDeLetrasCaixaBaixaConsecutivas() {
		final CalculadoraMetricas m = new MetricaLetrasCaixaBaixaConsecutivas();

		String texto = "";
		Assert.assertEquals("deve retornar 2 x a quantidade de letras caixa alta consecutivas para: \"" + texto + "\" resultado: 0", 0, m.calcular(texto));

		texto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Assert.assertEquals("deve retornar 2 x a quantidade de letras caixa alta consecutivas para: \"" + texto + "\" resultado: -50", -50, m.calcular(texto));

		texto = "AAAABBBCCCDDDEEE";
		Assert.assertEquals("deve retornar 2 x a quantidade de letras caixa alta consecutivas para: \"" + texto + "\" resultado: -30", -30, m.calcular(texto));

		texto = "AAAaBBBBchrtydK";
		Assert.assertEquals("deve retornar 2 x a quantidade de letras caixa alta consecutivas para: \"" + texto + "\" resultado: -10", -10, m.calcular(texto));

		texto = "DFGDS@CWDYHAS34Y#GASDFGAV4C$";
		Assert.assertEquals("deve retornar 2 x a quantidade de letras caixa alta consecutivas para: \"" + texto + "\" resultado: -34", -34, m.calcular(texto));

		texto = "hgISDIUN9F7TY89743x(#$y(hfCDSFIUSGF9N7T498TEN 9";
		Assert.assertEquals("deve retornar 2 x a quantidade de letras caixa alta consecutivas para: \"" + texto + "\" resultado: -32", -32, m.calcular(texto));

		texto = "aAaAaAaAaAaA";
		Assert.assertEquals("deve retornar 2 x a quantidade de letras caixa alta consecutivas para: \"" + texto + "\" resultado: 0", 0, m.calcular(texto));

		texto = "AaAaAaAaAaA";
		Assert.assertEquals("deve retornar 2 x a quantidade de letras caixa alta consecutivas para: \"" + texto + "\" resultado: 0", 0, m.calcular(texto));
	}
}
