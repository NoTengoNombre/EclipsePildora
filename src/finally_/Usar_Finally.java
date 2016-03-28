package finally_;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * Curso Java Excepciones VIII. Cláusula finally. Vídeo 149
 * 
 * https://www.youtube.com/watch?v=ywNucPv6flI&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=149
 */
public class Usar_Finally {

	public static void main(String[] args) {

		int figura = 0;

		// Este programa deja una conexion abierta con la consola y esa conexion
		// no es cerrada nunca , nos dice que liberemos el recurso porque el
		// tener la conexion abierta consume recursos de la maquina donde se
		// esta ejecutando este programa
		Scanner entrada = new Scanner(System.in);

		System.out.println("Elige una opcion : \n1 Cuadrado \n2 Rectangulo \n3 Triangulo \n4 Circulo");

		try {
			figura = entrada.nextInt(); // Final de la entrada de Scanner , aqui
										// ya
			// no se usa mas el Scanner
			// Detras de esta linea podemos cerrar la conexion
			// con el exterior
			// entrada.close(); // hemos cerrado la conexion con la consola
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error " + e.getMessage());
			System.out.println("Ha ocurrido un error " + e.getClass().getName());
		} finally {
			// Lo que se introduzca en este bloque SIEMPRE SE VA A EJECUTAR
			entrada.close(); // HACE QUE SE CIERRE LA CONSOLA AUNQUE LAS COSAS
								// VAYA BIEN O MAL
		}

		switch (figura) {
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.println("Area del cuadrado : " + Math.pow(lado, 2));
			break;
		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del rectangulo es : " + base * altura);
			break;
		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del triangulo : " + (base * altura) / 2);
			break;
		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			System.out.println("El area del circulo es ");
			System.out.println((Math.PI) * (Math.pow(radio, 2)));
			break;     
		default:
			System.out.println(" Opcion elegida : NO CORRECTA ");
		}

		// -------------------------------------------------------------------------------------------

		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		System.out.println("Si eres Hombre tu peso : " + (altura - 110) + " kg ");
		System.out.println("Si eres Mujer tu peso : " + (altura - 120) + " kg ");
	}

	static int figura;

}
