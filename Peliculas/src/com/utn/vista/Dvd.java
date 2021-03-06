package com.utn.vista;

public class Dvd extends Pelicula implements Alquilables{
	
	private boolean alquilado;
	
	@Override
	public String toString() {
		return super.toString()+"\nAlquilada: " + alquilado;
	}

	public Dvd(String titulo, int idPelicula, int aņoDeLaPelicula, boolean alquilado) {
		super(titulo, idPelicula, aņoDeLaPelicula);
		this.alquilado = alquilado;
	}

	@Override
	public void alquilar() {
		alquilado = true;
	}

	@Override
	public void devolver() {
		alquilado = false;
	}

	@Override
	public boolean esAlquilado() {
		
		return alquilado;
	}

	
}
