package repaso2eval.Matrices;

import java.util.Scanner;

/**
 * @author tuppe
 *         Escribir un programa que muestre en pantalla los elementos de una matriz al recorrer esta en espiral partiendo
 *         desde el elemento 1,1 en sentido de las agujas del reloj
 */
public class RecorrerEnEspiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime el tamaño de una matriz cuadrada");
		Scanner entrada = new Scanner(System.in);
		int tamanio = entrada.nextInt();
		entrada.close();
		int[][] matriz = new int[tamanio][tamanio];
		int i, j, k = 1;
		for (int d = 1; d < tamanio / 2 + 1; d++) {
			i = j = d - 1;
			for (; j < tamanio - d; j++)
				matriz[i][j] = k++;
			for (; i < tamanio - d; i++)
				matriz[i][j] = k++;
			for (; j >= d; j--)
				matriz[i][j] = k++;
			for (; i >= d; i--)
				matriz[i][j] = k++;
		}
		//matriz[tamanio / 2][tamanio / 2] = tamanio * tamanio;
		for (int k2 = 0; k2 < matriz.length; k2++) {
			System.out.println();
			for (int l = 0; l < matriz.length; l++) {
				System.out.print(matriz[k2][l]+"\t");
			}
		}
	}

}
