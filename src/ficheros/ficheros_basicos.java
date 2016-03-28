package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Curso Java. Streams I. Accediendo a ficheros. Lectura. Vídeo 152 
 * 
 * https://www.youtube.com/watch?v=etQN4EfYN7k&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=152
 * 
 * Tengo que ver los restantes videos  : 153 , 154 , 155 , 156 
 */
public class ficheros_basicos {
	public static void main(String[] args) {

		Leer_Fichero accediendo = new Leer_Fichero();
		accediendo.lee();
	}

}

class Leer_Fichero {

	public void lee() {
		try {
			// Abrimos un flujo de datos "Stream" o "Comunicacion" esta
			// consumiendo recursos
			FileReader entrada = new FileReader("C:\\Users\\PORTATIL\\Documents\\datos1.txt");

			int c = entrada.read(); // - Se prepara para leer el 1º caracter del
									// fichero
			// - Va recorriendo todo el fichero hasta llegar al final que es -1
			// , esto sucede por el metodo read() que dice que el final del
			// fichero es -1
			while (c != -1 /* Mientras no haya llegado al final de los datos */) {

				/* variable c almacena el codigo ascii */
				c = entrada.read();

				char letra = (char) c;

				// System.out.println(c); // codigo ascii
				System.out.print(letra); // codigo ascii
				// El caracter ? significa el ultimo caracter
			}

		} catch (IOException e) {
			// e.printStackTrace();
			// System.out.println(e.getClass().getName());
			System.out.println("No se ha encontrado el archivo \n" + e.getMessage());
		}
	}
}