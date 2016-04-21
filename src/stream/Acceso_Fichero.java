package stream;

import java.io.FileReader;
import java.io.IOException;

public class Acceso_Fichero {


	public static void main(String [] args){
		Leer_Fichero accediendo = new Leer_Fichero();
		accediendo.lee();
	}
}

class Leer_Fichero{
//	Leer caracteres de un fichero : Reader
//	 Usar la clase InputStreamReader : Puente para leer Streams de bytes a caracteres de Bytes ->  
//		-> Decodifica lo que es un bytes de caracter a su correpondiente codigo de caracteres
//	    -o  Pasa el codigo byte 0101 0101 al codigo Unicode	117 que equivale a la letra 'u'
//		FileReader : para decirle a Java donde esta nuestro archivo
	public void lee(){
		try{
			FileReader entrada = new FileReader("‪C:\\x_java\\datos.txt");
			int c = entrada.read();
			
			while(c!= -1){
				c = entrada.read();
				
				System.out.println(c);
			}
		}catch(IOException io){
			System.out.println("Fallo entrada/salida de datos : "+io);
		}catch (Exception e) {
			System.out.println("Excepcion General : "+e);
		}
	}
}