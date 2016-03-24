package Arrays;

import javax.swing.JOptionPane;

public class Bucle_For_Each {

	public static void main(String[] args) {
		int c = 0;

		String[] paises = new String[8];

		paises[0] = "E";
		paises[1] = "s";
		paises[2] = "p";
		paises[3] = "a";
		paises[4] = "ñ";
		paises[5] = "a";
		paises[6] = "!";
		paises[7] = ">";

		for (int i = 0; i < paises.length; i++) {
			System.out.print(paises[i]);
		}

		System.out.print("\n");

		for (String elemento : paises) {
			System.out.print(" " + elemento + "" + c++);
		}

		String[] paises2 = { "E", "s", "p", "a", "ñ", "a " };

		for (int i = 0; i < paises2.length; i++) {
			paises2[i] = JOptionPane.showInputDialog("Introduce pais " + (i + 1));
			System.out.println(paises2[i]);
		}

		for (String e : paises2) {
			System.out.println("con foreach "+e);
		}
		
		
	
		
	}
}
