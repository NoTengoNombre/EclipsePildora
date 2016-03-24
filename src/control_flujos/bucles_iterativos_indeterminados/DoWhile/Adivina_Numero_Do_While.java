package control_flujos.bucles_iterativos_indeterminados.DoWhile;

import java.util.Scanner;

public class Adivina_Numero_Do_While {

	public static void main(String[] args) {

		int aleatorio = (int) (Math.random() * 10);
	 // int aleatorio = 0;
	
		Scanner entrada = new Scanner(System.in);
		
		int intentos = 0;
		int numero = 0;

		do {
			// Si pongo aquí la instrucción en cada vuelta
			// Genera un numero nuevo
			// aleatorio = (int) (Math.random() * 10);

			intentos++; // cuenta los intentos

			System.out.println("Intro num");

			numero = entrada.nextInt();

			if (numero < aleatorio) {
				System.out.println("Numero mayor " + aleatorio);
			} else if (numero > aleatorio) {
				System.out.println("Numero menor " + aleatorio);

			}

		} while (numero != aleatorio);
		System.out.println(" Acierto : " + " numero de intentos " + intentos);
	}
}
