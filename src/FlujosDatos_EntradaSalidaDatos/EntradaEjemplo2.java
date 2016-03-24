package FlujosDatos_EntradaSalidaDatos;

import javax.swing.*;

public class EntradaEjemplo2 {

	public static void main(String[] args) {

		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre ");

		String edad = JOptionPane.showInputDialog("introduce edad");

		int edad_usuario = Integer.parseInt(edad);

		System.out.println("Hola " + nombre_usuario + " tendras " + (edad_usuario + 1) + " anios");

		edad_usuario++;

		System.out.println("Hola " + nombre_usuario + " tendras 2º incremento " + (edad_usuario) + " anios");

	}

}
