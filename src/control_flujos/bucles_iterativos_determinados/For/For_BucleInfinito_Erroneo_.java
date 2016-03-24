package control_flujos.bucles_iterativos_determinados.For;

public class For_BucleInfinito_Erroneo_ {

	public static void main(String[] args) {

		for (int i = 10; 10 > 1; i--) {
			System.out.println(i);
			if (i == -10) {
				return;
			}
		}

	}

}
