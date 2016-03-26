package clases_Abstractas;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona_Abstracta {

	public static void main(String[] args) {

		Persona[] lasPersonas = new Persona[2];
		lasPersonas[0] = new Empleado2("Luis Conde", 50000, 2009, 02, 25);
		lasPersonas[1] = new Alumno("Ana Lopez", "Biología");

		for (Persona p : lasPersonas) {
			System.out.println(p.dame_Nombre() + " , " + p.dame_Descripcion());
		}

	}
}

abstract class Persona {

	public Persona(String nom) {
		nombre = nom;
	}

	public String dame_Nombre() {
		return nombre;
	}

	public abstract String dame_Descripcion();

	private String nombre;
}

class Empleado2 extends Persona {

	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		// Tenemos que llamar al constructor de la superclase Persona mediante
		// super() para que se pueda implementar los datos
		super(nom); // hemos llamado al constructor de la clase PADRE
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		altaContrato = calendario.getTime();
		++idSiguiente;
		id = idSiguiente;
	}

	// metodo implementado : heredado de abstract de la superClase Persona
	public String dame_Descripcion() {
		return "Este empleado tiene un Id= " + id + " con un sueldo a = " + sueldo;
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

	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente;
	private int id;

}

class Alumno extends Persona {

	// 1º Constructor
	public Alumno(String nom, String car) {
		// Como esta heredando de la clase Persona tenemos que llamar al
		// constructor de la clase Persona mediante super()
		super(nom); // con super(nom) el metodo dame_Nombre de Persona devolvera
					// el valor almacenado en el constructor Alumno
		carrera = car;
	}

	// metodo Sobreescrito de la clase Abstracta
	public String dame_Descripcion() {
		return "Este Alumno esta estudiando la carrera de " + carrera;
	}

	private String carrera;
}
