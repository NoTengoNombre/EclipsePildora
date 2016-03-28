package clases_internas;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class MiTemporizadorConClaseInterna {

	public static void main(String[] args) {

		ActionListener oyente = new DameLaHora();
		
		Timer miTemporizador = new Timer(5000,oyente);
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsar aceptar para detener");
		System.exit(0);
	}
}

class DameLaHora implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		Date ahora = new Date();
		System.out.println("Te pongo la hora cada 5 sg : " + ahora);
		Toolkit.getDefaultToolkit().beep();

	}

}
