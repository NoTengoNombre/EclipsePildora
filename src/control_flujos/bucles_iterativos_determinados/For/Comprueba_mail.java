package control_flujos.bucles_iterativos_determinados.For;

import javax.swing.JOptionPane;

public class Comprueba_mail {

	public static void main(String[] args) {

		boolean arroba = false;

		String mail = JOptionPane.showInputDialog("intro mail");

		for (int i = 0; i < mail.length(); i++) {

			if (mail.charAt(i) == '@') {
				arroba = true;
			}
		}
		
		
		if (arroba == true) {
			System.out.println("Email Correcto");
		}else{
			System.out.println("Email NO Correcto");
		}
		
	}
}
