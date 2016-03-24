package usarJOptionPane;

import javax.swing.JOptionPane;

public class FormatearDatos {

	public static void main(String[] args) {

//		Uso de la clase Static JOptionPane
//		Metodo showInputDialog("") - Recibe como parametro un Objeto de cualquier tipo -> String , Object , Array
//		Se Almacena dentro del String num1
		String num1 = JOptionPane.showInputDialog("introduce un numero");
//      El valor lo convertirmos a Double por medio de la clase estatica Double y el metodo parseDouble
//		la variable num2 almacena el valor convertido de num1
		double num2 = Double.parseDouble(num1);

		System.out.print("La raiz de " + num2 + " es ");
//      Ahora podemos pasarle la variable num2 a la clase estatica Math y al metodo sqrt para mostrar el valor
		System.out.printf("\n %1.2f",Math.sqrt(num2));
		System.out.printf("\n %1.3f",Math.sqrt(num2));
		System.out.printf("\n %1.4f",Math.sqrt(num2));
	}

}
