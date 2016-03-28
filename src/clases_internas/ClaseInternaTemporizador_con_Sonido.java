package clases_internas;

/**
 * Curso Java. Interfaces y clases internas. Clases internas I. Vídeo 53
 * 
 * @author PORTATIL
 *
 */

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class ClaseInternaTemporizador_con_Sonido {

	public static void main(String[] args) {

		Reloj mireloj = new Reloj(3000, true);
		mireloj.enMarcha();
		JOptionPane.showMessageDialog(null, " Pulsa para terminar");
		System.exit(0);
	}
}

// Clase interna para construir un objeto de tipo reloj
class Reloj {
	// Constructor que genera un reloj
	public Reloj(int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;
	}
	// poner el marcha el reloj para que imprima el valor
	public void enMarcha() {
		// interfaz<---objeto-= new Clase
		ActionListener oyente = new DameLaHora2();

		Timer mitemporizador = new Timer(intervalo, oyente);
		mitemporizador.start();
	}
	// clase interna
	private class DameLaHora2 implements ActionListener {
		public void actionPerformed(ActionEvent evento) {
			Date ahora = new Date();
			System.out.println("Te pongo la hora " + ahora);
			if (sonido == true) {
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
	// campos encapsulados
	private int intervalo;
//	No pertenece a la clase Interna pero la clase Interna puede acceder a ella
	private boolean sonido;
}
