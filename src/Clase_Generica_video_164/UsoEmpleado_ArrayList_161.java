package Clase_Generica_video_164;

import java.util.ArrayList;

public class UsoEmpleado_ArrayList_161 {

	public static void main(String[] args) {


		ArrayList<Empleado164> listaEmpleados = new ArrayList<Empleado164>();

		listaEmpleados.add(new Empleado164("Anit", 45, 2500));
		listaEmpleados.add(new Empleado164("Anto", 55, 2000));
		listaEmpleados.add(new Empleado164("Mari", 25, 2600));
		listaEmpleados.add(new Empleado164("Joe", 35, 2200));
		listaEmpleados.add(new Empleado164("Jose", 35, 2200));
		listaEmpleados.add(new Empleado164("Ana", 45, 2500));
		listaEmpleados.add(new Empleado164("Anto", 55, 2000));
		listaEmpleados.add(new Empleado164("Maria", 25, 2600));
		listaEmpleados.add(new Empleado164("Jos", 35, 2200));
		listaEmpleados.add(new Empleado164("Sew", 35, 2200));
		listaEmpleados.add(new Empleado164("Olga", 22, 2200));
//		listaEmpleados.set(0, new Empleado164("Tyler", 22, 2000));
//		listaEmpleados.add("Paco"/*Esta esperando un objeto de tipo Empleando y le estoy dando un String */);

		Empleado164[] arrayEmpleados = new Empleado164[listaEmpleados.size()];

		listaEmpleados.toArray(arrayEmpleados);

		for (int i = 0; i < arrayEmpleados.length; i++) {
			System.out.println("Array normal a arrayList : "+arrayEmpleados[i].dame_Datos());
		}

		System.out.println(listaEmpleados.get(4).dame_Datos()); // posicion 5

		System.out.println("size " + listaEmpleados.size());

	}
}

class Empleado164 {

	private String nombre;
	private int edad;
	private double salario;

	public Empleado164(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	public String dame_Datos() {
		return "El empleado se llama " + nombre + " tiene " + edad + " salario :" + salario;
	}

}
