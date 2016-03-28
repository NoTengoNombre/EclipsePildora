package excepciones;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * https://www.youtube.com/watch?v=BIiVraKyOlU&list=
 * PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=145
 * 
 * Curso Java Excepciones IV. throws try catch. Vídeo 145
 * 
 * @author PORTATIL
 *
 */
public class CapturaExcepciones_3_Entrada_De_Datos_Mejorando_Donde_Lanzar_try_catch {

	public static void main(String[] args) {

		System.out.println("Que deseas Hacer ?");
		System.out.println("1. Introducir Datos");
		System.out.println("2. Salir del Programa");

		Scanner entrada = new Scanner(System.in);
		int decision = entrada.nextInt();

		if (decision == 1) {

			try {
				pedirDatos();
			} catch (InputMismatchException e) {
				String ms = e.getMessage();
				System.out.println("mensaje de error : " + ms);
			}
		} else {
			System.out.println("Adios");
			System.exit(0);
		}
		entrada.close();
	}

	/**
	 * Significa que el dato lanzado no es el esperado , espera un int le llega
	 * un String
	 */
	static void pedirDatos() throws InputMismatchException {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nombre ");
		String nombre_usuario = entrada.nextLine();

		System.out.println("Introduce edad ");

		int edad = entrada.nextInt();

		System.out.println("Hola " + nombre_usuario + " El anio que viene tendras " + (edad + 1) + " anios");
		entrada.close();
		System.out.println("Hemos terminado");
	}
}
