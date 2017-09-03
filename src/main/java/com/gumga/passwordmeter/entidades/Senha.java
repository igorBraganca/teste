package com.gumga.passwordmeter.entidades;

public class Senha {
	private String valor;
	private int nota;

	public Senha(String valor, int nota) {
		this.valor = valor;
		this.nota = nota;
	}
	
	@SuppressWarnings("unused")
	private Senha() {}

	public String getValor() {
		return valor;
	}

	public int getNota() {
		return nota;
	}
}
