package repaso2eval.Matrices;

import java.util.Scanner;

/**
 * @author tuppe
 *         Escribir un programa que verifique que una matriz M de orden N*N (cuadrada) es una matriz simétrica.
 */
public class DimeSiEsSimetrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime la dimesion de la matriz");
		int tamanio = entrada.nextInt();
		int[][] matriz = new int[tamanio][tamanio];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Introduce un valor para la fila " + i + " columna " + j);
				matriz[i][j] = entrada.nextInt();
			}
		}
		entrada.close();
		EsSimetrica(matriz);
	}

	public static void EsSimetrica(int[][] matriz) {
		int simetrica = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] != matriz[j][i]) {//comprobamos los diferentes
					simetrica++;
				}
			}
		}
		if (simetrica != 0) {
			System.out.println("La matriz no es simétrica");
		} else {//para ser simétrica los diferentes deben ser iguales a 0
			System.out.println("La matriz es simétrica");
		}
	}

}
