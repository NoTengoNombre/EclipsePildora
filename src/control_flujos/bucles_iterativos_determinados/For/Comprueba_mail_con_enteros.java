	package control_flujos.bucles_iterativos_determinados.For;

import javax.swing.JOptionPane;

public class Comprueba_mail_con_enteros {

	public static void main(String[] args) {

		int arroba = 0;
		boolean punto = false;

		String mail = JOptionPane.showInputDialog("intro mail");

		for (int i = 0; i < mail.length(); i++) {

			if (mail.charAt(i) == '@') {
				arroba++;
			}

			if (mail.charAt(i) == '.') {
				punto = true;
			}
		}
		if (arroba == 1 && punto == true) {
			System.out.println("Email Correcto");
		} else {
			System.out.println("Email NO Correcto");
		}

	}
}
