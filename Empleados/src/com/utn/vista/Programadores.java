package com.utn.vista;

public class Programadores {
	private int bonoPerHora2;

	public int getBonoPerHora2() {
		return bonoPerHora2;
	}

	public void setBonoPerHora2(int bonoPerHora2) {
		this.bonoPerHora2 = bonoPerHora2;
	}

	@Override
	public String toString() {
		return "Programadores [bonoPerHora2=" + bonoPerHora2 + "]";
	}

	public Programadores(int bonoPerHora2) {
		super();
		this.bonoPerHora2 = bonoPerHora2;
	}
	
}
