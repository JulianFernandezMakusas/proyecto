package com.utn.vista;

import java.util.ArrayList;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
	int i = 0;
	String ns;
	Integer n = null;
	String ns2;
	int n2;
	String ns3;
	int n3;
	String ns4;
	int n4;
	String ns5;
	int n5;
	int resultado;
	int opcionS = 0;
	String[] opcionS1 = {"1", "2","3","4","5"};
	int opcion = 0;
	String[] operadores = {"Suma", "Resta", "Multiplicacion", "Division"};
	//inicio del programa
	int cantNumeros= JOptionPane.showOptionDialog(null, "¿Cuantos numeros desea ingresar?", "Programa", opcionS, JOptionPane.INFORMATION_MESSAGE, null, opcionS1, 0);
	int opciones = JOptionPane.showOptionDialog(null, "Seleccione el tipo de operacion", "Programa", opcion, JOptionPane.INFORMATION_MESSAGE, null, operadores, 0);
	switch (opciones) {
	case 0:
		if (cantNumeros == 0) {	
		ns = JOptionPane.showInputDialog("Ingrese un numero");
		n = Integer.parseInt(ns);
		resultado = suma(n);
		JOptionPane.showMessageDialog(null, resultado, "Programa", JOptionPane.INFORMATION_MESSAGE);
		}
		if (cantNumeros == 1) {
			ns = JOptionPane.showInputDialog("Ingrese un numero");
			n = Integer.parseInt(ns);
			ns2 = JOptionPane.showInputDialog("Ingrese un numero");
			n2 = Integer.parseInt(ns2);
			resultado = suma(n,n2);
			JOptionPane.showMessageDialog(null, resultado, "Programa", JOptionPane.INFORMATION_MESSAGE);
		}
		if (cantNumeros == 2) {
			ns = JOptionPane.showInputDialog("Ingrese un numero");
			n = Integer.parseInt(ns);
			ns2 = JOptionPane.showInputDialog("Ingrese un numero");
			n2 = Integer.parseInt(ns2);
			ns3 = JOptionPane.showInputDialog("Ingrese un numero");
			n3 = Integer.parseInt(ns3);
			resultado = suma (n,n2,n3);
			JOptionPane.showMessageDialog(null, resultado, "Programa", JOptionPane.INFORMATION_MESSAGE);
		}
		if (cantNumeros == 3) {
			ns = JOptionPane.showInputDialog("Ingrese un numero");
			n = Integer.parseInt(ns);
			ns2 = JOptionPane.showInputDialog("Ingrese un numero");
			n2 = Integer.parseInt(ns2);
			ns3 = JOptionPane.showInputDialog("Ingrese un numero");
			n3 = Integer.parseInt(ns3);
			ns4 = JOptionPane.showInputDialog("Ingrese un numero");
			n4 = Integer.parseInt(ns4);
			resultado = suma(n,n2,n3,n4);
			JOptionPane.showMessageDialog(null, resultado, "Programa", JOptionPane.INFORMATION_MESSAGE);
		}
		if (cantNumeros == 4) {
			ns = JOptionPane.showInputDialog("Ingrese un numero");
			n = Integer.parseInt(ns);
			ns2 = JOptionPane.showInputDialog("Ingrese un numero");
			n2 = Integer.parseInt(ns2);
			ns3 = JOptionPane.showInputDialog("Ingrese un numero");
			n3 = Integer.parseInt(ns3);
			ns4 = JOptionPane.showInputDialog("Ingrese un numero");
			n4 = Integer.parseInt(ns4);
			ns5 = JOptionPane.showInputDialog("Ingrese un numero");
			n5 = Integer.parseInt(ns5);
			resultado = suma(n,n2,n3,n4,n5);	
			JOptionPane.showMessageDialog(null, resultado, "Programa", JOptionPane.INFORMATION_MESSAGE);
		}
		break;
	case 1:
		if (cantNumeros == 0) {	
		ns = JOptionPane.showInputDialog("Ingrese un numero");
		n = Integer.parseInt(ns);
		resultado = resta(n);
		JOptionPane.showMessageDialog(null, resultado, "Programa", JOptionPane.INFORMATION_MESSAGE);
		}
		if (cantNumeros == 1) {
			ns = JOptionPane.showInputDialog("Ingrese un numero");
			n = Integer.parseInt(ns);
			ns2 = JOptionPane.showInputDialog("Ingrese un numero");
			n2 = Integer.parseInt(ns2);
			resultado = resta(n,n2);
			JOptionPane.showMessageDialog(null, resultado, "Programa", JOptionPane.INFORMATION_MESSAGE);
		}
		if (cantNumeros == 2) {
			ns = JOptionPane.showInputDialog("Ingrese un numero");
			n = Integer.parseInt(ns);
			ns2 = JOptionPane.showInputDialog("Ingrese un numero");
			n2 = Integer.parseInt(ns2);
			ns3 = JOptionPane.showInputDialog("Ingrese un numero");
			n3 = Integer.parseInt(ns3);
			resultado = resta (n,n2,n3);
			JOptionPane.showMessageDialog(null, resultado, "Programa", JOptionPane.INFORMATION_MESSAGE);
		}
		if (cantNumeros == 3) {
			ns = JOptionPane.showInputDialog("Ingrese un numero");
			n = Integer.parseInt(ns);
			ns2 = JOptionPane.showInputDialog("Ingrese un numero");
			n2 = Integer.parseInt(ns2);
			ns3 = JOptionPane.showInputDialog("Ingrese un numero");
			n3 = Integer.parseInt(ns3);
			ns4 = JOptionPane.showInputDialog("Ingrese un numero");
			n4 = Integer.parseInt(ns4);
			resultado = resta(n,n2,n3,n4);
			JOptionPane.showMessageDialog(null, resultado, "Programa", JOptionPane.INFORMATION_MESSAGE);
		}
		if (cantNumeros == 4) {
			ns = JOptionPane.showInputDialog("Ingrese un numero");
			n = Integer.parseInt(ns);
			ns2 = JOptionPane.showInputDialog("Ingrese un numero");
			n2 = Integer.parseInt(ns2);
			ns3 = JOptionPane.showInputDialog("Ingrese un numero");
			n3 = Integer.parseInt(ns3);
			ns4 = JOptionPane.showInputDialog("Ingrese un numero");
			n4 = Integer.parseInt(ns4);
			ns5 = JOptionPane.showInputDialog("Ingrese un numero");
			n5 = Integer.parseInt(ns5);
			resultado = resta(n,n2,n3,n4,n5);	
			JOptionPane.showMessageDialog(null, resultado, "Programa", JOptionPane.INFORMATION_MESSAGE);
		}
		break;
	case 2:
		multiplicacion();
		break;
	case 3:
		division();
		break;
	}
	}
	public static int suma (Integer... suma) {
		Integer sum = 0;
		for (int i : suma) {
			sum += i;
		}
		return sum;
	}
	public static int resta (Integer... numeros) {
		Integer res = 0;
		for (int i : numeros) {
			System.out.println(res);
			res -= i;
		}
		return res;
	}
	public static int multiplicacion (int... numeros) {
		int mul = 0;
		for (int i : numeros) {
			mul*= mul;
		}
		return mul;
	}
	public static int division (int... numeros) {
		int div = 0;
		for (int i : numeros) {
			div/= div;
		}
		return div;
	}
}
