package ArrayList_programacion_Generica_161;

import java.util.ArrayList;

/**
 * https://www.youtube.com/watch?v=uUWEfmaFOkE&index=161&list=
 * PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk
 * 
 * Curso Java. Programación genérica. ArrayList I. Vídeo 161
 * 
 * ArrayList -> lista de elementos crece a medida que vamos incluyendo elementos
 */
public class UsoEmpleado_ArrayList_161 {

	public static void main(String[] args) {

		/*
		 * // Solo almacena datos del tipo Empleado Empleado listaEmpleados[] =
		 * new Empleado[3]; // array de objetos de tipo // Empleado
		 * listaEmpleados[0] = new Empleado("Ana", 45, 2500); listaEmpleados[1]
		 * = new Empleado("Antonio", 55, 2000); listaEmpleados[2] = new
		 * Empleado("Maria", 25, 2600);
		 * 
		 */

		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

		listaEmpleados.ensureCapacity(11); // le decimos que el arrayList tendra
											// 11 elementos y asi nos evitamos
											// que desperdicie memoria , ademas
											// creara espacios de memoria de 11
											// bloques

		listaEmpleados.add(new Empleado("Anit", 45, 2500));
		listaEmpleados.add(new Empleado("Anto", 55, 2000));
		listaEmpleados.add(new Empleado("Mari", 25, 2600));
		listaEmpleados.add(new Empleado("Joe", 35, 2200));
		listaEmpleados.add(new Empleado("Jose", 35, 2200));
		listaEmpleados.add(new Empleado("Ana", 45, 2500));
		listaEmpleados.add(new Empleado("Anto", 55, 2000));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Jos", 35, 2200));
		listaEmpleados.add(new Empleado("Sew", 35, 2200));
		listaEmpleados.add(new Empleado("Olga", 22, 2200));
		listaEmpleados.set(0, new Empleado("Tyler", 22, 2000));

		// listaEmpleados.trimToSize(); // Recorta el espacio sobrante del
		// espacio de memoria del programa

		// for (Empleado e : listaEmpleados) {
		// System.out.println(e.dame_Datos());
		// }

		/*
		 * for (int i = 0; i < listaEmpleados.size(); i++) { Empleado e =
		 * listaEmpleados.get(i); System.out.println(e.dame_Datos()); }
		 */
		/********* array normal ***************** arrayList */
		Empleado[] arrayEmpleados = new Empleado[listaEmpleados.size()];

		/** array normal pasa a arrayList */
		listaEmpleados.toArray(arrayEmpleados);

		for (int i = 0; i < arrayEmpleados.length; i++) {
			System.out.println("Array normal a arrayList : "+arrayEmpleados[i].dame_Datos());
		}

		System.out.println(listaEmpleados.get(4).dame_Datos()); // posicion 5

		System.out.println("size " + listaEmpleados.size());

	}
}

class Empleado {

	private String nombre;
	private int edad;
	private double salario;

	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	public String dame_Datos() {
		return "El empleado se llama " + nombre + " tiene " + edad + " salario :" + salario;
	}

}
