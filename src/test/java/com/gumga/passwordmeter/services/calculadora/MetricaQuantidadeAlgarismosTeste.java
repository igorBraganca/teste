package com.gumga.passwordmeter.services.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class MetricaQuantidadeAlgarismosTeste {

	@Test
	public void deveRetornar4VezesQuantidadeDeAlgarismosPresenteNoTexto() {
		final CalculadoraMetricas m = new MetricaQuantidadeAlgarismos();

		String texto = "";
		Assert.assertEquals("4 x quantidade_simbolos(\"" + texto + "\") deve ser 0", 0, m.calcular(texto));

		texto = "1234567890";
		Assert.assertEquals("4 x quantidade_simbolos(\"" + texto + "\") deve ser 40", 40, m.calcular(texto));

		texto = "asfewsaafwrd";
		Assert.assertEquals("4 x quantidade_simbolos(\"" + texto + "\") deve ser 0", 0, m.calcular(texto));

		texto = "asfeas1asfasf";
		Assert.assertEquals("4 x quantidade_simbolos(\"" + texto + "\") deve ser 4", 4, m.calcular(texto));

		texto = "¨$DG#HS&D#*&SY#";
		Assert.assertEquals("4 x quantidade_simbolos(\"" + texto + "\") deve ser 0", 0, m.calcular(texto));

		texto = "JSGFGUSAFYSF7";
		Assert.assertEquals("4 x quantidade_simbolos(\"" + texto + "\") deve ser 4", 4, m.calcular(texto));
	}
}
