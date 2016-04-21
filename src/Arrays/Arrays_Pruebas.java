package Arrays;

public class Arrays_Pruebas {

	private static int c = 0;

	public static void main(String[] args) {

		int [][] a = new int [0][3];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("*");
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("♦");
			}
		}
	}

}
