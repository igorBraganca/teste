package com.gumga.passwordmeter.services.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class MetricaNumerosConsecutivasTeste {

	@Test
	public void deveRetornar2VezesQuantidadeDeNumerosConsecutivas() {
		final CalculadoraMetricas m = new MetricaNumerosConsecutivas();

		String texto = "";
		Assert.assertEquals("deve retornar 2 x a quantidade de numeros consecutivas para: \"" + texto + "\" resultado: 0", 0, m.calcular(texto));

		texto = "0123456789";
		Assert.assertEquals("deve retornar 2 x a quantidade de numeros consecutivas para: \"" + texto + "\" resultado: 18", -18, m.calcular(texto));

		texto = "2221155235653621";
		Assert.assertEquals("deve retornar 2 x a quantidade de numeros consecutivas para: \"" + texto + "\" resultado: -30", -30, m.calcular(texto));

		texto = "2zx5x1c5cv21n4s5bsdh5b12c";
		Assert.assertEquals("deve retornar 2 x a quantidade de numeros consecutivas para: \"" + texto + "\" resultado: -4", -4, m.calcular(texto));

		texto = "2gs2156451sdg54g%$#44251-51425241$";
		Assert.assertEquals("deve retornar 2 x a quantidade de numeros consecutivas para: \"" + texto + "\" resultado: -36", -36, m.calcular(texto));

		texto = "245654NDSFHADSF285485241";
		Assert.assertEquals("deve retornar 2 x a quantidade de numeros consecutivas para: \"" + texto + "\" resultado: -26", -26, m.calcular(texto));

		texto = "5551!@#$%¨&*511716A";
		Assert.assertEquals("deve retornar 2 x a quantidade de numeros consecutivas para: \"" + texto + "\" resultado: -16", -16, m.calcular(texto));

		texto = "5a4d54d8fd1ds";
		Assert.assertEquals("deve retornar 2 x a quantidade de numeros consecutivas para: \"" + texto + "\" resultado: -2", -2, m.calcular(texto));
		
		texto = "0a0d9fuhfg6a3h3d7a8s3h6";
		Assert.assertEquals("deve retornar 2 x a quantidade de numeros consecutivas para: \"" + texto + "\" resultado: 0", 0, m.calcular(texto));
	}
}
