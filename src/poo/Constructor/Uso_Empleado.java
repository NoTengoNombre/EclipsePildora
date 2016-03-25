package poo.Constructor;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado empleado1 = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		Empleado empleado2 = new Empleado("Ana Lopez", 95000, 1995, 06, 2);
		Empleado empleado3 = new Empleado("Maria Martin", 105000, 2002, 03, 15);
		
	}
}

// Un fichero varias clases
// 1 clase solamente tiene que tene una clase Public y las demas NO
class Empleado {
	// private : Variables solo se modifican con metodos get/set
	/* tipo Objeto */
	private String nombre;
	/* tipo primitivo */
	private double sueldo;
	/* tipo Objeto */
	private Date altaContrato;

	// Propiedades : nombre , sueldo , fecha_alta , subir_sueldo
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		altaContrato = calendario.getTime();
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
		double aumento = sueldo /*<-establecido en el constructor*/ * porcentaje / 100;
		sueldo += aumento;
	}

}