package com.utn.vista;

public class BluRay extends Pelicula{

	private String idioma;

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	@Override
	public String toString() {
		return "\nIdioma: " + idioma;
	}
	public BluRay(String titulo, int idPelicula, int a�oDeLaPelicula, String idioma) {
		super(titulo, idPelicula, a�oDeLaPelicula);
		this.idioma = idioma;
	}
}
