package com.utn.vista;

import java.util.ArrayList;
import java.util.Locale;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;


public class Main {
	public static final int DVD = 0;
	public static final int BLURAY = 1;

	public static void main(String[] args) {
		int alquiladas = 0;
		Dvd nDvd = null;
		BluRay nBluRay = null;
		// Tipo de pelicula
		int opcion = 0;
		String[] opcionS = { "Si", "No" };
		int opciones = 0;
		String[] opcionesS = { "DVD", "BluRay" };
		// Alquilada = SI/NO
		int alquiladaSN = 0;
		// Pelicula
		String titulo;
		String idPelicula2;
		int idPelicula;
		String añoPeli2;
		int añoPeli;
		// dvd
		int alquilada2;
		boolean alquilada = false;
		// BluRay
		String idioma;
		// memoria de las peliculas
		ArrayList<Pelicula> lista = new ArrayList<Pelicula>();
		// inicio del programa
		while (JOptionPane.showOptionDialog(null, "Bienvenido, ¿Desea ingresar informacion?", "Programa",
				JOptionPane.INFORMATION_MESSAGE, opcion, null, opcionS, JOptionPane.INFORMATION_MESSAGE) == 0) {
			opciones = JOptionPane.showOptionDialog(null, "¿Que tipo de Pelicula es?", "Programa", opciones,
					+JOptionPane.INFORMATION_MESSAGE, null, opcionesS, JOptionPane.INFORMATION_MESSAGE);
			switch (opciones) {
			case DVD://
				titulo = JOptionPane.showInputDialog("Ingrese el nombre de la pelicula: ");
				idPelicula2 = JOptionPane.showInputDialog("Ingrese el numer id de la pelicula");
				idPelicula = Integer.parseInt(idPelicula2);
				añoPeli2 = JOptionPane.showInputDialog("Ingrese el año de la pelicula: ");
				añoPeli = Integer.parseInt(añoPeli2);
				alquilada2 = JOptionPane.showConfirmDialog(null, "¿Esta alquilada?", "Programa", alquiladaSN,
						JOptionPane.INFORMATION_MESSAGE);
				if (alquilada2 == JOptionPane.NO_OPTION) {
					alquilada = false;
				}
				if (alquilada2 == JOptionPane.YES_OPTION) {
					alquilada = true;
				}
				if (alquilada2 == JOptionPane.CANCEL_OPTION) {
					JOptionPane.showMessageDialog(null, "El programa se va a cerrar", "Programa", 0);
				}
				nDvd = new Dvd(titulo, idPelicula, añoPeli, alquilada);
				lista.add(nDvd);
				break;
			case BLURAY:
				titulo = JOptionPane.showInputDialog("Ingrese el nombre de la pelicula: ");
				idPelicula2 = JOptionPane.showInputDialog("Ingrese el numer id de la pelicula");
				idPelicula = Integer.parseInt(idPelicula2);
				añoPeli2 = JOptionPane.showInputDialog("Ingrese el año de la pelicula: ");
				añoPeli = Integer.parseInt(añoPeli2);
				idioma = JOptionPane.showInputDialog("Ingrese el idioma");
				nBluRay = new BluRay(titulo, idPelicula, añoPeli, idioma);
				lista.add(nBluRay);
				break;
			}
		}
		for (Pelicula peli : lista) {
			if (peli instanceof Dvd) {
				JOptionPane.showMessageDialog(null, peli.toString(), "Programa", JOptionPane.INFORMATION_MESSAGE);
				if (((Dvd) peli).esAlquilado() == true) {
					alquiladas++;					
				}
			}
	}
		for (Pelicula año : lista) {
			if (2018 == año.getAñoDeLaPelicula()) {
				JOptionPane.showMessageDialog(null, año.toString(), "Programa", JOptionPane.INFORMATION_MESSAGE);
			}				
		}
		JOptionPane.showMessageDialog(null, "Las peliculas alquiladas son: " + alquiladas, "Programa",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
