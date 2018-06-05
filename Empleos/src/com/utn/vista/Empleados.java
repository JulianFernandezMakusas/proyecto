package com.utn.vista;

import java.time.LocalDate;

public class Empleados {
	private String nombre;
	private String apellido;
	private int sueldoBasicoMensual;
	private int dia;
	private int mes;
	private int año;
	private LocalDate fechaDeNacimiento = LocalDate.of(dia, mes, año);
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
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	@Override
	public String toString() {
		return "Empleados \nNombre: " + nombre + "\nApellido:" + apellido + "\nSueldo Basico Mensual: " + sueldoBasicoMensual
				+ "\nDia: " + dia + "\nMes: " + mes + "\nAño: " + año + "\nFecha De Nacimiento: " + fechaDeNacimiento;
	}
	public Empleados(String nombre, String apellido, int sueldoBasicoMensual, int dia, int mes, int año,
			LocalDate fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldoBasicoMensual = sueldoBasicoMensual;
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	
	
	
}
