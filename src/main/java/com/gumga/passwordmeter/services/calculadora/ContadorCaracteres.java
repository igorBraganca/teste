package com.gumga.passwordmeter.services.calculadora;

import java.util.Objects;

public class ContadorCaracteres {

	private final String caracteres;

	public ContadorCaracteres(final String listaCaracteresContar) {
		Objects.requireNonNull(listaCaracteresContar);

		caracteres = listaCaracteresContar;
	}

	public int contarQuantidadeCaracteres(String texto) {
		int quantidade = 0;

		for (int i = 0; i < texto.length(); i++) {
			if (caracteres.contains(String.valueOf(texto.charAt(i)))) {
				quantidade++;
			}
		}

		return quantidade;
	}
}
