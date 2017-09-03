package com.gumga.passwordmeter.services.calculadora;

import java.util.Objects;

public class ContadorCarcteresConsecutivos {

	private final String caracteres;

	public ContadorCarcteresConsecutivos(final String listaCaracteresContar) {
		Objects.requireNonNull(listaCaracteresContar);

		caracteres = listaCaracteresContar;
	}

	public int contarQuantidadeCaracteresConsecutivos(String texto) {
		int quantidade = 0;

		for (int i = 0; i < texto.length(); i++) {
			if (caracteres.contains(String.valueOf(texto.charAt(i)))) {
				quantidade++;
			}
		}

		return quantidade;
	}
}
