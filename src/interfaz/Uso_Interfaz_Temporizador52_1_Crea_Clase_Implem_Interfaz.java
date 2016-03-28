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
public class Uso_Interfaz_Temporizador52_1_Crea_Clase_Implem_Interfaz {

	public static void main(String[] args) {

		// Creamos un objeto que implementa la Interfaz ActionListener
		DameLaHora oyente = new DameLaHora();

		/*
		 * Objeto miTemporizador -> tipo DameLaHora que implementa la Interfaz
		 * ActionListener oyente -> Objeto ActionListener es necesario cuando
		 * creamos un evento ya que asi se asegura de que implementamos el
		 * metodo actionPerformed
		 */
		Timer miTemporizador = new Timer(1000, oyente); // metodo llama a
														// actionPerformed

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
		JOptionPane.showMessageDialog(null, "Pulsar acceptar para detener");
		System.exit(0); // DETIENE EJECUCION EL PROGRAMA
	}
}

/*
 * Al llamar la interfaz tenemos que implementar todos sus metodos , en este
 * caso 1
 */
class DameLaHora implements ActionListener {
	/**
	 * Cada 5000 el objeto oyente llama al metodo actionPerformed de la Interfaz
	 * ActionListener Timer miTemporizador = new Timer(5000,oyente) y este
	 * ejecuta su trabajo
	 */
	public void actionPerformed(ActionEvent e) {
		// Sacar por consola la hora
		/* variable objeto -> ahora */
		Date ahora = new Date();
		System.out.println("Te pongo la hora cada 5 sg : " + ahora);
	}
}
