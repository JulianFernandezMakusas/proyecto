package com.utn.vista;

public class Biblioteca extends Juego{
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

	public Biblioteca(String nombre, String nombreDeLaEmpresa, String genero, int peso,boolean descagado) {
		super(nombre, nombreDeLaEmpresa, genero, peso);
		this.descargado = descagado;
	}
}
