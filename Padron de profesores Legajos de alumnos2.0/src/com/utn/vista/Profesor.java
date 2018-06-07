package com.utn.vista;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Profesor extends Persona implements MetodosAbstractos {
	private int padron;
	private LocalTime horaDeIngreso;
	private LocalTime horaDeEgreso;

	public int getPadron() {
		return padron;
	}

	public void setPadron(int padron) {
		this.padron = padron;
	}

	public LocalTime getHoraDeIngreso() {
		return horaDeIngreso;
	}

	public void setHoraDeIngreso(LocalTime horaDeIngreso) {
		this.horaDeIngreso = horaDeIngreso;
	}

	public LocalTime getHoraDeEgreso() {
		return horaDeEgreso;
	}

	public void setHoraDeEgreso(LocalTime horaDeEgreso) {
		this.horaDeEgreso = horaDeEgreso;
	}

	@Override
	public String toString() {
		return "Profesor\n" + super.toString() + "\n" + "Numero de padron: " + padron + "\nHora de ingreso: "
				+ horaDeIngreso + "\nHora de egreso: " + horaDeEgreso + "\nHoras trabajadas: " + calcularHora();
	}

	public Profesor(String nombre, String apellido, int dni, int padron, LocalTime horaDeIngreso,
			LocalTime horaDeEgreso) {
		super(nombre, apellido, dni);
		this.padron = padron;
		this.horaDeIngreso = horaDeIngreso;
		this.horaDeEgreso = horaDeEgreso;
	}

	@Override
	public float calcularHora() {
		float horas = ChronoUnit.HOURS.between(horaDeIngreso, horaDeEgreso);
		return horas;
	}

}
