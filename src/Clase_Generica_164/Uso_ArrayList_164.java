package Clase_Generica_164;

import java.io.*;

public class Uso_ArrayList_164 {

	public static void main(String[] args) {

		ArrayList archivos = new ArrayList(5);

		archivos.add("Juan0");
		archivos.add("Juan1");
		archivos.add("Juan2");
		archivos.add("Juan3");
		archivos.add(new File("C:\\x_java.datos.txt"));
		String nombrePersona = (String) archivos.get(4);

		// String nombrePersona = archivos.get(2).toString();

		// archivos.add(new File("C:\\x_java.datos.txt")); // archivo guardado
		// en la posicion 0

		// File nombrePersona = (File) archivos.get(0);

		System.out.println(nombrePersona);

	}
}
