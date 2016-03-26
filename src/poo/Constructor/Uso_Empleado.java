package poo.Constructor;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {

		Empleado1 empleado1 = new Empleado1("Paco Gomez", 85000, 1990, 12, 17);
		Empleado1 empleado2 = new Empleado1("Ana Lopez", 95000, 1995, 06, 2);
		Empleado1 empleado3 = new Empleado1("Maria Martin", 105000, 2002, 03, 15);

		
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);

		System.out.println("Nombre : " + empleado1.dame_nombre() + " Sueldo : " + empleado1.dame_sueldo()
				+ " Fecha de Alta : " + empleado1.dame_fecha_contrato());

		System.out.println("Nombre : " + empleado2.dame_nombre() + " Sueldo : " + empleado2.dame_sueldo()
				+ " Fecha de Alta : " + empleado2.dame_fecha_contrato());

		System.out.println("Nombre : " + empleado3.dame_nombre() + " Sueldo : " + empleado3.dame_sueldo()
				+ " Fecha de Alta : " + empleado3.dame_fecha_contrato());

	}
}

// Un fichero varias clases
// 1 clase solamente tiene que tene una clase Public y las demas NO
class Empleado1 {
	// private : Variables solo se modifican con metodos get/set
	/* tipo Objeto */
	private String nombre;
	/* tipo primitivo */
	private double sueldo;
	/* tipo Objeto */
	private Date altaContrato;

	//1º Constructor : Propiedades : nombre , sueldo , fecha_alta , subir_sueldo
	public Empleado1(String nom, double sue, int agno, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		altaContrato = calendario.getTime();
	}

//	public Empleado(String nombre) {
//		this.nombre = nombre;
//	}
	
	public Empleado1(String nom){
//		Llamada al Constructor que tenga lo mismos parametros pasado en el This.
//		En este caso el 1º Constructor
	this(nom,3000,2000,01,01);	
	}
	

	// METODOS
	///// GETTER
	public String dame_nombre() {
		return nombre;
	}

	public double dame_sueldo() {

		return this.sueldo;
	}

	public Date dame_fecha_contrato() {

		return altaContrato;
	}

	///// SETTER
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo /* <-establecido en el constructor */ * porcentaje / 100;
		sueldo += aumento;
	}

	public void subeSueldo_con_metodo_Getter(double porcentaje) {
		double aumento = dame_sueldo() * porcentaje / 100;
		sueldo += aumento;
	}

}