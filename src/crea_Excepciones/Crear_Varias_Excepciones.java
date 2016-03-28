package crea_Excepciones;

import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * https://www.youtube.com/watch?v=Ai4BI5G7Jx4&index=147&list=
 * PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk#t=4.967145
 * 
 * @author PORTATIL
 * 
 *         Curso Java Excepciones VII. Captura de varias excepciones. Vídeo 148
 */
public class Crear_Varias_Excepciones {

	public static void main(String[] args) {

		try {
			division();
		} catch (ArithmeticException e) {
			System.out.println("No permite division por 0 : " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("No has introducido un numero entero : " + e.getMessage());
			System.out.println(e.getMessage());
			System.out.println("Se ha generado un error de este tipo : " + e.getClass().getName());
		}
	}

	static void division() {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));

		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));

		System.out.println("El resultado es : " + num1 / num2);

	}
}
