package paquete.exe;

import java.util.Stack;

import javax.swing.JOptionPane;

public class Pilas {

	public static void main(String[] args) {
		int optionType = 0;
		String[] options= { "Si", "No" };
		Stack<Character> pila = new Stack<Character>();
		while (JOptionPane.showOptionDialog(null, "Desea saber si una palabra es capicua", "boiiiiiiiiiiiiiii",
				optionType, JOptionPane.INFORMATION_MESSAGE, null, options, 0) == 0) {
		String texto = JOptionPane.showInputDialog(null, "Ingrese una palabra");
		String otxet = "";
		for (int i = 0; i < texto.length(); i++) {
			// System.out.println(texto.charAt(i));
			pila.push(texto.charAt(i));
		}
		for (int i = 0; i < texto.length(); i++) {
			// System.out.println(pila.peek());
			otxet += pila.pop();
		}
		if (texto.equalsIgnoreCase(otxet)) {
			JOptionPane.showMessageDialog(null, "Es capicua BOIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII: " + texto + " | " + otxet, "boiiiiiiiiiiiiiii",
					JOptionPane.DEFAULT_OPTION);
		} else {
			JOptionPane.showMessageDialog(null, "No es capicua BOIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII: ", "boiiiiiiiiiiiiiii",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	}
}