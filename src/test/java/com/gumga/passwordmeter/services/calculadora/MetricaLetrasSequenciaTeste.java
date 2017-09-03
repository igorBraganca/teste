package com.gumga.passwordmeter.services.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class MetricaLetrasSequenciaTeste {

	@Test
	public void deveContarAQuantidadeDeSequenciaDeTresCaracteresEMultiplicarPorTres() {
		final CalculadoraMetricas m = new MetricaLetrasSequenciais();
		
		String texto = "";
		Assert.assertEquals(0, m.calcular(texto));
		
		texto = "abcdefghijklmnopqrstuvwxyz";
		Assert.assertEquals(-72, m.calcular(texto));
		
		texto = "zyxwvutsrqponmlkjihgfedcba";
		Assert.assertEquals(-72, m.calcular(texto));
		
		texto = "abcdefghijklmnopqrstuvwxyzzyxwvutsrqponmlkjihgfedcba";
		Assert.assertEquals(-72, m.calcular(texto));
		
		texto = "aBcDeFgHiJkLmNoPqRsTuVwXyZ";
		Assert.assertEquals(-72, m.calcular(texto));
		
		texto = "aBcDe4532FgHi235JkLmNoPqR235sTuVwXy235Z";
		Assert.assertEquals(-51, m.calcular(texto));
		
		texto = "aBcDe45vuts32FgHionmlk23onmlkji5JkmlkjLmNoPqR235sTusrqpVwXcby235Z";
		Assert.assertEquals(-51, m.calcular(texto));
		
		texto = "aBcDemlk23onmji5JkmlR235sTusqpVwXcby23Z";
		Assert.assertEquals(-21, m.calcular(texto));
		
		texto = "aBcDemlk2@3on33mji#$5JkmlR23$%5sTusqpVwXc-=by23Z";
		Assert.assertEquals(-18, m.calcular(texto));
	}
}
