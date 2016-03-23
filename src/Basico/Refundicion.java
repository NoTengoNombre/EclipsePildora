package Basico;

public class Refundicion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float num1 = 4f;
		int raiz = (int) Math.round(num1);

		double num2 = 422.22;
		int raiz1 = (int) Math.round(num1);

		System.out.println(raiz1);

		double base = 5;

		double exponente = 3;

		int resultado_i = (int) Math.pow(base, exponente);

		System.out.println(resultado_i);
		
		double resultado_d = Math.pow(base, exponente);

		System.out.println(resultado_d);
	}
}
