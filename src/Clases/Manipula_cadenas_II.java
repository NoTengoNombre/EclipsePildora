package Clases;

public class Manipula_cadenas_II {

	public static void main(String args[]) {

//		Variable objeto de tipo String 
/////////////////////////////////10/(//////20////////30////////40/////		
////////////////////////0123456789012345678901234567890123456789012345		
		String frase = "Hoy es un estupendo dia para programar en Java";
		
		int cadena = frase.length();
		
		System.out.println(cadena);
		
		String frase_resumen = frase.substring(1,3);
		
		System.out.println(frase_resumen);

		String frase_resumen1 = frase.substring(29,45+1);
		System.out.println(frase_resumen1);
		String frase_resumen2 = frase.substring(29,46);
		System.out.println(frase_resumen2);
		
		String nueva_frase_larga = frase.substring(0,28) + " irnos a la playa y olvidarnos de todo....";
		
		int longitud = nueva_frase_larga.length();
		
		System.out.println(longitud);
		
		nueva_frase_larga.substring(0,22);
		
		System.out.println("-> "+nueva_frase_larga);

		
		
		
		
		
		
		
		
		
		
	}
}



