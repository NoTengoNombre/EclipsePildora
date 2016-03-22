package construirObjeto.empleado;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {
	public static void main(String[] main) {

		/*
		 * Empleado empleado1 = new Empleado("Paco", 1000, 1990, 12, 17);
		 * 
		 * Empleado empleado2 = new Empleado("Ana", 1200, 1995, 6, 2);
		 * 
		 * Empleado empleado3 = new Empleado("Maria", 1050, 2002, 3, 15);
		 * 
		 * empleado1.subeSueldo(5); empleado2.subeSueldo(5);
		 * empleado3.subeSueldo(5);
		 * 
		 * System.out.println("Nombre : "+empleado1.dameNombre()+ " Sueldo : "
		 * +empleado1
		 * .dameSueldo()+" Fecha de Alta "+empleado1.dameFechaContrato());
		 * 
		 * System.out.println("Nombre : "+empleado2.dameNombre()+ " Sueldo : "
		 * +empleado2
		 * .dameSueldo()+" Fecha de Alta "+empleado2.dameFechaContrato());
		 * 
		 * System.out.println("Nombre : "+empleado3.dameNombre()+ " Sueldo : "
		 * +empleado3
		 * .dameSueldo()+" Fecha de Alta "+empleado3.dameFechaContrato());
		 */

		Empleado[] misEmpleados = new Empleado[3];

		misEmpleados[0] = new Empleado("Paco", 1111, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana", 1200, 1995, 6, 2);
		misEmpleados[2] = new Empleado("Maria", 1200, 2002, 3, 15);

		for (int i = 0; i < misEmpleados.length; i++) {
			misEmpleados[i].subeSueldo(5);
		}

		for (int i = 0; i < misEmpleados.length; i++) {
			System.out.println(" Nombre : " + misEmpleados[i].dameNombre()
					+ " sueldo " + misEmpleados[i].dameSueldo()
					+ " Fecha de Alta " + misEmpleados[i].dameNombre());
		}

		for (Empleado e : misEmpleados) {
			System.out.println("Nombre: " 
					+ e.dameNombre() + "Sueldo : "
					+ e.dameNombre() + " Fecha de Alta : "
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
	}

	// setter
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje;
		sueldo += aumento;
	}

	// getter1
	public Date dameFechaContrato() {
		return altaContrato;
	}

	// getter
	public double dameSueldo() {
		return sueldo;
	}

	// setter
	public String dameNombre() {
		return nombre;
	}

	private String nombre;

	private double sueldo;

	private Date altaContrato;

}