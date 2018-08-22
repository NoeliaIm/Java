import java.util.Scanner;

public class SumaMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime las dimensiones de las matrices");
		Scanner entrada = new Scanner(System.in);
		int dim = entrada.nextInt();
		entrada.close();
		int[][] matriz1 = new int[dim][dim];
		int[][] matriz2 = new int[dim][dim];
		rellenarMatriz(matriz1);
		rellenarMatriz(matriz2);
		System.out.println("MATRIZ 1");
		System.out.println("---------------------------------");
		leerMatriz(matriz1);
		System.out.println("MATRIZ 2");
		System.out.println("----------------------------------");
		leerMatriz(matriz2);
		System.out.println("SUMA DE LAS MATRICES");
		System.out.println("-----------------------------------------");
		sumarMatrices(matriz1, matriz2, dim);
	}

	public static void rellenarMatriz(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) Math.floor(Math.random() * 10);
			}
		}

	}

	public static void leerMatriz(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void sumarMatrices(int[][] array1, int[][] array2, int dim) {
		int[][] array3 = new int[dim][dim];
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array3[i][j] = array1[i][j] + array2[i][j];
			}
		}
		leerMatriz(array3);
	}

}
