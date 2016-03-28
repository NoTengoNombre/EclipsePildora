package crea_Excepciones;

import javax.security.auth.login.LoginException;
import javax.swing.JOptionPane;

public class Crear_Excepciones_propias {

	public static void main(String[] args) {

		String mail = JOptionPane.showInputDialog("Intro mail");

		try {
			examina_mail(mail);
		} catch (Exception e) {
			System.out.println("La direccion de email no es correcta : " + e.getMessage());
			e.printStackTrace(); // llamada pila de error : nos dice que clase lanza el error  
		}
	}

	static void examina_mail(String mail)
			throws Longitud_mail_erronea /* throws EOFException */ {

		int arroba = 0;

		boolean punto = false;

		if (mail.length() <= 3) {

			// throw new EOFException();
			throw new Longitud_mail_erronea("El mail es demasiado corto");
//			throw new Longitud_mail_erronea();

		} else {
			for (int i = 0; i < mail.length(); i++) {
				if (mail.charAt(i) == '@') {
					arroba++;
				}
				if (mail.charAt(i) == '.') {
					punto = true;
				}
			}
		}

		if (arroba == 1 && punto == true) {
			System.out.println("Email correcto");
		} else if (arroba == 0) {
			System.out.println("Email NO correcto");
		} else if (arroba > 1 || arroba < 1) {
			System.out./*Puedo hacerlo*/println("Email NO correcto");
		}
	}
}

class Longitud_mail_erronea extends
		Exception /* <-Necesita try/catch */ /* RuntimeException *//*
																	 * <-No hace
																	 * falta
																	 * try/catch
																	 */ {
	// 1- 2º constructores por defecto y del tipo String
	public Longitud_mail_erronea() {

	}

	public Longitud_mail_erronea(String msj_error) {
		super(msj_error); // estamos llamando al constructor de la clase padre
	}

}
