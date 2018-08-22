import java.util.Scanner;

public class RellenarMatrizUNOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe las dimensiones de la matriz");
		int dim = entrada.nextInt();
		entrada.close();
		rellenarMatriz(dim);

	}

	public static void rellenarMatriz(int dim) {
		int[][] matriz = new int[dim][dim];
		for (int i = 0; i < matriz.length; i++) {
			int dig = 1;
			for (int j = 0; j < matriz[i].length; j++) {
				if (i > j) {
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = dig;
					dig++;
				}
			}
		}
		leerMatriz(matriz);
	}

	public static void leerMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
