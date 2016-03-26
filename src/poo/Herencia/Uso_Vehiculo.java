package poo.Herencia;

public class Uso_Vehiculo {

	public static void main(String[] args) {

		Coche miCoche1 = new Coche();

		miCoche1.establece_color("Rojo");

		Furgoneta miFurgoneta1 = new Furgoneta(7, 580);

		miFurgoneta1.establece_color("azul");

		miFurgoneta1.configura_asientos("si");

		miFurgoneta1.configura_climatizador("si");
		
		System.out.println(miCoche1.dime_datos_generales() + " "+miCoche1.dime_color());
		
//		Datos Heredados de la clase Coche
		System.out.println("\n"+miFurgoneta1.dime_datos_generales()+ " " + miFurgoneta1.dime_Datos_Furgoneta());

	}
}
