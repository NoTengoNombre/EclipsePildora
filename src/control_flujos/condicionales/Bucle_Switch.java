package control_flujos.condicionales;

import java.util.Scanner;

import javax.swing.JOptionPane;

import org.omg.CORBA.SystemException;

public class Bucle_Switch {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Elige una opcion ");
		System.out.println("1 Cuadrado");
		System.out.println("2 Rectangulo ");
		System.out.println("3 Triangulo ");
		System.out.println("3 Area Circulo ");

		int figura = entrada.nextInt();

		switch (figura) {
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado "));
			System.out.println("El Area del Cuadrado es " + Math.pow(lado, 2));
			break;

		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base "));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

			System.out.println("El Area del Rectangulo es " + base * altura);
			break;

		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

			System.out.println("El area del Triangulo es " + (base * altura) / 2);
			break;

		case 4:

			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introdce el radio"));

			System.out.print("El area del Circulo es ");

			System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));

		case 5:
			System.out.println("\n Fin del Programa");
			break;
			
		default:
			System.out.println("La opcion no es correcta");
		}
	}
}
