package com.gumga.passwordmeter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.gumga.passwordmeter.services.calculadora.CalculadoraMetricas;

@Component
public class CalcularNotaService {
	private final List<CalculadoraMetricas> calculadoras;
	
	@Autowired
	public CalcularNotaService(List<CalculadoraMetricas> calculadoras, @Qualifier("metrica-condicionais") List<CalculadoraMetricas> remover) {
		this.calculadoras = calculadoras;
		this.calculadoras.removeAll(remover);
	}
	
	public int calcularNota(String senha) {
		int nota = 0;
		
		System.out.println("----------------------------------------------------- i");
		if(calculadoras != null) {
			for (CalculadoraMetricas calculadora : calculadoras) {
				System.out.println(calculadora.getClass().getName() + ": " + calculadora.calcular(senha));
				
				nota += calculadora.calcular(senha);
			}
		}
		System.out.println("----------------------------------------------------- f");
		
		if(nota <= 0) {
			return 0;
		} else if(nota >= 100) {
			return 100;
		}
		
		return nota;
	}
}
