package Arrays;

public class ArrayBiDimensionales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrices = new int[4][6];

		matrices[0][0] = 1;
		matrices[0][1] = 2;
		matrices[0][2] = 3;
		matrices[0][3] = 4;
		matrices[0][4] = 5;
		matrices[0][5] = 6;

		matrices[1][0] = 7;
		matrices[1][1] = 8;
		matrices[1][2] = 9;
		matrices[1][3] = 10;
		matrices[1][4] = 11;
		matrices[1][5] = 12;

		matrices[2][0] = 13;
		matrices[2][1] = 14;
		matrices[2][2] = 15;
		matrices[2][3] = 16;
		matrices[2][4] = 17;
		matrices[2][5] = 18;

		matrices[3][0] = 19;
		matrices[3][1] = 20;
		matrices[3][2] = 21;
		matrices[3][3] = 22;
		matrices[3][4] = 23;
		matrices[3][5] = 24;

		for (int i = 0; i < 4; i++) {
			System.out.println();
			for (int j = 0; j < 6; j++) {
				System.out.print(matrices[i][j] + " ");
			}
		}

	}

}
