package poo.Objeto;

public class Static_Trabajador {

	public static void main(String[] args) {

		Empleados trabajador1 = new Empleados("Paco");

		System.out.println(trabajador1.devuelveDatos());

		trabajador1.cambia_Seccion("RRHH");

		Empleados trabajador2 = new Empleados("Ana");

		System.out.println(trabajador2.devuelveDatos());

		Empleados trabajador3 = new Empleados("Antonio");

		System.out.println(trabajador3.devuelveDatos());

		Empleados trabajador4 = new Empleados("Pepe");

		System.out.println(trabajador4.devuelveDatos());
		
		System.out.println(Empleados.dame_IdSiguiente());

	}
}

class Empleados {

	private final String nombre; // FINAL
	private String seccion;
	private static int IdSiguiente = 1;
	private int id;
 
	public Empleados(String nom) { // Constructor : Darle estado inicial
		nombre = nom;
		seccion = "Administracion";
		id = IdSiguiente;
		IdSiguiente++;
	}

	public void cambia_Seccion(String seccion) { // SETTER
		this.seccion = seccion;
	}

	public String devuelveDatos() {
		return "El nombre es: " + nombre + " y la seccion es " + seccion + " y el ID = " + id;
	}

	public static String dame_IdSiguiente() {
		return "El idSiguiente " + Empleados.IdSiguiente;
	}
}


