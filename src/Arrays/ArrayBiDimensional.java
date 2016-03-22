package Arrays;

public class ArrayBiDimensional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int con = 0;
		int[][] matrix = new int[4][5];

		for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = con++;
				System.out.print(matrix[i][j] + " | ");
			}
		}
		System.out.println("");
		System.out.println("");

		for (int[] fila : matrix) {
			for (int z : fila) {
				System.out.print(z + " | ");
			}
			System.out.println(" - ");
		}

	}
}
