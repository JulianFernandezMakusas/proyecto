package com.utn.vista;

import java.time.LocalDate;

public class Vendedores extends Empleados {
	private int ventas;
	private int porcentaje;
	private int sueldoTotal = obtenerSueldoTotal();

	public int getSueldoTotal() {
		return sueldoTotal;
	}

	public void setSueldoTotoal(int sueldoTotoal) {
		this.sueldoTotal = sueldoTotoal;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public String toString() {
		return super.toString() + "\nVentas: " + ventas + "\nPorcentaje:" + porcentaje + "\nSueldo Total: "
				+ obtenerSueldoTotal();
	}

	public Vendedores(String nombre, String apellido, int sueldoBasicoMensual, int ventas, int porcentaje,
			LocalDate fechaDeNacimiento, LocalDate fechaActual,float edad) {
		super(nombre, apellido, sueldoBasicoMensual, fechaDeNacimiento, fechaActual,edad);
		this.ventas = ventas;
		this.porcentaje = porcentaje;
	}
	@Override
	public int obtenerSueldoTotal() {
		int porcentajeTotal = (ventas * porcentaje) / 100;
		int sueldoTotal = getSueldoBasicoMensual() + porcentajeTotal;
		return (sueldoTotal);
	}
}
