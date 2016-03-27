package interfaz;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado_Interfaz1 {

	public static void main(String[] args) {

		Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 2006, 9, 25);

		jefe_RRHH.establece_Incentivos(2750);

		Empleado[] misEmpleados = new Empleado[6];

		misEmpleados[0] = new Empleado("Ana", 30000, 2000, 07, 07);
		misEmpleados[1] = new Empleado("Carlos", 50000, 1995, 06, 15);
		misEmpleados[2] = new Empleado("Paco", 25000, 2005, 9, 25);
		misEmpleados[3] = new Empleado("Antonio", 47500, 2009, 11, 9);

		misEmpleados[4] = jefe_RRHH; // Polimorfismo : principio de sustitucion

		misEmpleados[5] = new Jefatura("Maria", 95000, 1999, 5, 26);

		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];

		Empleado director_comercial = new Jefatura("Sandra", 85000, 2012, 05, 05);

		// Principio de sustitucion ; No se puede instanciar una Interfaz pero
		// si se puede implementar
		// un objeto que es de la superclase Empleado y así utilizar su
		// constructor.
		Comparable ejemplo = new Empleado("Elisabeth", 95000, 2011, 06, 07);

		// Instruccion instanceOf -> Se usa en programas complejos que tenga un
		// monton de clases que van heredando 1 de otra es probable necesidad de
		// comprobar si una instancia pertenece a esa clase o no , eso se hace
		// con un instanceof y un IF

//	instanceOf se puede usar para Interfaces y Clases
		if (director_comercial instanceof Empleado) {
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

		for (Empleado e : misEmpleados) {
			e.subeSueldo(5);
		}

		Arrays.sort(misEmpleados);

		for (Empleado e : misEmpleados) {
			System.out.println(" Nombre: " + e.dameNombre() + " Sueldo : " + e.dameSueldo() + " Fecha de Alta : "
					+ e.dameFechaContrato());
		}
	}
}

// Empleado tiene que implementar el metodo de la Interfaz Comparable
class Empleado implements Comparable {

	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		altaContrato = calendario.getTime();
		++idSiguiente;
		id = idSiguiente;
	}

	public Empleado(String nom) {
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
		Empleado otroEmpleado = (Empleado) miObjeto; // con esto tengo una
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

class Jefatura extends Empleado {

	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
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