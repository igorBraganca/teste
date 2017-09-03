package com.gumga.passwordmeter.services.calculadora;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetricasCondicionais implements CalculadoraMetricas {

	private final List<CalculadoraMetricas> calculadoras;

	@Autowired
	public MetricasCondicionais(@Qualifier("metrica-condicionais") List<CalculadoraMetricas> calculadoras) {
		this.calculadoras = calculadoras;
	}

	@Override
	public int calcular(String senha) {
		int quantidadeMetricasValidas = 0;
		int soma = 0;

		for (CalculadoraMetricas calculadoraMetricas : calculadoras) {
			if (calculadoraMetricas.calcular(senha) > 0) {
				quantidadeMetricasValidas++;
			}

			soma += calculadoraMetricas.calcular(senha);
		}

		if (quantidadeMetricasValidas > 1) {
			return soma;
		} else {
			return 0;
		}
	}
}
