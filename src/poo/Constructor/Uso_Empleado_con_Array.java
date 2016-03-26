package poo.Constructor;

public class Uso_Empleado_con_Array {

	public static void main(String[] args) {

		// Crear array para almacenar los empleados : Array de una clase propia
		Empleado1[] misEmpleados = new Empleado1[5]; /* 3 elementos */
		// Array de una clase predeterminada de JAVA
		// String[] miarray = new String[3];

		// OBJECTO -> posicion[0] <- Almaceno un objeto con los datos
		misEmpleados[0] = new Empleado1("Paco Gomez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado1("Ana Lopez", 95000, 1995, 06, 2);
		misEmpleados[2] = new Empleado1("Maria Martin", 105000, 2002, 03, 15);
		misEmpleados[4] = new Empleado1("Perico Perez",3000,2000,01,01);
		misEmpleados[3] = new Empleado1("Antonio Fernandez");

		for (int i = 0; i < misEmpleados.length; i++) {
			misEmpleados[i].subeSueldo(5);
		}

		for (int i = 0; i < misEmpleados.length; i++) {
			System.out.println("Nombre : " + misEmpleados[i].dame_nombre() + " Sueldo : "
					+ misEmpleados[i].dame_sueldo() + " Fecha Alta : " + misEmpleados[i].dame_fecha_contrato());
		}

		for (Empleado1 e : misEmpleados) {
			e.subeSueldo_con_metodo_Getter(5);
		}

		System.out.println("------------------------------");
		for (Empleado1 e1 : misEmpleados)
			System.out.println("Nombre : " + 
					e1.dame_nombre() + " Sueldo : " + 
					e1.dame_sueldo() + " Fecha Alta : "
					+ e1.dame_fecha_contrato());

	}
}
