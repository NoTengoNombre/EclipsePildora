package Enumeration;

import java.util.Scanner;

public class Uso_Tallas1 {

	// enum Talla {
	// MINI, MEDIANO, GRANDE, MUY_GRANDE
	// };

	enum Talla {

		MINI("S"), MEDIANO("M"), GRANDE("L"), MUYGRANDE("XL");

		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}

		private String abreviatura;

		public String dame_abreviatura() {
			return abreviatura;
		}
	}

	public static void main(String[] args) {
		// Variable Objeto de Tipo Enum

		Talla s = Talla.MINI;

		Talla m = Talla.MEDIANO;

		Talla l = Talla.GRANDE;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una talla : ");

		String entrada_Datos = entrada.next().toUpperCase();

		Talla la_talla = Enum.valueOf(Talla.class, entrada_Datos);

		System.out.println("Talla= " + la_talla);
		
		System.out.println("Abreviatura ="+la_talla.dame_abreviatura());
	}
}
