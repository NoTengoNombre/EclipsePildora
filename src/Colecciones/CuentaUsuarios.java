package Colecciones;

import java.util.HashSet;
import java.util.Set;

public class CuentaUsuarios {
	// Quiero almacenar objetos
	// ¿ Tiene que repetirse ?
	// 1 No debe permitirse que se repita el objeto
	// 2 Cada objeto es 1 vez aparezca
	// Buscar una coleccion que NO REPITA
	public static void main(String[] args) {
		Cliente cl1 = new Cliente("Antonio", "00001", 2000);
		Cliente cl2 = new Cliente("Rafael", "00002", 3000);
		Cliente cl3 = new Cliente("Maria", "00003", 4000);
		Cliente cl4 = new Cliente("Julio", "00004", 5000);

		Set<Cliente> clientesBanco = new HashSet<Cliente>();

		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);

		for (Cliente cliente : clientesBanco) {
			System.out.println(cliente.getNombre() + " "
					+ cliente.getN_Cuenta() + " " + cliente.getSaldo());
		}
		
	}
}
