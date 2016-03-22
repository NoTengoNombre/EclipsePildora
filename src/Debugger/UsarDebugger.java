package Debugger;

import javax.swing.JOptionPane;

public class UsarDebugger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos de la matriz"));

		int num_aleat[] = new int[elementos];

		for (int i = 0; i < num_aleat.length; i++) {
			
			num_aleat[i] = (int) (Math.random() * 100);
			
		}

		for (int element : num_aleat) {
			
			System.out.println(element);
			
		}

	}
}
