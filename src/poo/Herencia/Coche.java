package poo.Herencia;

public class Coche {

	// Declaracion PROPIEDADES o Caracteristicas comunes
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	private int peso_plataforma = 500;
	// Declaracion PROPIEDADES o Caracteristicas Propias del Objeto : Valores
	// que pueden variar
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;

	/**
	 * Metodo : Establece el Valor Inicial de los Objetos
	 */
	public Coche() {
		ruedas = 4;
		largo = 2;
		ancho = 300;
		motor = 1600;
		peso = 500;
		peso_plataforma = 500;
	}

	// Pareja de metodos Getter y Setter
	public String dime_largo() { // Getter
		return "El largo del coche es " + largo;
	}

	public String dime_color() { // Getter
		return "El color del coche es " + color;
	}

	public void establece_color() { // Setter
		color = "azul";
	}

	public void establece_color(String color_coche) {
		color = color_coche;
	}

	public String dime_datos_generales() {
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas " + " . Mide " + largo
				+ " metros , con un ancho de " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " kg";
	}

	//////////////////////////////// Declarar Variables
	public void configura_asientos(String asientos_cuero) { // SETTER
		if (asientos_cuero == "si") {
			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}
	}

	// GETTER
	public String dime_asientos() {
		if (asientos_cuero == true) {
			return "El coche tiene asientos de cuero ";
		} else {
			return "El coche no tiene asientos de cuero";
		}
	}

	// SETTER
	public void configura_climatizador(String climatizador) {

		if (climatizador.equals("si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}

	// GETTER
	public String dime_climatizador() {
		if (climatizador == true) {
			return "El coche tiene climatizador";
		} else {
			return "El coche lleva aire acondicionado";
		}
	}

	// RECOMENDABLE ES DIVIDIR TODO EL PROGRAMA EN SETTER / GETTER
	// METODO QUE TIENE : SETTER y GETTER : En funcion del parametro te devuelve
	// un valor u otro
	public String dime_peso_coche() { // SETTER + GETTER
		int peso_carrocheria = 500;
		/* variable de clase */
		// 1º declaro el total
		peso_total = peso_plataforma + peso_carrocheria;
		// 2º añado peso extras
		if (asientos_cuero == true) {
			peso_total = peso_total + 50;
		}

		if (climatizador) {
			peso_total = peso_total + 20;
		}
		return "El peso del coche es " + peso_total;
	}

	public int precio_coche() { // GETTER
		int precio_final = 10000;

		if (asientos_cuero == true) {
			precio_final += 2000;
		}
		if (climatizador) {
			precio_final += 1500;
		}
		return precio_final;
	}

}

// Subclases
class Camion {

}

// Subclases
class Moto {

}