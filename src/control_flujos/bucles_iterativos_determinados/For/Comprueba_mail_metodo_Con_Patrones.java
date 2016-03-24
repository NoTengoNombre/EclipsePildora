package control_flujos.bucles_iterativos_determinados.For;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Comprueba_mail_metodo_Con_Patrones {

	protected static boolean esEmailCorrecto(String email) {
		boolean valido = false;
		Pattern patronEmail = Pattern
				.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)(\\.[A-Za-z]{2,})$");
		Matcher mEmail = patronEmail.matcher(email.toLowerCase());
		if (mEmail.matches()) {
			valido = true;
		}
		return valido;
	}

	public static void main(String[] args) {

	}
}