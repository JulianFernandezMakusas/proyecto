package com.utn.vista;

import javax.swing.JOptionPane;

public class Main {
	
	static String n2;
	public static void main(String[] args) {
		int i;
		String i2 = JOptionPane.showInputDialog("Ingrese un numero: ");
		i = Integer.parseInt(i2);
		factorial(i);
	}
	public static int factorial (int i) {

		if (i>1) {
		i = i * (factorial(i-1));
		System.out.println(i);
		} 
		return i;
	}
}