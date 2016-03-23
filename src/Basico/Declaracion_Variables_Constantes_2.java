package Basico;

public class Declaracion_Variables_Constantes_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		final int c = 5; // Declaracion de una constante
//		c = 7; No se permite 
		final double apulgadas = 2.54;
		double cm = 6;
		double resultado = cm / apulgadas;

		System.out.println("En "+ cm + " cm hay " +(int)resultado + " pulgadas");
		cm = 10;
		System.out.println("En "+ cm + " cm hay " + cm/apulgadas + " pulgadas");

// Inicializarlas		
		final int a , b , c ; 
// Inicializarlas		
		final int operador1 , operador2 , resultado_final;
// Declaracion
		a = 3;
		b = 4;
		c = 5;
		
		operador1 = (int)(Math.random() * 10);
		operador2 = (int)(Math.random() * 10);
		
		resultado_final = operador1 + operador2;
		
		System.out.println(resultado_final);
		
		
		
	}
}
