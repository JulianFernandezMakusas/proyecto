package com.utn.vista;

import java.util.Stack;

public class Fichas {
	//atributos
	private int tamano;
	public int getTamano() {
		return tamano;
	}
	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	@Override
	public String toString() {
		return "Fichas [tamano=" + tamano ;
	}
	public Fichas(int tamano) {
		super();
		this.tamano = tamano;
	}
	
	
}
