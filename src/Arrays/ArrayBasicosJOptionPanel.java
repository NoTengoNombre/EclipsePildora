package Arrays;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ArrayBasicosJOptionPanel {

	/**
	 * @param args
	 */
	public static void array_JPanel() {
		String[] paises = new String[8];

		for (int i = 0; i < paises.length; i++) {
			paises[i] = JOptionPane.showInputDialog("Introduce pais " + (i + 1));
		}
		
		for (String corre : paises) {
			System.out.println(corre);
		}
	}
}
