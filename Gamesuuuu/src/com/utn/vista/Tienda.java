package com.utn.vista;

public class Tienda {
	private int precio;
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return super.toString() + "El precio es: " + precio + "Sin DLCs";
	}

	public Tienda(int precio) {
		super();
		this.precio = precio;
	}

}
