package interfaz;

/**
 * Video 51
 * 
 * @author PORTATIL
 * Interface con nuevos Metodos a implementar y Constantes
 */
public interface Trabajadores {

	// Metodo completo
	public double establece_bonus(double gratificacion);

	// Por defecto son public y abstract
	double establece_bonus_Sintaxis_Corta(double gratificacion);

	// CREAR UN CONSTANTE PARA ESTABLECER UN MINIMO
	public static final double BONUS_BASE = 1500;

	// Por defecto son public y abstract
	double BONUS_BASE_Sintaxis_Corta = 1500;

}
