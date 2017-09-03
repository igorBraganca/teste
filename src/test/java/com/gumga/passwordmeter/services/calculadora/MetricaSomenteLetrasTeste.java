package com.gumga.passwordmeter.services.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class MetricaSomenteLetrasTeste {

	@Test
	public void deveRetornarSomaQuantidadeLetrasCasoSoHajaLetras() {
		final CalculadoraMetricas m = new MetricaSomenteLetras();

		String texto = "";
		Assert.assertEquals("deve retornar a quantidade de letras caso so haja letra para: \"" + texto + "\" retorno: 0", 0, m.calcular(texto));
		
		texto = "kjafjygecrkuydxfkf";
		Assert.assertEquals("deve retornar a quantidade de letras caso so haja letra para: \"" + texto + "\" retorno: -18", -18, m.calcular(texto));
		
		texto = "KBDJHGSDIYSGDJ";
		Assert.assertEquals("deve retornar a quantidade de letras caso so haja letra para: \"" + texto + "\" retorno: -14", -14, m.calcular(texto));
		
		texto = "KBDJksjbgakaassagasgHGSDIYSGDJ";
		Assert.assertEquals("deve retornar a quantidade de letras caso so haja letra para: \"" + texto + "\" retorno: -30", -30, m.calcular(texto));
		
		texto = "KBDJksjbgakaassagasgHGSDIYSGDJáõê";
		Assert.assertEquals("deve retornar a quantidade de letras caso so haja letra para: \"" + texto + "\" retorno: 0", 0, m.calcular(texto));
		
		texto = "KBDJksjbgakaassagasgHGSDIYSGDJ!@#$";
		Assert.assertEquals("deve retornar a quantidade de letras caso so haja letra para: \"" + texto + "\" retorno: 0", 0, m.calcular(texto));
		
		texto = "KBDJksjbgakaassagasgHGSDIYSGDJ126";
		Assert.assertEquals("deve retornar a quantidade de letras caso so haja letra para: \"" + texto + "\" retorno: 0", 0, m.calcular(texto));
		
		texto = "KBDJksjbgakaassagasgHGSDIYSGDJ_";
		Assert.assertEquals("deve retornar a quantidade de letras caso so haja letra para: \"" + texto + "\" retorno: -31", -31, m.calcular(texto));
		
		texto = "KBDJksjbgakaass agasgHGSDIYSGDJ";
		Assert.assertEquals("deve retornar a quantidade de letras caso so haja letra para: \"" + texto + "\" retorno: -31", -31, m.calcular(texto));
	}
}
