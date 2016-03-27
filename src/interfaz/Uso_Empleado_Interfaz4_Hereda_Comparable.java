package interfaz;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Video 51
 * 
 * @author PORTATIL Implementar un nuevo metodo en la interfaz para la
 *         Superclase Empleados
 */
public class Uso_Empleado_Interfaz4_Hereda_Comparable {

	public static void main(String[] args) {

		Jefatura13 jefe_RRHH = new Jefatura13("Juan", 55000, 2006, 9, 25);

		jefe_RRHH.establece_Incentivos(2750);

		Empleado13[] misEmpleados = new Empleado13[6];

		misEmpleados[0] = new Empleado13("Ana", 30000, 2000, 07, 07);
		misEmpleados[1] = new Empleado13("Carlos", 50000, 1995, 06, 15);
		misEmpleados[2] = new Empleado13("Paco", 25000, 2005, 9, 25);
		misEmpleados[3] = new Empleado13("Antonio", 47500, 2009, 11, 9);

		misEmpleados[4] = jefe_RRHH; // Polimorfismo : principio de sustitucion

		misEmpleados[5] = new Jefatura13("Maria", 95000, 1999, 5, 26);

		Jefatura13 jefa_Finanzas = (Jefatura13) misEmpleados[5];

		jefa_Finanzas.establece_Incentivos(55000);

		// LLAMADA AL METODO IMPLEMENTADO DE LA INTERFAZ TRABAJADOR PARA LA
		// CLASE JEFATURA
		double Jefa_de_Finanzas = jefa_Finanzas.establece_bonus(500);
		// metodo de la clase Jefatura + metodo de la Interfaz Trabajadores
		System.out.println("La jefa " + jefa_Finanzas.dameNombre() + " tiene un bonus de : " + Jefa_de_Finanzas);

// Objeto tipo Arrays misEmpleados llama metodo de la SuperClase Empleados tiene una implementacion propia
// Objeto tipo Arrays misEmpleados llama metodo de la Interfaz Trabajadores que tiene una implementacion propia
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de : " + misEmpleados[3].establece_bonus(200));

		// Objeto Subclase Jefatura1 que tiene el metodo Implementado de la
		// Interfaz Jefes
		/* MI */System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas DIAS DE VACACIONES a los Empleados"));

		Empleado13 director_comercial = new Jefatura13("Sandra", 85000, 2012, 05, 05);

		// Principio de sustitucion ; No se puede instanciar una Interfaz pero
		// si se puede implementar
		// un objeto que es de la superclase Empleado y así utilizar su
		// constructor.
		Comparable ejemplo = new Empleado13("Elisabeth", 95000, 2011, 06, 07);

		// Instruccion instanceOf -> Se usa en programas complejos que tenga un
		// monton de clases que van heredando 1 de otra es probable necesidad de
		// comprobar si una instancia pertenece a esa clase o no , eso se hace
		// con un instanceof y un IF

		// instanceOf se puede usar para Interfaces y Clases
		if (director_comercial instanceof Empleado13) {
			System.out.println("Es de tipo Jefatura");
		}

		if (ejemplo instanceof Comparable) { // pregunta si ejemplo implementa
												// la interfaz comparable
			System.out.println("Implementa la interfaz comparable");
		}

		/*
		 * la clase Empleado implementa la interfaz Comparable podemos crearnos
		 * una instancia perteneciente a la interfaz pero a la hora de
		 * isntanciarlo decirle que es de tipo empleado
		 */
		jefa_Finanzas.establece_Incentivos(55000);

		for (Empleado13 e : misEmpleados) {
			e.subeSueldo(5);
		}

		Arrays.sort(misEmpleados);

		for (Empleado13 e : misEmpleados) {
			System.out.println(" Nombre: " + e.dameNombre() + " Sueldo : " + e.dameSueldo() + " Fecha de Alta : "
					+ e.dameFechaContrato());
		}
	}
}

// Empleado tiene que implementar el metodo de la Interfaz Comparable y el de
// Trabajadores porque es un metodo abstracto que va a estar disponible en todas
// las jerarquias de clases
class Empleado13 implements Comparable, Trabajadores /* Super-Interfaz */ {

	public Empleado13(String nom, double sue, int agno, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		altaContrato = calendario.getTime();
		++idSiguiente;
		id = idSiguiente;
	}

	public Empleado13(String nom) {
		this(nom, 3000, 2000, 06, 17);
	}

	/**
	 * Metodo Implementado de la Interfaz Trabajadores
	 */
	public double establece_bonus(double gratificacion) {
		return Trabajadores.BONUS_BASE + gratificacion;
	}

	/**
	 * Metodo Implementado de la Interfaz Trabajadores
	 */
	public double establece_bonus_Sintaxis_Corta(double gratificacion) {
		return Trabajadores.BONUS_BASE + gratificacion;
	}

	public String dameNombre() {
		return nombre + " Id " + id;
	}

	public double dameSueldo() {
		return sueldo;
	}

	public Date dameFechaContrato() {
		return altaContrato;
	}

	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

	/**
	 * Tengo que hacer un casting del tipo Objeto al Empleado
	 */
	public int compareTo(Object miObjeto) {
		Empleado13 otroEmpleado = (Empleado13) miObjeto;
		if (this.id < otroEmpleado.id) {
			return -1;
		}

		if (this.id > otroEmpleado.id) {
			return 1;
		}
		return 0;
	}

	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente = 0;
	private int id;
}

// Ejemplo de como una SuperClase implementa una Interfaz
class Jefatura13 extends Empleado13 implements JefesHereda {

	public Jefatura13(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}

	// Para usarlo en una Superclase hay que añadirlo a la estructura de la
	// clase
	public String tomar_decisiones(String decision) {
		return "Un miembro de la direccion ha tomado la decision de : " + decision;
	}

	/**
	 * Metodos Implementados de la interfaz Trabajadores
	 */
	public double establece_bonus(double gratificacion) {
		double prima = 2000;
		return Trabajadores.BONUS_BASE + gratificacion + prima;
	}

	/**
	 * Metodos Implementados de la interfaz Trabajadores
	 */
	public double establece_bonus_Sintaxis_Corta(double gratificacion) {
		double prima = 2000;
		return Trabajadores.BONUS_BASE + gratificacion + prima;
	}

	public void establece_Incentivos(double b) {
		this.incentivos = b;
	}

	public double dameSueldo() {
		double sueldoJefe = super.dameSueldo();
		return sueldoJefe + incentivos;
	}

	private double incentivos;
}