package com.utn.vista;

import javax.swing.JOptionPane;

public class Main {
	static String[] caso = {"Programador","Vendedor"};
	final static int PROGRAMADOR = 0;
	final static int VENDEDOR = 1;

	public static void main(String[] args) {
		int casos = 0;
		JOptionPane.showMessageDialog(null, "Bienvenido.");
		JOptionPane.showOptionDialog(null, "Seleccione una de las opciones", 
				"Programa", casos, JOptionPane.INFORMATION_MESSAGE, null, caso, 0);
		switch (casos) {
		case PROGRAMADOR:
			JOptionPane.showMessageDialog(null, "algo muy racista, nigger", "Programador", JOptionPane.INFORMATION_MESSAGE);
			break;
		case VENDEDOR:
			
			break;
		}
	}

}
