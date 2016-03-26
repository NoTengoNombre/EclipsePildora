package poo.Constructor;

public class Uso_Empleado_con_Array {

	public static void main(String[] args) {

		// Crear array para almacenar los empleados : Array de una clase propia
		Empleado[] misEmpleados = new Empleado[3]; /* 3 elementos */
		// Array de una clase predeterminada de JAVA
		// String[] miarray = new String[3];

		// OBJECTO -> posicion[0] <- Almaceno un objeto con los datos
		misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 06, 2);
		misEmpleados[2] = new Empleado("Maria Martin", 105000, 2002, 03, 15);

		for (int i = 0; i < 3; i++) {
			misEmpleados[i].subeSueldo(5);
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("Nombre : " + misEmpleados[i].dame_nombre() + " Sueldo : "
					+ misEmpleados[i].dame_sueldo() + " Fecha Alta : " + misEmpleados[i].dame_fecha_contrato());
		}

		for (Empleado e : misEmpleados) {
			e.subeSueldo_con_metodo_Getter(5);
		}

		System.out.println("------------------------------");
		for (Empleado e1 : misEmpleados)
			System.out.println("Nombre : " + 
					e1.dame_nombre() + " Sueldo : " + 
					e1.dame_sueldo() + " Fecha Alta : "
					+ e1.dame_fecha_contrato());

	}
}
