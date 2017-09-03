package com.gumga.passwordmeter.services.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class MetricaQuantidadeSimbolosTeste {

	@Test
	public void deveRetornar6VezesQuantidadeDeSimbolosPresenteNoTexto() {
		final CalculadoraMetricas m = new MetricaQuantidadeSimbolos();
		
		String texto = "";
		Assert.assertEquals("6 x quantidade_simbolos(\"" + texto + "\") deve ser 0", 0, m.calcular(texto));

		texto = "o9sdg94UHFAEIy4tgedg";
		Assert.assertEquals("6 x quantidade_simbolos(\"" + texto + "\") deve ser 0", 0, m.calcular(texto));

		texto = "o9sdg94UH@FAEIy4tgedg";
		Assert.assertEquals("6 x quantidade_simbolos(\"" + texto + "\") deve ser 6", 6, m.calcular(texto));

		texto = "'!@#$%&*()_+-=[{]};:?<>.,";
		Assert.assertEquals("6 x quantidade_simbolos(\"" + texto + "\") deve ser 144", 144, m.calcular(texto));

		texto = "'!gljhewrg@#$%&*(3412346)_+-=[{]};:?<>.JFU#R*&WED*&,";// 30 simbolos
		Assert.assertEquals("6 x quantidade_simbolos(\"" + texto + "\") deve ser 174", 174, m.calcular(texto));

		texto = "'!@#$%&*()_+-=[{]};:?<>.,'!@#$%&*()_+-=[{]};:?<>.,";
		Assert.assertEquals("6 x quantidade_simbolos(\"" + texto + "\") deve ser 288", 288, m.calcular(texto));

		texto = "A*A*A*A*A*A*A*A*A*A*A";
		Assert.assertEquals("6 x quantidade_simbolos(\"" + texto + "\") deve ser 60", 60, m.calcular(texto));

		texto = "**********";
		Assert.assertEquals("6 x quantidade_simbolos(\"" + texto + "\") deve ser 60", 60, m.calcular(texto));
		
		texto = "****áéíÃÕÛ******";
		Assert.assertEquals("6 x quantidade_simbolos(\"" + texto + "\") deve ser 96", 96, m.calcular(texto));
	}
}
