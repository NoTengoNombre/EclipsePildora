package control_flujos.bucles_iterativos_indeterminados.While;

import java.util.Scanner;

public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println((byte) (Math.random() * 100));

		int ale_b = (byte) (Math.random() * 100);
		int aleatorio = (int) (Math.random() * 10);

		Scanner entrada = new Scanner(System.in);

		int numero = 0;

		int intentos = 0;

		while (numero != aleatorio) {

			intentos++;

			System.out.println("Intro num : ");

			numero = entrada.nextInt();

			if (aleatorio < numero) { // evalua
				System.out.println("Mas bajo");
			}

			else if (aleatorio > numero) {
				System.out.println("Mas alto");
			}
		} // cierre while

		System.out.println("Correcto . Lo has conseguidos en " + intentos + " intentos ");
	}
}
