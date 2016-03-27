package interfaz;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado_Interfaz2_impl {

	public static void main(String[] args) {

		Jefatura1 jefe_RRHH = new Jefatura1("Juan", 55000, 2006, 9, 25);

		jefe_RRHH.establece_Incentivos(2750);

		Empleado1[] misEmpleados = new Empleado1[6];

		misEmpleados[0] = new Empleado1("Ana", 30000, 2000, 07, 07);
		misEmpleados[1] = new Empleado1("Carlos", 50000, 1995, 06, 15);
		misEmpleados[2] = new Empleado1("Paco", 25000, 2005, 9, 25);
		misEmpleados[3] = new Empleado1("Antonio", 47500, 2009, 11, 9);

		misEmpleados[4] = jefe_RRHH; // Polimorfismo : principio de sustitucion

		misEmpleados[5] = new Jefatura1("Maria", 95000, 1999, 5, 26);

		Jefatura1 jefa_Finanzas = (Jefatura1) misEmpleados[5];

		jefa_Finanzas.establece_Incentivos(55000);

		// Objeto Subclase Jefatura1 que tiene el metodo Implementado de la Interfaz Jefes
		/* MI */System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas DIAS DE VACACIONES a los Empleados")); /* METODO INTERFAZ JEFES */

		Empleado1 director_comercial = new Jefatura1("Sandra", 85000, 2012, 05, 05);

		// Principio de sustitucion ; No se puede instanciar una Interfaz pero
		// si se puede implementar
		// un objeto que es de la superclase Empleado y así utilizar su
		// constructor.
		Comparable ejemplo = new Empleado1("Elisabeth", 95000, 2011, 06, 07);

		// Instruccion instanceOf -> Se usa en programas complejos que tenga un
		// monton de clases que van heredando 1 de otra es probable necesidad de
		// comprobar si una instancia pertenece a esa clase o no , eso se hace
		// con un instanceof y un IF

		// instanceOf se puede usar para Interfaces y Clases
		if (director_comercial instanceof Empleado1) {
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

		for (Empleado1 e : misEmpleados) {
			e.subeSueldo(5);
		}

		Arrays.sort(misEmpleados);

		for (Empleado1 e : misEmpleados) {
			System.out.println(" Nombre: " + e.dameNombre() + " Sueldo : " + e.dameSueldo() + " Fecha de Alta : "
					+ e.dameFechaContrato());
		}
	}
}

// Empleado tiene que implementar el metodo de la Interfaz Comparable
class Empleado1 implements Comparable { // Ejemplo de como una superclase puede
										// ser implementada por varias
										// Interfaces

	public Empleado1(String nom, double sue, int agno, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		altaContrato = calendario.getTime();
		++idSiguiente;
		id = idSiguiente;
	}

	public Empleado1(String nom) {
		this(nom, 3000, 2000, 06, 17);
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
	public int compareTo(Object miObjeto) { // Interfaz
		Empleado1 otroEmpleado = (Empleado1) miObjeto; // con esto tengo una
														// variable empleado de
														// tipo objeto me
														// permite comparar
														// utilizando otro
														// empleado el sueldo de
														// un empleado con otro
		// this - parametro implicto - hace referencia al objeto empleado
		// if (this.sueldo < otroEmpleado.sueldo) {
		if (this.id < otroEmpleado.id) {
			return -1;
		}

		// if (this.sueldo > otroEmpleado.sueldo) {
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
class Jefatura1 extends Empleado1 implements Jefes {

	public Jefatura1(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}

	// Para usarlo en una Superclase hay que añadirlo a la estructura de la
	// clase
	public String tomar_decisiones(String decision) {
		return "Un miembro de la direccion ha tomado la decision de : " + decision;
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