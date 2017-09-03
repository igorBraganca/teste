package com.gumga.passwordmeter.services.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class MetricaLetrasCaixaBaixaConsecutivasTeste {

	@Test
	public void deveRetornar2VezesQuantidadeDeLetrasCaixaBaixaConsecutivas() {
		final CalculadoraMetricas m = new MetricaLetrasCaixaBaixaConsecutivas();

		String texto = "";
		Assert.assertEquals("deve retornar 2 x a quantidade de letras caixa baixa consecutivas para: \"" + texto + "\" resultado: 0", 0, m.calcular(texto));

		texto = "abcdefghijklmnopqrstuvwxyz";
		Assert.assertEquals("deve retornar 2 x a quantidade de letras caixa baixa consecutivas para: \"" + texto + "\" resultado: -50", -50, m.calcular(texto));

		texto = "aaabbbcccdddeee";
		Assert.assertEquals("deve retornar 2 x a quantidade de letras caixa baixa consecutivas para: \"" + texto + "\" resultado: -28", -28, m.calcular(texto));

		texto = "aaaAbbbBcccC";
		Assert.assertEquals("deve retornar 2 x a quantidade de letras caixa baixa consecutivas para: \"" + texto + "\" resultado: -12", -12, m.calcular(texto));

		texto = "aaa@bbb#ccc$";
		Assert.assertEquals("deve retornar 2 x a quantidade de letras caixa baixa consecutivas para: \"" + texto + "\" resultado: -12", -12, m.calcular(texto));

		texto = "a@b#c$d%";
		Assert.assertEquals("deve retornar 2 x a quantidade de letras caixa baixa consecutivas para: \"" + texto + "\" resultado: 0", 0, m.calcular(texto));

		texto = "aAaAaAaAaAaA";
		Assert.assertEquals("deve retornar 2 x a quantidade de letras caixa baixa consecutivas para: \"" + texto + "\" resultado: 0", 0, m.calcular(texto));

		texto = "AaAaAaAaAaA";
		Assert.assertEquals("deve retornar 2 x a quantidade de letras caixa baixa consecutivas para: \"" + texto + "\" resultado: 0", 0, m.calcular(texto));
	}
}
