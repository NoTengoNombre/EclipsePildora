package excepciones;

import javax.swing.JOptionPane;

/**
 * Curso Java. Excepciones I. Vídeo 142
 * https://www.youtube.com/watch?v=QSohwTY04Go&list=
 * PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=142
 * 
 * @author PORTATIL
 *
 */
public class Fallos {

	public static void main(String[] args) {
		int[] mi_matriz = new int[5];

		mi_matriz[0] = 5;
		mi_matriz[1] = 38;
		mi_matriz[2] = -15;
		mi_matriz[3] = 92;
		mi_matriz[4] = 71;

		for (int i = 0; i < 5; i++) {
			System.out.println("Posicion " + i + " = " + mi_matriz[i]);
		}

		String nombre = JOptionPane.showInputDialog("introduce tu nombre");

		int edad = Integer.parseInt(JOptionPane.showInputDialog("introduce tu edad"));

		System.out.println("Hola " + nombre + " tienes " + edad + " anios " + "termina el programa");

	}
}
