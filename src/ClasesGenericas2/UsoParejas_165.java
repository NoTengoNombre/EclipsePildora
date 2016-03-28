package ClasesGenericas2;

/**
 * https://www.youtube.com/watch?v=-KRz46_gGoM&index=165&list=
 * PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk
 * 
 * Curso Java Programación genérica. Creación clases genéricas propias. Vídeo
 * 165
 * 
 * @author PORTATIL
 *
 */
public class UsoParejas_165 {

	public static void main(String[] args) {

		// PRobar el funcionamiento de la clase Pareja
		// Tipo de objeto que va a manejar
		// Hemos llamado al constructor y hemos dicho que 1º es null
		Pareja_Generica_165<String> una = new Pareja_Generica_165<String>(/* null */)/*
																					 * Con
																					 * el
																					 * ()
																					 * le
																					 * hemos
																					 * hecho
																					 * dicho
																					 * que
																					 * es
																					 * null
																					 */;

		// cambiar el campo de null a otra cosa
		una.set_Primero("Juan"); // Con esta instruccion hemos hecho que 1º sea
									// igual a primero="Juan"
		System.out.println(una.getPrimero());

		Persona pers1 = new Persona("Ana");

		Pareja_Generica_165<Persona> otra = new Pareja_Generica_165<Persona>();

		otra.set_Primero(pers1);

		System.out.println(otra.getPrimero());
	}
}

class Persona {

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}

	private String nombre;
}