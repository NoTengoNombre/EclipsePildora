package Arrays;

public class EjemploArrayMoverSobreColumnasFilas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println();

		int[][] vector3 = new int[7][4];

		int contadores1 = 010;

		for (int i = 0; i < vector3.length; i++) {
			for (int j = 0; j < vector3[i].length; j++) {
				vector3[i][j] = contadores1++;
				vector3[2][1] = 23;
				System.out.print("|" + vector3[i][j] + "|");
			}
			System.out.println("");
		}

		System.out.println();
		System.out.println();
		System.out.println();
		String[][] vector4 = new String[7][4];
		for (int col = 0; col < vector4.length; col++) {
			for (int fi = 0; fi < vector4[col].length; fi++) {
				vector4[col][fi] = "o";
				// vector4[2][1] = "X";
				// vector4[3][3] = "X";
				// vector4[4][0] = "X";
				vector4[3][1] = "X";
				System.out.print("|" + vector4[col][fi] + fi + col);
			}
			System.out.println("");
		}

		System.out.println();
		System.out.println();
		System.out.println();
		String[][] vector5 = new String[7][4];
		for (int i = 0; i < 4; i++) {
			System.out.print(" c" + "-" + "f ");
		}
		System.out.println("");
		for (int col = 0; col < vector5.length; col++) {
			for (int fi = 0; fi < vector5[col].length; fi++) {
				// System.out.print("|" + col + "-" +fi+ "|");
				System.out.print("|" + fi + "-" + col + "|");
			}
			System.out.println("");
		}
	}
}
