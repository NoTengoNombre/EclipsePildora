package Clases;

public class Clase_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mi_nombre = "Anto";

		String mi_nombre2 = "abcd";

		mi_nombre.length();

		System.out.println(mi_nombre.length());

		System.out.println(mi_nombre.charAt(2));

		System.out.println(mi_nombre.equals(mi_nombre2));

		System.out.println(mi_nombre.substring(0, 2));

		System.out.println(mi_nombre.equalsIgnoreCase(mi_nombre2));

		////////////////////////////////////////////////////
		//////////////// PRACTICA ///////////////////////////
		////////////////////////////////////////////////////
		//////////////// 012345678
		String nombre = "SinNombre";
		System.out.println("Mi nombre es : " + nombre);

		System.out.println("Mi nombre tiene : " + nombre.length() + " letras ");

		System.out.println("Mi primera letra : " + nombre + " es la " + nombre.charAt(0));

		int ultima_letra;

		ultima_letra = nombre.length();

		System.out.println("longitud : "+ultima_letra);

		System.out.println("La ultima letra es la : " + nombre.charAt(ultima_letra - 1));

		// /////////////////////////////////////////////
		// LIBRO RAMA
		// ///////////////////////////////////////////
		String cad1 = "Pepe_Objeto";
		String cad2 = new String(cad1);
		String cad3 = new String(cad2);
		System.out.println(cad3);

	}

}
