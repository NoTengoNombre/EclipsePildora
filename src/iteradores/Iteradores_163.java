package iteradores;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * https://www.youtube.com/watch?v=5NOV_Yuk8Ps&index=162&list=
 * PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk#t=1.81575
 * 
 * Curso Java Programación genérica. ArrayList III Iteradores. Vídeo 163
 * 
 * @author PORTATIL
 *
 */
public class Iteradores_163 {

	public static void main(String[] args) {

		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

		listaEmpleados.add(new Empleado("Ana", 45, 2500));
		listaEmpleados.add(new Empleado("Anto", 55, 2000));
		listaEmpleados.add(new Empleado("Manr", 15, 3500));
		listaEmpleados.add(new Empleado("Kos", 35, 4500));
		listaEmpleados.add(new Empleado("Jes", 25, 5500));
		listaEmpleados.add(new Empleado("Mera", 65, 6500));
		listaEmpleados.add(new Empleado("Nies", 85, 7500));
		listaEmpleados.add(new Empleado("Gre", 25, 2800));
		listaEmpleados.add(new Empleado("Gere", 45, 8500));

		/*
		 * Empleado arrayEmpleados[] = new Empleado[listaEmpleados.size()];
		 * listaEmpleados.toArray(arrayEmpleados); // de ArrayList a array
		 * normal
		 * 
		 * for (int i = 0; i < arrayEmpleados.length; i++) {
		 * System.out.println(arrayEmpleados[i].dame_datos());
		 * 
		 * }
		 */

		// CREAR EL ITERADOR
		// Encargado de recorrer el elemento
		// dentro de mi_iterador
		// se guarda el metodo iterator();
		Iterator<Empleado> mi_iterador = listaEmpleados.iterator();
		while (mi_iterador.hasNext()) {
			String valores = mi_iterador.next().dame_datos();
			System.out.println(valores);
		}

	}

}

class Empleado {

	public Empleado(String nombre, int edad, double salario) {
		this.edad = edad;
		this.nombre = nombre;
		this.salario = salario;
	}

	public String dame_datos() {
		return "nombre " + nombre + " edad " + edad + " salario " + salario;
	}

	private String nombre;
	private int edad;
	private double salario;
}