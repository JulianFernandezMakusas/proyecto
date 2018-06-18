package com.utn.vista;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	public static final int BIBLIOTECA = 0;
	public static final int VER_TIENDA = 1;
	public static final int CARGAR_TIENDA = 2;
	public static final int COMPRAR_JUEGO = 3;
	public static final int SALIR = 4;
	private static final Object T = null;

	public static void main(String[] args) {
		String t;
		Biblioteca biblioteca = null;
		Tienda tienda = null;
		String nombre;
		String nombreDeLaEmpresa;
		String peso2;
		int peso;
		String precio2;
		int precio;
		int comprar;
		boolean descargado;
		// Biblioteca o Tienda
		String[] BoT = { "Biblioteca", "Ver tienda", "Cargar tienda", "Comprar juego", "Salir" };
		int bot = 0;
		int menu = 4;
		// opciones while
		String[] tienda2 = { "Si", "No" };
		int Tienda = 0;
		boolean opcion;
		// Genero
		String[] genero = { "Accion", "Aventura", "Carreras", "Deportes", "Disparos", "Estrategia", "Otros generos" };
		int genero2 = 0;
		Object genero3;
		// array de juegos
		ArrayList<Biblioteca> listaB = new ArrayList();
		ArrayList<Tienda> listaT = new ArrayList();
		int tamano = listaT.size();
		// inicio del programa
		JOptionPane.showMessageDialog(null, "Bienvenido");
		if (tamano == 0) {
			JOptionPane.showMessageDialog(null, "Se deben ingresar juegos", "Programa", 0);
			while (opcion = JOptionPane.showOptionDialog(null, "¿Desea ingresar juegos?", "Programa", Tienda,
					JOptionPane.INFORMATION_MESSAGE, null, tienda2, 0) == 0) {
				nombre = JOptionPane.showInputDialog("Ingrese el nombre del juego:");
				nombreDeLaEmpresa = JOptionPane.showInputDialog("Ingrese el nombre de la empresa desarrolladora");
				genero3 = JOptionPane.showInputDialog(null, "Seleccione el genero", "Programa",
						JOptionPane.INFORMATION_MESSAGE, null, genero, genero[0]);
				peso2 = JOptionPane.showInputDialog("Ingrese el peso del juego expresado en GB:");
				peso = Integer.parseInt(peso2);
				precio2 = JOptionPane.showInputDialog("Ingrese el precio del juego:");
				precio = Integer.parseInt(precio2);
				tienda = new Tienda(nombre, nombreDeLaEmpresa, genero3, peso, precio);
				listaT.add(tienda);
			}
		}
		do {
		menu = JOptionPane.showOptionDialog(null, "¿A que desea acceder?", "Programa", bot,
				JOptionPane.INFORMATION_MESSAGE, null, BoT, 0);
			switch (menu) {
			case BIBLIOTECA:
				if (listaB.size()== 0) {
					JOptionPane.showMessageDialog(null, "La biblioteca esta vacia, vaya a la tienda y compre algun juego", "Programa", JOptionPane.INFORMATION_MESSAGE);
				}
				for (int i = 0; i < listaB.size(); i++) {
					JOptionPane.showMessageDialog(null, (listaB.get(i).toString()), "Programa", JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case VER_TIENDA:
				for (int i = 0; i < listaT.size(); i++) {
					JOptionPane.showMessageDialog(null, (listaT.get(i).toString()), "Programa", JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case CARGAR_TIENDA:
				nombre = JOptionPane.showInputDialog("Ingrese el nombre del juego:");
				nombreDeLaEmpresa = JOptionPane.showInputDialog("Ingrese el nombre de la empresa desarrolladora");
				genero3 = JOptionPane.showInputDialog(null, "Seleccione el genero", "Programa",
						JOptionPane.INFORMATION_MESSAGE, null, genero, genero[0]);
				peso2 = JOptionPane.showInputDialog("Ingrese el peso del juego expresado en GB:");
				peso = Integer.parseInt(peso2);
				precio2 = JOptionPane.showInputDialog("Ingrese el precio del juego:");
				precio = Integer.parseInt(precio2);
				tienda = new Tienda(nombre, nombreDeLaEmpresa, genero3, peso, precio);
				listaT.add(tienda);
				break;
			case COMPRAR_JUEGO:
				for (int i = 0; i < listaT.size(); i++) {
					t = listaT.get(i).getNombre() + "\n" + listaT.get(i).getPrecio();
					int siNo = 0;
					int comprar2 = 0;
					comprar = JOptionPane.showConfirmDialog(null, "¿Comprar?" + t, "Programa", siNo, comprar2);
					if (comprar == JOptionPane.YES_OPTION) {
						descargado = true;
					}
					if (descargado = true) {
						listaB.add(biblioteca);
					}
				}
				break;
			case SALIR:
				JOptionPane.showMessageDialog(null, "Adios", "Programa", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
		} while (menu != SALIR);
	}

}
