package interfaz;

//
public interface Jefes{
	/*
	 * Queremos determinar el comportamiendo de esta interfaz por eso vamos a
	 * crear un metodo llamado tomar_decisiones , asi obligamos a todos los
	 * programadores que usen esta interfaz en sus clases que la llamen a que
	 * implemente el metodo en cuestion
	 */

	// los metodos son public y abstracts ; pero no hace falta ponerlo si no
	// quieres

	String tomar_decisiones(String decision);
	

}
