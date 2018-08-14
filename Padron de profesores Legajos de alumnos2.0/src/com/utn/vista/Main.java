package com.utn.vista;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

public class Main {

	public static void main(String[] args) throws IOException {
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
		ArrayList <Persona> lista = new ArrayList <Persona>();
		Persona profesor = null;
		Persona alumno = null;
		Path alumn = Paths.get("C:\\Users\\Java\\Desktop\\Padron de profesores Legajos de alumnos2.0\\Datos Alumno");
		Path prof = Paths.get("C:\\Users\\Java\\Desktop\\Padron de profesores Legajos de alumnos2.0\\Datos Profesor");
		JOptionPane.showMessageDialog(null, "Bienvenido", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);		
		int archivos = JOptionPane.showConfirmDialog(null, "¿Desea crear archivos?"); 
		if (archivos == 0) {
			try {
				Files.createFile(alumn);
				Files.createFile(prof);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(archivos == 1) {
			JOptionPane.showMessageDialog(null, "OK");
		}
		ObjectOutputStream lAlumno = new ObjectOutputStream (Files.newOutputStream(alumn));
		ObjectOutputStream lProfesor = new ObjectOutputStream (Files.newOutputStream(prof));
		while (JOptionPane.showOptionDialog(null, "¿Desea ingresar informaciòn?", "Informacion", siNo2,
				JOptionPane.INFORMATION_MESSAGE, null, siNo, 0) == 0) {
			int seleccion = JOptionPane.showOptionDialog(null, "Selecione una opcion", "Informaciòn", casos,
					JOptionPane.INFORMATION_MESSAGE, null, opciones, 0);
try {
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
				BufferedOutputStream iProfesor = new BufferedOutputStream(lProfesor);
				lProfesor.writeObject(profesor);
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
				BufferedOutputStream iAlumno = new BufferedOutputStream(lAlumno);
				lAlumno.writeObject(alumno);
				break;
			default:
			}
}catch (Exception ex) {
	JOptionPane.showMessageDialog(null, "Error, el programa se cerrara.");
}
		}
		for (int i = 0; i < lista.size(); i++) {
			JOptionPane.showMessageDialog(null, lista.get(i).toString(), "Programa", JOptionPane.DEFAULT_OPTION);
		}
		
	}
	
}
