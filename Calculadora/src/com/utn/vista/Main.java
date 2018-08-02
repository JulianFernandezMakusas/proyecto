package com.utn.vista;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String... args) {
		
		JOptionPane.showMessageDialog(null, "La suma es: " + suma(args), "suma", 1);
		
	}
	public static int suma (String [] argumentos) {
		int resultado=0;
		for (String numero : argumentos) {			
			resultado += Integer.parseInt(numero);
		}
		return resultado;
	}
}
