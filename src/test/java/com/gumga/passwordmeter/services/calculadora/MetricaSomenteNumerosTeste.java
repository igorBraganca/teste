package com.gumga.passwordmeter.services.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class MetricaSomenteNumerosTeste {

	@Test
	public void deveRetornarSomaQuantidadeLetrasCasoSoHajaLetras() {
		final CalculadoraMetricas m = new MetricaSomenteNumeros();

		String texto = "";
		Assert.assertEquals("deve retornar a quantidade de numeros caso so haja numeros para: \"" + texto + "\" retorno: 0", 0, m.calcular(texto));
		
		texto = "763598235987237";
		Assert.assertEquals("deve retornar a quantidade de numeros caso so haja numero para: \"" + texto + "\" retorno: -15", -15, m.calcular(texto));
		
		texto = "1234567890";
		Assert.assertEquals("deve retornar a quantidade de numeros caso so haja numero para: \"" + texto + "\" retorno: -10", -10, m.calcular(texto));
		
		texto = " xvkasdf1234567890";
		Assert.assertEquals("deve retornar a quantidade de numeros caso so haja numero para: \"" + texto + "\" retorno: 0", 00, m.calcular(texto));
		
		texto = "ABSDFAFKAFS1234567890";
		Assert.assertEquals("deve retornar a quantidade de numeros caso so haja numero para: \"" + texto + "\" retorno: 0", 0, m.calcular(texto));
		
		texto = "1234567890!@#$";
		Assert.assertEquals("deve retornar a quantidade de numeros caso so haja numero para: \"" + texto + "\" retorno: 0", 0, m.calcular(texto));
		
		texto = "7342dfgsdbzf";
		Assert.assertEquals("deve retornar a quantidade de numeros caso so haja numero para: \"" + texto + "\" retorno: 0", 0, m.calcular(texto));
		
		texto = "3462346 _34672346";
		Assert.assertEquals("deve retornar a quantidade de numeros caso so haja numero para: \"" + texto + "\" retorno: -17", -17, m.calcular(texto));
	}
}
