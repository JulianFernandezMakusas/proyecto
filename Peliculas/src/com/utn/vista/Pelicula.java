package com.utn.vista;

public class Pelicula {
	private String titulo;
	private int idPelicula;
	private int añoPeli;
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
	public int getAñoDeLaPelicula() {
		return añoPeli;
	}
	public void setAñoDeLaPelicula(int añoDeLaPelicula) {
		this.añoPeli = añoDeLaPelicula;
	}
	@Override
	public String toString() {
		return "Titulo: " + titulo + "\nId Pelicula: " + idPelicula + "\nAño de lanzamiento de la pelicula: "
				+ añoPeli;
	}
	public Pelicula(String titulo, int idPelicula, int añoDeLaPelicula) {
		super();
		this.titulo = titulo;
		this.idPelicula = idPelicula;
		this.añoPeli = añoDeLaPelicula;
	}
}
