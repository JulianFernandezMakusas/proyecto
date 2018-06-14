package com.utn.vista;

public class Juego {
	private String nombre;
	private int fechaDeLanzamiento;
	private String nombreDeLaEmpresa;
	private String genero;
	private int peso;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFechaDeLanzamiento() {
		return fechaDeLanzamiento;
	}

	public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
		this.fechaDeLanzamiento = fechaDeLanzamiento;
	}

	public String getNombreDeLaEmpresa() {
		return nombreDeLaEmpresa;
	}

	public void setNombreDeLaEmpresa(String nombreDeLaEmpresa) {
		this.nombreDeLaEmpresa = nombreDeLaEmpresa;
	}

	public String getGenero() {
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
		return "Nombre del videojuego: " + nombre + "\nCreadora del juego: " + nombreDeLaEmpresa
				+ "\nFecha de lanzamiento: " + fechaDeLanzamiento + "\nGenero del juego: " + genero + "Peso del juego: "
				+ peso;
	}

	public Juego(String nombre, int fechaDeLanzamiento, String nombreDeLaEmpresa, String genero, int peso) {
		super();
		this.nombre = nombre;
		this.fechaDeLanzamiento = fechaDeLanzamiento;
		this.nombreDeLaEmpresa = nombreDeLaEmpresa;
		this.genero = genero;
		this.peso = peso;
	}

}
