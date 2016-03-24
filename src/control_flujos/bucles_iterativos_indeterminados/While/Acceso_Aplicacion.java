package control_flujos.bucles_iterativos_indeterminados.While;

import javax.swing.JOptionPane;

public class Acceso_Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave = "1"; // almacena cadena Juan

		String pass = ""; // almacena cadena vacia

		// mientra la clave sea diferente a pass
		while (clave.equals(pass) == false /* Si es true : sale del bucle */) {

			pass = JOptionPane.showInputDialog("Introduce pass");

			if (clave.equals(pass) == false) {
				System.out.println("Pass Incorrecta");
			}

		} // cierre while

		System.out.println("Pass permitido ");
	}

}
