package com.utn.vista;

public class Pelicula {
	private String titulo;
	private int idPelicula;
	private int aņoPeli;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String nombrePelicula) {
		this.titulo = nombrePelicula;
	}
	public int getIdPelicula() {
		return idPelicula;
	}
	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}
	public int getAņoDeLaPelicula() {
		return aņoPeli;
	}
	public void setAņoDeLaPelicula(int aņoDeLaPelicula) {
		this.aņoPeli = aņoDeLaPelicula;
	}
	@Override
	public String toString() {
		return "Titulo: " + titulo + "\nId Pelicula: " + idPelicula + "\nAņo de lanzamiento de la pelicula: "
				+ aņoPeli;
	}
	public Pelicula(String titulo, int idPelicula, int aņoDeLaPelicula) {
		super();
		this.titulo = titulo;
		this.idPelicula = idPelicula;
		this.aņoPeli = aņoDeLaPelicula;
	}
}
