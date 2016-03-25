package poo.Objeto;

public class Uso_Coches_Getter_Setter {

	// CLASE PRINCIPAL : POR LLEVAR EL MAIN
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche miCoche = new Coche();
		Coche miCoche2 = new Coche();

		miCoche2.configura_asientos("si");
		System.out.println("\n" + miCoche2.dime_asientos());

		miCoche.establece_color();
		miCoche.establece_color("verde");
		miCoche.establece_color("marron");

		// SALTARSE LA REGLAS DE PROGRAMACION : VIOLACION DE INTEGRIDAD
		// MANIPULAR DIRECTAMENTE LA PROPIEDAD
		// miCoche.color = "rosa"; /*FORMA NO CORRECTA*/

		System.out.println(miCoche.dime_datos_generales());

		System.out.println(miCoche.dime_color());

		miCoche.configura_asientos("si");

		System.out.println("\n" + miCoche.dime_asientos());

		miCoche.configura_climatizador("si");

		// 1º Declara el valor del climatizador
		System.out.println(miCoche.dime_climatizador());
		System.out.println(miCoche.dime_peso_coche());

		// 2º Como esta declarado el climatizador aumenta el precio basico
		System.out.println("El precio del coche es : " + miCoche.precio_coche());

		
		
	}
}
