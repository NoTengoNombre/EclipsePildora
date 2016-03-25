package poo.Objeto;

public class Array_Coches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche c0 = new Coche();
		Coche Renault = new Coche(); // INSTANCIAR UNA CLASE / EJEMPLAR DE CLASE
		Coche micoche = new Coche();

		System.out.println(Renault.dime_largo() + 100);

		micoche.establece_color();

		System.out.println(micoche.dime_color());

		Coche[] c1 = new Coche[3];
		Coche[][] c2 = new Coche[3][3];
		for (int i = 0; i < c1.length; i++) {
			System.out.println("longitud " + c1.length);
		}

		System.out.println("--------------------------------");
		for (Coche[] coches : c2) {
			for (Coche coche : coches) {
				System.out.println(coche);
			}
		}
		System.out.println("--------------------------------");
		System.out.println("");
		for (int i = 0; i < c2.length; i++) {
			for (int j = 0; j < c2[i].length; j++) {
				System.out.println(c2[i][j]);
			}
		}

	}
}
