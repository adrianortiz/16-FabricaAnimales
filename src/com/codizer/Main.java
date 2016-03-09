package com.codizer;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Animal animal;
		int op = 0;
		
		while ( !(op == 4)) {
			
			String opcion = JOptionPane.showInputDialog("Crear animal"
					+ "\n 1. Perro"
					+ "\n 2. Gato"
					+ "\n 3. Zorro"
					+ "\n 4. Salir");
			
			op = Integer.parseInt(opcion);
			
			if (op == 4) {
				JOptionPane.showMessageDialog(null, "Adios");
				System.exit(0);
			} else {
				animal = Fabrica.crearObjeto(op);
				JOptionPane.showMessageDialog(null, animal.comer());
			}
		}
	}

}
