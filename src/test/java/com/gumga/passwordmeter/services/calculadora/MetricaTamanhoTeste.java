package com.gumga.passwordmeter.services.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class MetricaTamanhoTeste {

	@Test
	public void deveRetornar4VezesTamanhoDoTexto() {
		final CalculadoraMetricas m = new MetricaTamanho();
		
		Assert.assertEquals("4 x tamnho(\"abcdefghij\") deve ser 40", 40, m.calcular("abcdefghij"));
		Assert.assertEquals("4 x tamnho(\"12345\") deve ser 20", 20, m.calcular("12345"));
		Assert.assertEquals("4 x tamnho(\"JHF%&$@*as\") deve ser 40", 40, m.calcular("JHF%&$@*as"));
		Assert.assertEquals("4 x tamnho(\"JHF%&$@*aKSADGH*$ghdg9873q4yiuf\") deve ser 40", 124, m.calcular("JHF%&$@*aKSADGH*$ghdg9873q4yiuf"));
	}
}

