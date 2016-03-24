package FlujosDatos_EntradaSalidaDatos;

//      pkt.pkt.clase
import java.util.Scanner;

public class Clase_Scanner {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce Nombre ");

		String nombre_usuario = entrada.nextLine();

		System.out.println("Introduce edad");

		int edad = entrada.nextInt();

//		Para sumar un 1 a la variable (edad) se hace de la siguiente forma : 
//		" " + (edad + 1) + " " 
//		Si se pone :
//		" " + edad + 1 + " " -> Concatena el valor y lo cual saldra : Ej -> 22 + 1 = 221 No 23
		System.out.println("Hola " + nombre_usuario + "\n el año que viene tendras " + (edad + 1) + " anios ");
		
		

	}
}
