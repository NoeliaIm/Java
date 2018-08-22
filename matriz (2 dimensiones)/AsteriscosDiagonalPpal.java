import java.util.Scanner;

public class AsteriscosDiagonalPpal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime las dimensiones de la matriz");
		Scanner entrada = new Scanner(System.in);
		int dim = entrada.nextInt();
		entrada.close();
		int[][] matriz = new int[dim][dim];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == 0 || j == 0 || j == matriz.length - 1 || i == matriz.length - 1) {
					matriz[i][j] = 1;
				}
				if(i==j) {
					matriz[i][j]='*';
				}
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
