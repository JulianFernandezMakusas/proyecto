package com.utn.vista;

import java.util.Stack;

public class Palitos {
	//atributos
	private Stack<Fichas> palo = new Stack ();

	public Stack<Fichas> getPalo() {
		return palo;
	}

	public void setPalo(Stack<Fichas> palo) {
		this.palo = palo;
	}

	@Override
	public String toString() {
		return "Palitos [palo=" + palo + "]";
	}

	public Palitos(Stack<Fichas> palo) {
		super();
		this.palo = palo;
	}


	}
	
	
	

