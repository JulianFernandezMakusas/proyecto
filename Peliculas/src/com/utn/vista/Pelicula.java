package com.utn.vista;

public class Pelicula {
	private String titulo;
	private int idPelicula;
	private int a�oPeli;
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
	public int getA�oDeLaPelicula() {
		return a�oPeli;
	}
	public void setA�oDeLaPelicula(int a�oDeLaPelicula) {
		this.a�oPeli = a�oDeLaPelicula;
	}
	@Override
	public String toString() {
		return "Titulo: " + titulo + "\nId Pelicula: " + idPelicula + "\nA�o de lanzamiento de la pelicula: "
				+ a�oPeli;
	}
	public Pelicula(String titulo, int idPelicula, int a�oDeLaPelicula) {
		super();
		this.titulo = titulo;
		this.idPelicula = idPelicula;
		this.a�oPeli = a�oDeLaPelicula;
	}
}
