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

public class Clase_Interna_Dentro_Metodo_Temporizador_con_Sonido54_masSimplificado {

	public static void main(String[] args) {

		Reloj54_2 mireloj = new Reloj54_2();
		mireloj.enMarcha(3000, true);
		JOptionPane.showMessageDialog(null, " Pulsa para terminar");
		System.exit(0);
	}
}

// Clase interna para construir un objeto de tipo reloj
class Reloj54_2 {
	// poner el marcha el reloj para que imprima el valor
	public void enMarcha(int intervalo, final boolean sonido) {
		// Clase Interna dentro del Metodo va desde la apertura de enMarcha(){
		// hasta el cierre del metodo
		class DameLaHora2 implements ActionListener {
			
			public void actionPerformed(ActionEvent evento) {
				Date ahora = new Date();
				System.out.println("Te pongo la hora " + ahora);
				if (sonido == true) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		} // cierre de la clase DameLaHora No es visible POR NINGUNA CLASE ni
			// por la de RELOJ

		// interfaz<---objeto-= new Clase
		ActionListener oyente = new DameLaHora2();
		Timer mitemporizador = new Timer(intervalo, oyente);
		mitemporizador.start();
	} // cierre del metodo enMarcha()
}