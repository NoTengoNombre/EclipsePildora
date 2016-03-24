package control_flujos.condicionales;

import java.util.Scanner;

public class Bucle_If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Intro edad ");

		int edad = entrada.nextInt();

		if (edad < 18) {
			System.out.println("Eres menor de edad");
		} else if (edad < 40) {
			System.out.println("Adulto");
		} else if (edad < 60) {
			System.out.println("Muy Adulto");
		} else if (edad < 70) {
			System.out.println("Eres viejo");
		} else {
			System.out.println("Cuidate");
		}

	}
}
