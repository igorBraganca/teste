package com.gumga.passwordmeter.services.calculadora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContadorSequenciasDeTres {

	private final List<String> sequencias = new ArrayList<>();

	public ContadorSequenciasDeTres(String... sequencias) {
		this.sequencias.addAll(Arrays.asList(sequencias));
	}

	public int contar(String texto) {
		int soma = 0;

		Map<String, String> map = new HashMap<>();
		for (int i = 0; (i + 3) <= texto.length(); i++) {
			String substring = texto.substring(i, i + 3);

			for (String sequencia : sequencias) {
				if (sequencia.contains(substring) && !map.containsKey(substring)) {
					
					soma++;
					map.put(substring, substring);
					map.put(new StringBuilder(substring).reverse().toString(), new StringBuilder(substring).reverse().toString());
				}
			}
		}

		return soma;
	}
}
