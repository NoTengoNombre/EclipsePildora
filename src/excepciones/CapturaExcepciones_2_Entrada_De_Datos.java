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
 * https://www.youtube.com/watch?v=JiL_NlD-f2I&index=143&list=
 * PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk#t=0.304 Curso Java. Excepciones III.
 * throws try catch. Vídeo 144 *
 * 
 * @author PORTATIL
 *
 */
public class CapturaExcepciones_2_Entrada_De_Datos {

	public static void main(String[] args) {

		System.out.println("Que deseas Hacer ?");
		System.out.println("1. Introducir Datos");
		System.out.println("2. Salir del Programa");

		Scanner entrada = new Scanner(System.in);
		int decision = entrada.nextInt();

		if (decision == 1) {
			pedirDatos();
		} else {
			System.out.println("Adios");
			System.exit(0);
		}
		entrada.close();
	}

	static void pedirDatos() throws InputMismatchException {

		try {

			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduce tu nombre ");
			String nombre_usuario = entrada.nextLine();

			System.out.println("Introduce edad ");

			int edad = entrada.nextInt();

			System.out.println("Hola " + nombre_usuario + " El anio que viene tendras " + (edad + 1) + " anios");
			entrada.close();
		} catch (InputMismatchException e) {
			System.out.println("Qué demonios has introducido : " + e.getMessage());
		}
		System.out.println("Hemos terminado");
	}
}










