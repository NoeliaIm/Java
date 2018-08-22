import java.util.Scanner;

public class Diagonales {
	static int numero = 1;

	public static void rellenarDiagonalAscendente(int[][] a, int n) {
		for (int i = 0; i <= n; ++i) {
			for (int j = n; j >= 0; --j) {
				if ((i + j) == n) {
					a[i][j] = numero;
					++numero;
				}

			}
		}
	}

	public static void rellenarDiagonalDescendente(int[][] a, int n) {
		for (int i = 1; i < a.length; ++i) {
			for (int j = a.length - 1; j >= 0; --j) {
				if ((i + j) == n) {
					a[i][j] = numero;
					++numero;
				}

			}
		}
	}

	public static void rellenarAscendente(int[][] a) {
		for (int k = 0; k < a.length; ++k)
			rellenarDiagonalAscendente(a, k);
	}

	public static void rellenarDescendente(int[][] a) {
		for (int k = a.length; k <= 2 * (a.length - 1); ++k)
			rellenarDiagonalDescendente(a, k);
	}

	public static void mostrarMatriz(int[][] a) {
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[0].length; ++j) {
				System.out.print(a[i][j] + "  ");
			}

			System.out.println();
		}
	}

	public static void main(String args[]) {
		int n = 0;

		numero = 1;
		Scanner teclado = new Scanner(System.in);
		int[][] array;

		System.out.print("Introduce dimensión de la matriz cuadrada: ");
		n = teclado.nextInt();
		teclado.close();
		array = new int[n][n];

		System.out.println();
		rellenarAscendente(array);
		rellenarDescendente(array);
		mostrarMatriz(array);

	}
}
