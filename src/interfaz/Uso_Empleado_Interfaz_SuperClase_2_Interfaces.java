package interfaz;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado_Interfaz_SuperClase_2_Interfaces {

	public static void main(String[] args) {

		Jefatura12 jefe_RRHH = new Jefatura12("Juan", 55000, 2006, 9, 25);

		jefe_RRHH.establece_Incentivos(2750);

		Empleado12[] misEmpleados = new Empleado12[6];

		misEmpleados[0] = new Empleado12("Ana", 30000, 2000, 07, 07);
		misEmpleados[1] = new Empleado12("Carlos", 50000, 1995, 06, 15);
		misEmpleados[2] = new Empleado12("Paco", 25000, 2005, 9, 25);
		misEmpleados[3] = new Empleado12("Antonio", 47500, 2009, 11, 9);

		misEmpleados[4] = jefe_RRHH; // Polimorfismo : principio de sustitucion

		misEmpleados[5] = new Jefatura12("Maria", 95000, 1999, 5, 26);

		Jefatura12 jefa_Finanzas = (Jefatura12) misEmpleados[5];

		jefa_Finanzas.establece_Incentivos(55000);

		System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas DIAS DE VACACIONES a los Empleados"));

		// Ejemplo de como una SuperClase utiliza una interfaz
		misEmpleados[3]
				.tomar_decisiones("Soy un objeto empleado de la SuperClase Empleado y uso el metodo tomar decisiones");

		Empleado12 director_comercial = new Jefatura12("Sandra", 85000, 2012, 05, 05);

		// Principio de sustitucion ; No se puede instanciar una Interfaz pero
		// si se puede implementar
		// un objeto que es de la superclase Empleado y así utilizar su
		// constructor.
		Comparable ejemplo = new Empleado12("Elisabeth", 95000, 2011, 06, 07);

		// Instruccion instanceOf -> Se usa en programas complejos que tenga un
		// monton de clases que van heredando 1 de otra es probable necesidad de
		// comprobar si una instancia pertenece a esa clase o no , eso se hace
		// con un instanceof y un IF

		// instanceOf se puede usar para Interfaces y Clases
		if (director_comercial instanceof Empleado12) {
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

		for (Empleado12 e : misEmpleados) {
			e.subeSueldo(5);
		}

		Arrays.sort(misEmpleados);

		for (Empleado12 e : misEmpleados) {
			System.out.println(" Nombre: " + e.dameNombre() + " Sueldo : " + e.dameSueldo() + " Fecha de Alta : "
					+ e.dameFechaContrato());
		}
	}
}

// ESTO NO TIENE SENTIDO PORQUE EL METODO tomar_decisiones esta definido para la
// Interfaz Jefe
// La cual pertenece a la subclase especifica (Jefatura)
// Recuerda : SUPERCLASE(atributos/metodos Generales)
// Recuerda : SUBCLASE (atributos/metodos ESPECIFICOS)
// Recuerda : INTERFACES (Metodos que yo creo de una interfaz ya definida o
// creada por mi )
// Recuerda : Y ademas le implemento como quiero que se ejecuten esos metodos
// mediantes las
// Recuerda : recomendaciones de la API : JUAN PALOMO
// Empleado tiene que implementar el metodo de la Interfaz Comparable
class Empleado12 implements Comparable, Jefes {

	public Empleado12(String nom, double sue, int agno, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		altaContrato = calendario.getTime();
		++idSiguiente;
		id = idSiguiente;
	}

	public Empleado12(String nom) {
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

	public String tomar_decisiones(String decision) {
		return "Un miembro de la direccion ha tomado la decision de : " + decision;
	}

	public int compareTo(Object miObjeto) { //
		Empleado12 otroEmpleado = (Empleado12) miObjeto;
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
class Jefatura12 extends Empleado12 {

	public Jefatura12(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}

	// public String tomar_decisiones(String decision) {
	// return "Un miembro de la direccion ha tomado la decision de : " +
	// decision;
	// }

	public void establece_Incentivos(double b) {
		this.incentivos = b;
	}

	public double dameSueldo() {
		double sueldoJefe = super.dameSueldo();
		return sueldoJefe + incentivos;
	}

	private double incentivos;
}