package com.gumga.passwordmeter.services.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class MetricaQuantidadeCaracteresCaixaBaixaTeste {

	@Test
	public void deveRetornar2VezesTamnhoTextoMenosQuantidadeDeCaracteresCaixaBaixaPresenteNoTexto() {
		final CalculadoraMetricas m = new MetricaQuantidadeCaracteresCaixaBaixa();

		String texto = "";
		Assert.assertEquals("2 x (tamanho - quantidade_caracteres(\"" + texto + "\")) deve ser 0", 0, m.calcular(texto));

		texto = "125423561234612365468945";
		Assert.assertEquals("2 x (tamanho - quantidade_caracteres(\"" + texto + "\")) deve ser 0", 0, m.calcular(texto));
		
		texto = "jgbsdiugasidbgsdivighsadobtaweg(&¨%!@)(*&$#";
		Assert.assertEquals("2 x (tamanho - quantidade_caracteres(\"" + texto + "\")) deve ser 24", 24, m.calcular(texto));
		
		texto = "ABFYAUYFAKGEQIUXAKJGFA";
		Assert.assertEquals("2 x (tamanho - quantidade_caracteres(\"" + texto + "\")) deve ser 0", 0, m.calcular(texto));
		
		texto = "ABFYAUYFAKGEQIUXAKJGFAa";
		Assert.assertEquals("2 x (tamanho - quantidade_caracteres(\"" + texto + "\")) deve ser 44", 44, m.calcular(texto));
		
		texto = "AÁÀÃÂÄ";
		Assert.assertEquals("2 x (tamanho - quantidade_caracteres(\"" + texto + "\")) deve ser 0", 0, m.calcular(texto));
		
		texto = "AÁÀÃÂÄ2w6w7gwerygseyvw45usbeysveuy";
		Assert.assertEquals("2 x (tamanho - quantidade_caracteres(\"" + texto + "\")) deve ser 22", 22, m.calcular(texto));
		
		texto = "AÁÀÃÂÄBCÇDEÉÈÊËFGHIÍÌÎÏJKLMNOÓÒÕÔÖPQRSTUÚÙÛÜVWXYZ";
		Assert.assertEquals("2 x (tamanho - quantidade_caracteres(\"" + texto + "\")) deve ser 0", 0, m.calcular(texto));
		
		texto = "AÁÀÃÂÄBCÇDEÉÈÊËFGHIÍÌÎÏJKLMNOÓÒÕÔÖPQRSTUÚÙÛÜVWXYZaáàãâäbcçdeéèêëfghiíìîïjklmnoóòõôöpqrstuúùûüvwxyz";
		Assert.assertEquals("2 x (tamanho - quantidade_caracteres(\"" + texto + "\")) deve ser 144", 144, m.calcular(texto));
		
		texto = "jgbsdiugasidbgsdivighsadobta";
		Assert.assertEquals("2 x (tamanho - quantidade_caracteres(\"" + texto + "\")) deve ser 0", 0, m.calcular(texto));
	}
}
