package Arrays;

public class EjemploArray2D_Beneficio_Bancario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar Variables voy a usar
		double acumulado;
		// Declarar e Inicializar
		///////// ↓↓↓ EL INTERES ACUMULADO QUE INCREMENTO ABAJO VUELVE ARRIBA
		double interes = 0.10;
		// F C
		double[][] saldo = new double[6][5];

		for (int i = 0; i < 6; i++) {
			saldo[i][0] = 100;
			acumulado = 100;

			for (int j = 1; j < 5; j++) {
				// interes : ACUMULADO QUE
				// SE FIJO ARRIBA Y SE AUMENTO ABAJO
				// SE AÑADE A ACUMULADO
				////////////////////////////////////// ↓↓↓
				acumulado = acumulado + (acumulado * interes);
				saldo[i][j] = acumulado;
			}
			// El interes se acumula y VUELVE ARRIBA
			// ↓↓↓
			interes = interes + 0.01;
		}

		int c = 0;
		int c1 = 0;
		for (int i = 0; i < 5; i++) {
			System.out.printf("  c" + c++ + "\t");
		}

		for (int z = 0; z < 6; z++) {
			System.out.println();
			System.out.print("f" + c1++ + "" + "|");
			for (int h = 0; h < 5; h++) {
				System.out.printf("%1.2f", saldo[z][h]);
				System.out.print("|");
			}
		}
	}

}
