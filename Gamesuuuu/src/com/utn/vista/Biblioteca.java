package com.utn.vista;

public class Biblioteca {
	private boolean descargado;

	public boolean isDescagado() {
		return descargado;
	}

	public void setDescagado(boolean descagado) {
		this.descargado = descagado;
	}

	@Override
	public String toString() {
		return super.toString() + descargado;
	}

	public Biblioteca(boolean descagado) {
		super();
		this.descargado = descagado;
	}
}
