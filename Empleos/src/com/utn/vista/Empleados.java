package com.utn.vista;

import java.time.LocalDate;

public class Empleados {
	private String nombre;
	private String apellido;
	private int sueldoBasicoMensual;
	private LocalDate fechaDeNacimiento;
	private LocalDate fechaActual;
	private float edad;

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

	public int getSueldoBasicoMensual() {
		return sueldoBasicoMensual;
	}

	public void setSueldoBasicoMensual(int sueldoBasicoMensual) {
		this.sueldoBasicoMensual = sueldoBasicoMensual;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public LocalDate getFechaActual() {
		return fechaActual;
	}

	public void setFechaActual(LocalDate fechaActual) {
		this.fechaActual = fechaActual;
	}

	public float getEdad() {
		return edad;
	}

	public void setEdad(float edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Empleados \nNombre: " + nombre + "\nApellido:" + apellido + "\nSueldo Basico Mensual: "
				+ sueldoBasicoMensual + "\nEdad: " + edad;
	}

	public Empleados(String nombre, String apellido, int sueldoBasicoMensual, LocalDate fechaDeNacimiento,
			LocalDate fechaAnual, float edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldoBasicoMensual = sueldoBasicoMensual;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.fechaActual = fechaActual;
		this.edad = edad;
	}
	public int obtenerSueldoTotal () {
		return 0;
		
	}

}
