package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * Interfaces y clases internas Interfaces IV. Vídeo 52
 * https://www.youtube.com/watch?v=0fifCsOYbXw
 * 
 * @author PORTATIL
 *
 */
public class Uso_Interfaz_Temporizador52_2_Con_Sonido {

	public static void main(String[] args) {

		// Creamos un objeto de tipo ActionListener pero a la hora de invocar al
		// constructor lo hace sobre la clase DameLaHora1 
		ActionListener oyente = new DameLaHora1();

		/* Objeto ActionListener */
		Timer miTemporizador = new Timer(5000,
				oyente/*
						 * Objeto tipo DameLaHora que implementa la Interfaz
						 * ActionListener
						 */);

		/* cuando llega a esta instruccion el programa muere en menos de 1 */
		miTemporizador.start();
		/*
		 * para que el programa continue en ejecución tenemos que hacer sacar
		 * una ventana JOptionPanel
		 */
		// JOptionPanel , deja el programa en ejecucion
		// showMEssageDialogo -> mostrar por pantalla informacion
		// Saca una ventana por pantalla : el programa se esta ejecutando
		// Si pulsamos boton continua leyendo la instruccion de abajo
		JOptionPane.showMessageDialog(null, "Pulsar aceptar para detener");
		System.exit(0); // DETIENE EJECUCION EL PROGRAMA
	}
}

/*
 * Al llamar la interfaz tenemos que implementar todos sus metodos , en este
 * caso 1
 */
class DameLaHora1 implements ActionListener {

	public void actionPerformed(ActionEvent e) {

		// Sacar por consola la hora
		/* variable objeto -> ahora */
		Date ahora = new Date();

		System.out.println("Te pongo la hora cada 5 sg : " + ahora);
	}
}
