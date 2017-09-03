package com.gumga.passwordmeter.services.calculadora;

import java.util.Objects;

public class ContadorCarcteresConsecutivos {

	private final String caracteres;

	public ContadorCarcteresConsecutivos(final String listaCaracteresContar) {
		Objects.requireNonNull(listaCaracteresContar);

		caracteres = listaCaracteresContar;
	}

	public int contarQuantidadeCaracteresConsecutivos(String texto) {
		int consecutivo = 0;
		int soma = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);

			if (caracteres.contains(String.valueOf(c))) {
				if (consecutivo > 0) {
					soma++;
				}

				consecutivo++;
			} else {
				consecutivo = 0;
			}
		}
		
		return soma;
	}
}
