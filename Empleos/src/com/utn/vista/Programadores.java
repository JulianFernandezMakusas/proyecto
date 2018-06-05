package com.utn.vista;

import java.time.LocalDate;

public class Programadores extends Empleados{
	private int horasExtras;
	private int bonoPorHoraExtra;
	private int sueldoTotal = obtenerSueldoTotal();
	public int getSueldoTotal() {
		return sueldoTotal;
	}
	public void setSueldoTotal(int sueldoTotal) {
		this.sueldoTotal = sueldoTotal;
	}
	public int getHorasExtras() {
		return horasExtras;
	}
	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
	public int getBonoPorHoraExtra() {
		return bonoPorHoraExtra;
	}
	public void setBonoPorHoraExtra(int bonoPorHoraExtra) {
		this.bonoPorHoraExtra = bonoPorHoraExtra;
	}
	@Override
	public String toString() {
		return super.toString()+ "\nHoras extras realizadas: " + horasExtras + "\nBono por hora extra: " + bonoPorHoraExtra + "\nSueldo Total: " + obtenerSueldoTotal();
	}
	public Programadores(String nombre, String apellido, int sueldoBasicoMensual,int horasExtras, int bonoPorHoraExtra, int dia, int mes, int año, LocalDate fechaDeNacimiento) {
		super(nombre,apellido,sueldoBasicoMensual, dia, mes, año, fechaDeNacimiento);
		this.horasExtras = horasExtras;
		this.bonoPorHoraExtra = bonoPorHoraExtra;
	}
	
	public int obtenerSueldoTotal () {
		int obtenerHorasExtras = horasExtras*bonoPorHoraExtra;
		int sueldoTotal = obtenerHorasExtras + getSueldoBasicoMensual();
		return (sueldoTotal);
	}
}
