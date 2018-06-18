package com.utn.vista;

public class Tienda extends Juego{
	private int precio;
	public String getPrecio() {
		String precio$ = precio + "$";
		return precio$;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return super.toString() + "\nEl precio es: " + precio + "Sin DLCs";
	}

	public Tienda(String nombre, String nombreDeLaEmpresa, Object genero3, int peso, int precio) {
		super(nombre, nombreDeLaEmpresa, genero3, peso);
		this.precio = precio;
	}

}
