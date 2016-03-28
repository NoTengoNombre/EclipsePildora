package Clase_Generica_164;

/**
 * Programacion Generica
 * 
 * @author PORTATIL
 *
 */
public class ArrayList {

	/**
	 * El numero que se le pase al constructor sera la longitud del array
	 * 
	 * @param z
	 */
	public ArrayList(int z) {
		datosElemento = new Object[z];
	}

	/**
	 * Object para que se pueda almacenar cualquer tipo de Objeto
	 * 
	 * @param i
	 * @return
	 */
	public Object get(int i /* devuelve lo que hay en la posicion i */) {
		return datosElemento[i];
	}

	/**
	 * Recibe un tipo de objeto Le pasamos un objeto por parametro y ese objeto
	 * se va a almacenar en una posicion de array en concreto y aumentara el
	 * contador i++ para saber la posicion en la que ocupa
	 * 
	 * Si le pasamos 4 objetos se almacenaran en la posicion 0 , 1 , 2 , 3
	 * 
	 * @param o
	 */
	public void add(Object o) { //
		datosElemento[i] = o;
		i++;
	}

	private Object[] datosElemento;

	private int i = 0;
}
