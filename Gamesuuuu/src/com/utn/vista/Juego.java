package com.utn.vista;

public class Juego {
	private String nombre;
	private String nombreDeLaEmpresa;
	private Object genero;
	private int peso;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreDeLaEmpresa() {
		return nombreDeLaEmpresa;
	}

	public void setNombreDeLaEmpresa(String nombreDeLaEmpresa) {
		this.nombreDeLaEmpresa = nombreDeLaEmpresa;
	}

	public Object getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "\nNombre del videojuego: " + nombre + "\nCreadora del juego: " + nombreDeLaEmpresa
				 + "\nGenero del juego: " + genero + "\nPeso del juego: "
				+ peso + " GB";
	}

	public Juego(String nombre, String nombreDeLaEmpresa, Object genero3, int peso) {
		super();
		this.nombre = nombre;
		this.nombreDeLaEmpresa = nombreDeLaEmpresa;
		this.genero = genero3;
		this.peso = peso;
	}

}
