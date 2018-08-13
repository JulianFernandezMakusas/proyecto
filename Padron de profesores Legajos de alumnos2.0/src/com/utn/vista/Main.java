package com.utn.vista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

public class Main {

	public static void main(String[] args) {
		
		int casos = 0;
		int siNo2 = 0;
		String nombre;
		String apellido;
		String dni;
		int dni2;
		String[] siNo = { "Si", "No" };
		String[] opciones = { "Profesor", "Alumno" };
		String nLegajo;
		int nLegajo2;
		String nPadron;
		int nPadron2;
		ArrayList<Persona> lista = new ArrayList<Persona>();
		Persona profesor = null;
		Persona alumno = null;
		JOptionPane.showMessageDialog(null, "Bienvenido", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
		while (JOptionPane.showOptionDialog(null, "¿Desea ingresar informaciòn?", "Informacion", siNo2,
				JOptionPane.INFORMATION_MESSAGE, null, siNo, 0) == 0) {
			int seleccion = JOptionPane.showOptionDialog(null, "Selecione una opcion", "Informaciòn", casos,
					JOptionPane.INFORMATION_MESSAGE, null, opciones, 0);
try {
		Charset cs = Charset.defaultCharset();
	
			switch (seleccion) {
			// profesor
			case 0:
				nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre", "Informaciòn", 1);
				apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido", "Informaciòn", 1);
				dni = JOptionPane.showInputDialog(null, "Ingrese su DNI", "Informaciòn", 1);
				dni2 = Integer.parseInt(dni);
				nPadron = JOptionPane.showInputDialog(null, "Ingrese su numero de padron", "Informaciòn", 1);
				nPadron2 = Integer.parseInt(nPadron);
				profesor = new Profesor(nombre, apellido, dni2, nPadron2);
				lista.add(profesor);
				Path Profesor = Paths.get("C:\\Users\\Raul\\Desktop\\Padron de profesores Legajos de alumnos2.0\\DatosProfesor");
				BufferedWriter eProfesor = Files.newBufferedWriter(Profesor, cs);
				BufferedReader lProfesor = Files.newBufferedReader(Profesor, cs);
				break;
			// alumno
			case 1:
				nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre", "Informaciòn", 1);
				apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido", "Informaciòn", 1);
				dni = JOptionPane.showInputDialog(null, "Ingrese su DNI", "Informaciòn", 1);
				dni2 = Integer.parseInt(dni);
				nLegajo = JOptionPane.showInputDialog(null, "Ingrese su numero de legajo", "Informaciòn", 1);
				nLegajo2 = Integer.parseInt(nLegajo);
				alumno = new Alumno(nombre, apellido, dni2, nLegajo2);
				lista.add(alumno);
				Path Alumno = Paths.get("C:\\Users\\Raul\\Desktop\\Padron de profesores Legajos de alumnos2.0\\DatosAlumno");
				BufferedWriter eAlumno = Files.newBufferedWriter(Alumno, cs);
				BufferedReader lAlumno = Files.newBufferedReader(Alumno, cs);
				break;
			default:
			}
}catch (Exception ex) {
	JOptionPane.showMessageDialog(null, "Error, el programa se cerrara.");
}
		}
		for (int i = 0; i < lista.size(); i++) {
			JOptionPane.showMessageDialog(null, (lista.get(i).toString()));
		}

	}

}
