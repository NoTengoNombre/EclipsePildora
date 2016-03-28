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

/* Crear una clase generica hay que poner parentesis <> y el nombre */
/* T -> significa que es de TIPO -> Tipo Generico T , U , K - Conveccion */
public class Pareja_Generica_165<T> {

	// Atributo tipo Generico
	private T primero;

	// Constructor clase Generica
	public Pareja_Generica_165() {
		primero = null;
	}

	/**
	 * Setter
	 * @param nuevoValor
	 */
	/* Parametro Tipo Generico */
	public void set_Primero(T nuevoValor) {
		primero = nuevoValor;
	}
	
/**
 * Getter
 * @return
 */
	// Como no se que tipo de Objeto Generico voy a devolver lo pongo como T
	public T getPrimero() {
		return primero;
	}

}
