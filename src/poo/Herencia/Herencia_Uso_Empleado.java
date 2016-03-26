package poo.Herencia;

import java.util.Date;
import java.util.GregorianCalendar;


public class Herencia_Uso_Empleado {

	public static void main(String[] args) {

		
		Empleado[] misEmpleados = new Empleado[4];
		misEmpleados[0] = new Empleado("Ana", 30000, 2000, 07, 07);
		misEmpleados[1] = new Empleado("Carlos", 50000, 1995, 06, 15);
		misEmpleados[2] = new Empleado("Paco", 25000, 2005, 9, 25);
		misEmpleados[3] = new Empleado("Antonio", 47500, 2009, 11, 9);

		for (Empleado e : misEmpleados) {
			e.subeSueldo(5);
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

	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int IdSiguiente;

	public String dameNombre() {
		return nombre + "Id " + id;
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

	class Jefatura extends Empleado {

		private double incentivos;

		public Jefatura(String nom, double sue, int agno, int mes, int dia) {
			super(nom, sue, agno, mes, dia); // constructor de la clase padre
		}
		
		public void establece_Incentivos(double b){
			this.incentivos = b;
		}
		
		public double dameSueldo(){
			double sueldoJefe = super.dameSueldo();
			return sueldoJefe + incentivos;
		}
		
		
	}

}
