package Enumeration;

import java.util.Scanner;

public class Uso_Tallas {

	// enum Talla { Mini , Mediano , Grande , Muy_Grande };

	enum Talla {

		MINI("s"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}

		public String dameAbreviatura() {
			return abreviatura;
		}

		private String abreviatura;
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe una talla : Mini , Mediano , Grande , MuyGrande");
		String leer = entrada.next().toUpperCase();
		
		Talla la_talla = Enum.valueOf(Talla.class, leer);
		
		System.out.println("Talla = " + la_talla);
		
		System.out.print("Abreviatura = " +la_talla.dameAbreviatura());

	}

}
