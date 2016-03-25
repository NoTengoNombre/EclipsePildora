package Arrays;

public class ArrayForEach2Dimensiones {

	public static void main(String[] args) {

		int[][] matrix = new int[10][10];

		int[][] matrix_DeIn = { { 10, 15, 18, 19, 21 }, { 10, 15, 18, 19, 21 }, { 10, 15, 18, 19, 21 } };

		/*
		 * int[][] matrix_DeIn = { { 10, 15, 18, 19, 21 }, { 10, 15, 18, 19, 21
		 * }, { 10, 15, 18, 19, 21 } };
		 */

		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 4; j++) {
				System.out.print(" " + matrix_DeIn[i][i]);
			}
		}

		System.out.println("");

		for (int[] fila : matrix) {
			System.out.println("");
			for (int col : fila) {
				System.out.print(col + " ");
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			System.out.print("");

			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println();
			}
		}

	}
}
