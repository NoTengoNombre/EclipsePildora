package clasesFinales;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * CLASE FINAL QUE NO HEREDA nº 44
 * 
 * @author PORTATIL
 *
 */
public class Uso_Empleado_ClaseFinal {

	public static void main(String[] args) {

		// CASTING BASICO
		// double num1 = 7.5;
		// int num2 = (int) num1;

		Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 2006, 9, 25);

		jefe_RRHH.establece_Incentivos(2750);

		// Vamos a preparar el arrays para que reciba un elemento mas
		Empleado[] misEmpleados = new Empleado[6];

		misEmpleados[0] = new Empleado("Ana", 30000, 2000, 07, 07);
		misEmpleados[1] = new Empleado("Carlos", 50000, 1995, 06, 15);
		misEmpleados[2] = new Empleado("Paco", 25000, 2005, 9, 25);
		misEmpleados[3] = new Empleado("Antonio", 47500, 2009, 11, 9);
		misEmpleados[4] = jefe_RRHH; // Aplicará el metodo dame_sueldo()
		misEmpleados[5] = new Jefatura("Maria", 95000, 1999, 5, 26);

		// CASTING Objecto Empleado a Jefatura
		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];
		jefa_Finanzas.establece_Incentivos(550000);

		for (Empleado e : misEmpleados) {
			e.subeSueldo(5);
		}

		for (Empleado e : misEmpleados) {
			System.out.println(" Nombre: " + e.dameNombre() + " Sueldo : " + e.dameSueldo() + " Fecha de Alta : "
					+ e.dameFechaContrato());
		}
	}
}

class Empleado {

	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		altaContrato = calendario.getTime();
		++IdSiguiente;
		id = IdSiguiente;
	}

	public Empleado(String nom) {
		this(nom, 3000, 2000, 06, 17);
	}

	public String dameNombre() {
		return nombre + " Id " + id;
	}

	public final double dameSueldo() {
		return sueldo;
	}

	public Date dameFechaContrato() {
		return altaContrato;
	}

	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int id;
}

class Jefatura extends Empleado {

	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia); // constructor de la clase padre
	}

	public void establece_Incentivos(double b) {
		this.incentivos = b;
	}

//	EL METODO DE LA SUBCLASE NO PUEDE SER SOBRE-ESCRITO POR EL DE LA SUPERCLASE POR EL MODIFICADOR FINAL
//	public double dameSueldo() {
//		double sueldoJefe = super.dameSueldo();
//		return sueldoJefe + incentivos;
//	}

//	SI QUIERO USAR EL METODO TENGO QUE LLAMARLO DE FORMA DISTINTA AL DE LA SUPERCLASE
	public double dameSueldo_SubClase_FIN_FINAL() {
		double sueldoJefe = super.dameSueldo();
		return sueldoJefe + incentivos;
	}
	
	private double incentivos;
}

/*
class Director extends Jefatura {

	public Director(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}
}
 */
