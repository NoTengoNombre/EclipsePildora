package Iterator_183;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Colecciones.Cliente;

public class CuentaUsuarios183 {
	// Quiero almacenar objetos
	// ¿ Tiene que repetirse ?
	// 1 No debe permitirse que se repita el objeto
	// 2 Cada objeto es 1 vez aparezca
	// Buscar una coleccion que NO REPITA
	public static void main(String[] args) {
		Cliente183 cl1 = new Cliente183("Antonio", "00001", 2000);
		Cliente183 cl2 = new Cliente183("Rafael", "00002", 3000);
		Cliente183 cl3 = new Cliente183("Maria", "00003", 4000);
		Cliente183 cl4 = new Cliente183("Julio", "00004", 5000);

		// Colleccion de Clientes
		// De tipo Set - HashSet
		Set<Cliente183> clientesBanco = new HashSet<Cliente183>();

		// HashSet Detecta que esta duplicado y no lo agrega
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);

		// for (Cliente183 cliente : clientesBanco) {
		// System.out.println(cliente.getNombre() + " " +
		// cliente.getN_Cuenta()
		// + " " + cliente.getSaldo());
		// if (cliente.getNombre().equals("Julio")) {
		// clientesBanco.remove(cliente); // NOS DA ERROR NO SE PERMITE BORRAR Y
		// MOSTRAR A LA VEZ
		// }
		// }

		// Borrar un objeto con Iterator
		Iterator<Cliente183> it = clientesBanco.iterator();
		while (it.hasNext()) {
			String nombre_cliente = it.next().getNombre();
			if (nombre_cliente.equals("Julio")) {
				it.remove();
			}
		}

		for (Cliente183 cliente : clientesBanco) {
			System.out.println(cliente.getNombre() + " " + cliente.getN_Cuenta() + " " + cliente.getSaldo());
		}
	}

	// Tenemos un objeto iterador que es capaz de recorrer la coleccion
	// Iterator<Cliente183> it_rador = clientesBanco
	// .iterator(/* Metodo que devuelve lo que tiene clientesBancos */);

	// while (it_rador.hasNext()) {
	// next() da el salto
	// String nombre_cliente = it_rador.next().getNombre();
	// System.out.println(nombre_cliente);
	// String n_cuenta = it_rador.
	// }
}
