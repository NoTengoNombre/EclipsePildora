package control_flujos.bucles_iterativos_indeterminados.DoWhile;

import javax.swing.JOptionPane;

public class Peso_Ideal_Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String genero = ""; // almacena el genero

		do {
			genero = JOptionPane.showInputDialog("Introduce genero H o M");

		} while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);

		System.out.println("Salida do-While");

		int altura = Integer.parseInt(JOptionPane.showInputDialog("Intro altura cm"));

		int pesoIdeal = 0;

		if (genero.equalsIgnoreCase("H")) {
			pesoIdeal = altura - 110;
		} else if (genero.equalsIgnoreCase("M")) {
			pesoIdeal = altura - 120;
		}

		System.out.println("El peso ideal para " + altura  + " es : " + pesoIdeal + " para " + genero);

	}

}
