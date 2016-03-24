package control_flujos.bucles_iterativos_determinados.For;

import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {

		long resultado = 1l;

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Intro nº"));

		for (int i = numero; i > 0; i--) {
			resultado = resultado * i;
		}
		System.out.println("el factorial de " + numero + " es " + resultado);
	}
}
