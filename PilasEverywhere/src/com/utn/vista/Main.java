package com.utn.vista;

import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Main {
	final static int TAMANO = 10;

	public static void main(String[] args) {
		//clases
		Fichas ficha = null;
		Palitos palito1 = null;
		Palitos palito2 = null;
		Palitos palito3 = null;
		//palito
		Stack<Fichas> palo = new Stack ();
		ArrayList <Palitos> posicion = new ArrayList ();
		palito1 = new Palitos (palo);
		posicion.add(palito1);
		palito2 = new Palitos (palo);
		posicion.add(palito2);
		palito3= new Palitos (palo);
		posicion.add(palito3);
		//ficha
		String numDeFichasS;
		ficha = new Fichas (TAMANO);
		Stack <Fichas> fichas = new Stack ();
		palito1.getPalo().push(new Fichas(10));
		palito1.getPalo().push(new Fichas(9));
		palito1.getPalo().push(new Fichas(8));
		palito1.getPalo().push(new Fichas(7));
		palito1.getPalo().push(new Fichas(6));
		palito1.getPalo().push(new Fichas(5));
		palito1.getPalo().push(new Fichas(4));
		palito1.getPalo().push(new Fichas(3));
		palito1.getPalo().push(new Fichas(2));
		palito1.getPalo().push(new Fichas(1));
		
		
		//inicio del programa
		for (int i = 0; i < posicion.size(); i++) {
			System.out.println(i);
		}
		for (int i = 0; i < fichas.size(); i++) {
			System.out.println(i);
		}
	}
	public int jugada () {
		int movimientos = 0;
		
		
		movimientos++;
		return 0;
	}
}
