package repaso2eval.Matrices;

import java.util.Scanner;

/**
 * @author tuppe
 *
 */
public class SeguidosDebajoDiagonalPrin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime las dimensiones de la matriz cuadrada");
		int dim = entrada.nextInt();
		entrada.close();
		int[][] matriz = new int[dim][dim];
		int num = 1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i < j ) {
					matriz[i][j] = 0;}
					else if (i<j || i!=j) {
						
					matriz[i][j]=num;
					num++;
				} /*else {
					matriz[i][j] = num;
					num++;
				}*/
			}
		}
		/*
		 * for (int i = 0; i < matriz.length; i++) {
		 * for (int j = 0; j < matriz[i].length; j++) {
		 * if (i > j || i != j) {
		 * matriz[i][j] = num;
		 * num++;
		 * } else {
		 * matriz[i][j] = 0;//escribe =0 en la diagonal principal
		 * }
		 * }
		 * }
		 */
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
		}
	}

}
