package com.gumga.passwordmeter.services.calculadora;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MetricasCondicionaisTeste {

	@Test
	public void deveRetornarSomaDasMetricasCasoMaisDeUmaValida() {
		List<CalculadoraMetricas> metricasCondicionais = new ArrayList<>();

		metricasCondicionais.add(new MetricaQuantidadeAlgarismos());
		metricasCondicionais.add(new MetricaQuantidadeCaracteresCaixaAlta());
		metricasCondicionais.add(new MetricaQuantidadeCaracteresCaixaBaixa());

		final CalculadoraMetricas m = new MetricasCondicionais(metricasCondicionais);

		String texto = "";
		Assert.assertEquals("soma dos resultados das demais metricas para \"" + texto + "\" deve ser 0", 0, m.calcular(texto));

		texto = "872357235789467846";
		Assert.assertEquals("soma dos resultados das demais metricas para \"" + texto + "\" deve ser 0", 0, m.calcular(texto));

		texto = "kfgasjbfasdgntkjshgcniaustg";
		Assert.assertEquals("soma dos resultados das demais metricas para \"" + texto + "\" deve ser 0", 0, m.calcular(texto));

		texto = "HBSDVIYTEGCTRKYUXGEKUNGC";
		Assert.assertEquals("soma dos resultados das demais metricas para \"" + texto + "\" deve ser 0", 0, m.calcular(texto));

		texto = "kdjhbd872645grt";
		Assert.assertEquals("soma dos resultados das demais metricas para \"" + texto + "\" deve ser 36", 36, m.calcular(texto));

		texto = "KASDFGICEKNkishgcisugfs";
		Assert.assertEquals("soma dos resultados das demais metricas para \"" + texto + "\" deve ser 46", 46, m.calcular(texto));

		texto = "kjsdfgincuKJHRCTJYKNE7892635986235";
		Assert.assertEquals("soma dos resultados das demais metricas para \"" + texto + "\" deve ser 146", 146, m.calcular(texto));
	}
}
