package stream;

import java.io.FileReader;
import java.io.IOException;

public class Leer_Fichero {

	public void lee() {
		FileReader entrada = null;
		try {
			entrada = new FileReader("c:\\x_java\\datos.txt");

			int c = 0;

			while (c != -1) {
				c = entrada.read();

				char letra = (char) c;

				System.out.print(letra);
			}
		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo");
		} finally {
			try {
				entrada.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
