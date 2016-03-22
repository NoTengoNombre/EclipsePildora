package Arrays;

public class ArraysBasicos {

	public static void recorrer_array() {
		int[] mi_matriz = new int[10];
		String[] cadenaDeString = new String[10];

		for (int i = 0; i < mi_matriz.length; i++) {
			mi_matriz[i] = (int) (Math.random() * 10);
		}

		Object ob = mi_matriz[0] = 4;
		String st = ob.toString();
		System.out.print("valor de array " + st);

		if (st.equals(mi_matriz[0])) {
			System.out.println("son iguales");
		} else {
			System.out.println("\n No son iguales");

			cadenaDeString[0] = "4";
			
			if (st.equals(cadenaDeString[0])) {
				System.out.println("Son iguales");
			} else {
				System.out.println("\n No son iguales");
			}

			
		}
	}
}
