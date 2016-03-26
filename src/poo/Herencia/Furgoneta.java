package poo.Herencia;

public class Furgoneta extends Coche {

	// Caracteristicas propias de la subClase

	private int capacidad_carga;
	private int plazas_extra;

	public Furgoneta(int plazas_extra, int capacidad_carga) {
		super();
		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extra;
	}

	public String dime_Datos_Furgoneta() {
		return "la capacidad de carga es : " + capacidad_carga + " las plazas son : " + plazas_extra;
	}
}
