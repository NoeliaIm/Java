
public class RecorresArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class RecorrerMatrizPorFilasYColumnas {

		int[][] matriz = new int[50][100];
		{
			// Matriz de números enteros que supondremos llena.
			// 50 filas y 100 columnas.

			for (int i = 0; i < 50; i++) // El primer índice recorre las filas.
				for (int j = 0; j < 100; j++) { // El segundo índice recorre las columnas.
					// Procesamos cada elemento de la matriz.
					System.out.println(matriz[i][j]);
				}
		}
	}

	public class RecorrerMatrizPorColumnasYFilas {
		int[][] matriz = new int[50][100];
		{
			// Matriz de números enteros que supondremos llena.
			// 50 filas y 100 columnas.

			for (int i = 0; i < 100; i++) // El primer índice recorre las columnas.
				for (int j = 0; j < 50; j++) { // El segundo índice recorre las filas.
					// Procesamos cada elemento de la matriz.
					System.out.println(matriz[j][i]); // ¡Índices cambiados de orden!
				}
		}
	}

	public class RecorrerMatrizPorFilasYColumnasAlReves {
		{
			int[][] matriz = new int[50][100]; // Matriz de números enteros que supondremos llena.
			// 50 filas y 100 columnas.

			for (int i = 49; i > 0; i--) // El primer índice recorre las filas.
				for (int j = 99; j > 0; j--) { // El segundo índice recorre las columnas.
					// Procesamos cada elemento de la matriz.
					System.out.println(matriz[i][j]);
				}
		}
	}

	public class RecorrerMatrizPorFilasYColumnasAlReves2 {
		{
			int[][] matriz = new int[50][100]; // Matriz de números enteros que supondremos llena.
			// 50 filas y 100 columnas.

			for (int i = 0; i < 50; i++) // El primer índice recorre las filas.
				for (int j = 0; j < 100; j++) { // El segundo índice recorre las columnas.
					// Procesamos cada elemento de la matriz.
					System.out.println(matriz[49 - i][99 - j]);
				}
		}
	}

}
