package control_flujos.bucles_iterativos_indeterminados.While;

public class While_if_Salida_con_break_o_return {

	static int c = 0;

	public static void main(String[] args) {
		while (c != 5) {
			c = (int) (Math.random() * 6);
			if (c == 5) {

				System.out.println("soy 5");
				return; // Esta forma 
			}
			if (c == 3) {
				System.out.println("soy 3");
				break; // U esta otra forma
			} else {
				System.out.println("No soy 5 : " + c);
			}
		}
	}
}
