package poo.Objeto;

import javax.swing.JOptionPane;

public class Uso_Coches_Getter_Setter_JOption {

	// CLASE PRINCIPAL : POR LLEVAR EL MAIN
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche_JOption miCoche = new Coche_JOption();

		miCoche.establece_color(JOptionPane.showInputDialog("Introduce color"));

		// SALTARSE LA REGLAS DE PROGRAMACION : VIOLACION DE INTEGRIDAD
		// MANIPULAR DIRECTAMENTE LA PROPIEDAD
		// miCoche.color = "rosa"; /*FORMA NO CORRECTA*/

		System.out.println(miCoche.dime_datos_generales());

		System.out.println(miCoche.dime_color());

		miCoche.configura_asientos(JOptionPane.showInputDialog("¿ Tiene asientos cuero ?"));

		System.out.println("\n" + miCoche.dime_asientos());

		miCoche.configura_climatizador(JOptionPane.showInputDialog("¿ Tiene climatizador ?"));

		// 1º Declara el valor del climatizador
		System.out.println(miCoche.dime_climatizador());
		System.out.println(miCoche.dime_peso_coche());

		// 2º Como esta declarado el climatizador aumenta el precio basico
		System.out.println("El precio del coche es : " + miCoche.precio_coche());

	}
}
