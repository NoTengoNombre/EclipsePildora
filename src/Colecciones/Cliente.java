package Colecciones;

public class Cliente {

	private String nombre;
	private String n_cuenta;
	private double saldo;

	public Cliente(String nombre, String n_cuenta, double saldo) {
		this.nombre = nombre;
		this.n_cuenta = n_cuenta;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getN_Cuenta() {
		return this.n_cuenta;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setN_Cuenta(String n_cuenta) {
		this.n_cuenta = n_cuenta;
	}

	public void set_Saldo(double saldo) {
		this.saldo = saldo;
	}

}
