package com.utn.vista;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class Main {
	public static final int PROGRAMADOR = 0;
	public static final int VENDEDOR = 1;

	public static void main(String[] args) {
		int sueldoTotal;
		// datos programador y vendedor
		Vendedores vendedor = null;
		Empleados programador = null;
		String nombre;
		String apellido;
		int sueldoBasicoMensual;
		String sueldoBasicoMensual2;
		// fechas
		int dia;
		String dia2;
		int mes;
		String mes2;
		int año;
		String año2;
		LocalDate fechaDeNacimiento;
		LocalDate fechaActual;
		float edad;
		// porcentaje de ventas
		String[] ventasSiNo = { "Si", "No" };
		int ventasSiNo2 = 0;
		// ventas
		String ventas2;
		int ventas;
		String porcentaje2;
		int porcentaje;
		int porcentajeTotal;
		// horas extras
		String[] positivoNegativo = { "Si", "No" };
		int positivoNegativo2 = 0;
		String horasExtras;
		int horasExtras2 = 0;
		String bonoPorHoraExtra;
		int bonoPorHoraExtra2 = 0;
		// opciones while
		String[] siNo = { "Si", "No" };
		int siNo2 = 0;
		// opciones programador/vendedor
		String[] programadorVendedor = { "Programador", "Vendedor" };
		int programadorVendedor2 = 0;
		// arraylist
		ArrayList<Empleados> lista = new ArrayList<Empleados>();
		// inicio del programa
		JOptionPane.showMessageDialog(null, "Bienvenido");

		try {

			while (JOptionPane.showOptionDialog(null, "¿Desea ingresar informacion?", "Informacion", siNo2,
					JOptionPane.INFORMATION_MESSAGE, null, siNo, 0) == 0) {
				int opciones2 = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Opciones",
						programadorVendedor2, JOptionPane.INFORMATION_MESSAGE, null, programadorVendedor, 0);
				switch (opciones2) {
				case PROGRAMADOR:
					nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del programador", "Programador",
							JOptionPane.INFORMATION_MESSAGE);
					apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del programador", "Apellido",
							JOptionPane.INFORMATION_MESSAGE);
					sueldoBasicoMensual2 = JOptionPane.showInputDialog(null, "Ingrese el sueldo del programador",
							"Sueldo", JOptionPane.INFORMATION_MESSAGE);
					sueldoBasicoMensual = Integer.parseInt(sueldoBasicoMensual2);
					dia2 = JOptionPane.showInputDialog(null, "Ingrese el dia de nacimiento de el programador",
							"Fecha de nacimiento", JOptionPane.INFORMATION_MESSAGE);
					dia = Integer.parseInt(dia2);
					mes2 = JOptionPane.showInputDialog(null, "Ingrese el mes de nacimiento de el programador",
							"Fecha de nacimiento", JOptionPane.INFORMATION_MESSAGE);
					mes = Integer.parseInt(mes2);
					año2 = JOptionPane.showInputDialog(null, "Ingrese el año de nacimiento de el programador",
							"Fecha de nacimiento", JOptionPane.INFORMATION_MESSAGE);
					año = Integer.parseInt(año2);
					fechaDeNacimiento = LocalDate.of(año, mes, dia);
					fechaActual = LocalDate.now();
					edad = ChronoUnit.YEARS.between(fechaDeNacimiento, fechaActual);
					if (JOptionPane.showOptionDialog(null, "¿Realizo horas extras?", "Horas extras", positivoNegativo2,
							JOptionPane.INFORMATION_MESSAGE, null, positivoNegativo, 0) == 0) {
						horasExtras = JOptionPane
								.showInputDialog("Ingrese la cantidad de horas extras que realizo el programador:");
						horasExtras2 = Integer.parseInt(horasExtras);
						bonoPorHoraExtra = JOptionPane.showInputDialog("Ingrese el valor del bono por horas extras:");
						bonoPorHoraExtra2 = Integer.parseInt(bonoPorHoraExtra);
					}
					programador = new Programadores(nombre, apellido, sueldoBasicoMensual, horasExtras2,
							bonoPorHoraExtra2, fechaDeNacimiento, fechaActual, edad);
					lista.add(programador);
					break;
				case VENDEDOR:
					nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del vendedor", "Vendedor",
							JOptionPane.INFORMATION_MESSAGE);
					apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del vendedor", "Apellido",
							JOptionPane.INFORMATION_MESSAGE);
					sueldoBasicoMensual2 = JOptionPane.showInputDialog(null, "Ingrese el sueldo del vendedor", "Sueldo",
							JOptionPane.INFORMATION_MESSAGE);
					sueldoBasicoMensual = Integer.parseInt(sueldoBasicoMensual2);
					dia2 = JOptionPane.showInputDialog(null, "Ingrese el dia de nacimiento de el vendedor",
							"Fecha de nacimiento", JOptionPane.INFORMATION_MESSAGE);
					dia = Integer.parseInt(dia2);
					mes2 = JOptionPane.showInputDialog(null, "Ingrese el mes de nacimiento de el vendedor",
							"Fecha de nacimiento", JOptionPane.INFORMATION_MESSAGE);
					mes = Integer.parseInt(mes2);
					año2 = JOptionPane.showInputDialog(null, "Ingrese el año de nacimiento de el vendedor",
							"Fecha de nacimiento", JOptionPane.INFORMATION_MESSAGE);
					año = Integer.parseInt(año2);
					fechaDeNacimiento = LocalDate.of(año, mes, dia);
					fechaActual = LocalDate.now();
					edad = ChronoUnit.YEARS.between(fechaDeNacimiento, fechaActual);
					if (JOptionPane.showOptionDialog(null, "¿Realizo ventas?", "Ventas", ventasSiNo2,
							JOptionPane.INFORMATION_MESSAGE, null, ventasSiNo, 0) == 0) {
						ventas2 = JOptionPane.showInputDialog("Ingrese el valor total de las ventas realizadas");
						ventas = Integer.parseInt(ventas2);
						porcentaje2 = JOptionPane
								.showInputDialog("Ingrese el porcentaje que le corresponde al vendedor");
						porcentaje = Integer.parseInt(porcentaje2);
						vendedor = new Vendedores(nombre, apellido, sueldoBasicoMensual, ventas, porcentaje,
								fechaDeNacimiento, fechaActual, edad);
						lista.add(vendedor);
					}
					break;
				}
			} // fin del while
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Ha ocurrido un error, se cerrara el programa.", "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		for (int i = 0; i < lista.size(); i++) {
			JOptionPane.showMessageDialog(null, lista.get(i).toString(), "Programador",
					JOptionPane.INFORMATION_MESSAGE);
		}
		// mayor sueldo
		int Ia = 0;
		int mayorSueldo = lista.get(0).getSueldoBasicoMensual();
		int sumxDeTodxsLxsSueldxs = 0;
		for (int i = 0; i < lista.size(); i++) {
			if (mayorSueldo < lista.get(i).getSueldoBasicoMensual()) {
				mayorSueldo = lista.get(i).getSueldoBasicoMensual();
				Ia = i;
			}
			sumxDeTodxsLxsSueldxs = sumxDeTodxsLxsSueldxs + lista.get(i).obtenerSueldoTotal();
		}
		JOptionPane.showMessageDialog(null, "El mejor sueldo es: " + lista.get(Ia), "Best sueldo islas caiman",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"La cantidad de dinero que debe desenbolsar la empresa es: " + sumxDeTodxsLxsSueldxs, "Programa",
				JOptionPane.INFORMATION_MESSAGE);
	}// fin del main
}
