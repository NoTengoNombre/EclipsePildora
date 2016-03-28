package excepciones;

import javax.swing.JOptionPane;

public class CapturaExcepciones_4_ClausulaThrow_y_Throws {

	static boolean punto = false;

	public static void main(String[] args) {

		String el_mail = JOptionPane.showInputDialog("intro email");

		examina_mail2(el_mail);

	}

	static void examina_mail(String mail) {
		int arroba = 0;
		for (int i = 0; i < mail.length(); i++) {
			if (mail.charAt(i) == '@') {
				arroba++;
			}
			if (mail.charAt(i) == '.') {
				punto = true;
			}
		}

		if (arroba == 1 && punto == true) {
			System.out.println("Es correcto");
		} else {
			System.out.println("No es correcto");
		}

	}

	/*
	 * Mi version
	 */
	static void examina_mail2(String mail) {
		int arroba = 0;

		// Para controlar una ERROR tipo Exception con throw
		if (mail.length() <= 3) {
			ArrayIndexOutOfBoundsException mi_excepcion = new ArrayIndexOutOfBoundsException();
//			throw mi_excepcion; // ESTO NO SE HACE
			throw new ArrayIndexOutOfBoundsException();
			 
		} else {

			for (int i = 0; i < mail.length(); i++) {
				if (mail.charAt(i) == '@') {
					arroba++;
				}
				if (mail.charAt(i) == '.') {
					punto = true;
				}
			}

			if (arroba == 1 && punto == true) {
				System.out.println("Email correcto");
			} else if (arroba == 0) {
				System.out.println("Email NO correcto");
			} else if (arroba > 1 || arroba < 1) {
				System.out.println("Email NO correcto");
			}
		}
	}

}
