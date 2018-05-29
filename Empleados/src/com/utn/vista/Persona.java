package com.utn.vista;

public class Persona {
	private String nombre;
	private String apellido;
	private int sbm2;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getSbm2() {
		return sbm2;
	}
	public void setSbm2(int sbm2) {
		this.sbm2 = sbm2;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", sbm2=" + sbm2 + "]";
	}
	public Persona(String nombre, String apellido, int sbm2) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sbm2 = sbm2;
	}
	
	
}
