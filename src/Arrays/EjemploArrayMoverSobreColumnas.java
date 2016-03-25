package Arrays;

public class EjemploArrayMoverSobreColumnas {

	public static void main(String[] args) {

		double[][] horizontal = new double[6][5];

		int c = 0;
		// 1º for se recorre de forma HORIZONTAL
		for (int i = 0; i < 6; i++) {
			horizontal[i][0] = 100;
			System.out.print(horizontal[i][0] + "-" + c++ + " | ");
			// 2º for se recorre de forma VERTICAL
			for (int j = 0; j < 5; j++) {
			}
		}

		System.out.println("");
		System.out.println("--------------------------");
		System.out.println("");

		int[][] HorizVerti = new int[6][6];

		// 1º for Se mueve de izquierda a derecha con el
		// 2º for Se mueve de Arriba a abajo
		HorizVerti[0][0] = 8;
		HorizVerti[1][1] = 8;
		HorizVerti[2][2] = 8;
		HorizVerti[3][3] = 8;
		HorizVerti[4][4] = 8;
		HorizVerti[5][5] = 8;

		for (int verti = 0; verti < 6; verti++) {
			System.out.println();
			for (int horiz = 0; horiz < 6; horiz++) {
				System.out.print("| " + HorizVerti[horiz][verti] + " | ");
			}
		}

		System.out.println();
		System.out.println();
		System.out.println();

		String[][] vector1 = new String[4][4];

		for (int verti = 0; verti < 4; verti++) {
			System.out.println();
			for (int horiz = 0; horiz < 4; horiz++) {
				vector1[verti][horiz] = "•";
				vector1[0][0] = "@";
				vector1[1][0] = "*";
				vector1[2][0] = "*";
				vector1[3][0] = "*";
				vector1[0][1] = "@";
				vector1[0][2] = "@";
				vector1[0][3] = "@";
				System.out.print("|" + vector1[verti][horiz] + "|");
			}
		}

		System.out.println();
		System.out.println();
		System.out.println();

		String[][] vector2 = new String[7][4];

		int contadores = 0;
		int c1 = 0;
		int c2 = 0;

		for (int i = 0; i < vector2[i].length; i++) {
			System.out.print(" "+"f"+c2++);
		}
		for (int i = 0; i < 7; i++) {
			System.out.println();
			System.out.print("c"+c1++);
			for (int j = 0; j < 4; j++) {
//				        c  f
				vector2[i][j] = "o";
				vector2[0][0] = "x";
				vector2[1][0] = "x";
				vector2[2][0] = "x";
				vector2[3][0] = "x";
				vector2[3][1] = "x";
				vector2[3][2] = "x";
				vector2[3][3] = "x";
				vector2[4][0] = "☻";
				vector2[5][0] = "x";
				vector2[6][0] = "x";
				System.out.print("|" + vector2[i][j] + "|");
			}
		}

		System.out.println();
	}
}
