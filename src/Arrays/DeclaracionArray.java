package Arrays;

import java.util.Scanner;

public class DeclaracionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte[] b = new byte[5];

		int[] mi_matriz1 = new int[5];

		String[] s = new String[10];
		Object[] o = new Object[10];
		Integer[] i = new Integer[10];
		Scanner[] sc = new Scanner[10];

		int[] mi_matriz = new int[5];

		mi_matriz[0] = 5;
		mi_matriz[1] = 38;
		mi_matriz[2] = -15;
		mi_matriz[3] = 92;
		mi_matriz[4] = 71;

		System.out.println(mi_matriz[0]);
		System.out.println(mi_matriz[1]);
		System.out.println(mi_matriz[2]);
		System.out.println(mi_matriz[3]);
		System.out.println(mi_matriz[4]);

		if (mi_matriz[3] == 92) {
			System.out.println("\n Si");
		}

		for (int ii = 0; ii < 5; ii++) {
			System.out.println("Valor de indice " + ii + " = " + mi_matriz[ii]);
		}

		int[] mi_matriz2 = { 5, 38, -15, 92, 71 };

		for (int j : mi_matriz2) {
			System.out.println("for mejorada " + j);
		}
		
		for ( int r = 0 ; r < mi_matriz.length; r++){
			System.out.println("for length " + mi_matriz[r] );
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
