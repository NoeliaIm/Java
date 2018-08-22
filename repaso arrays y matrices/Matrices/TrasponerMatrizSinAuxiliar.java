package repaso2eval.Matrices;

import java.util.Scanner;

/**
 * @author tuppe
 *         Escribir un programa que transponga una matriz sin emplear una matriz auxiliar.
 *         DEBE TRATARSE DE UNA MATRIZ CUADRADA
 */
public class TrasponerMatrizSinAuxiliar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime el número de filas");
		int filas = entrada.nextInt();
		System.out.println("Dime el número de columnas");
		int col = entrada.nextInt();
		int[][] matriz = new int[filas][col];
		for (int i = 0; i < filas; i++) {
			System.out.println("Ingrese la fila");
			for (int j = 0; j < col; j++) {
				System.out.println("Indique el valor");
				matriz[j][i] = entrada.nextInt();
			}
		}
		entrada.close();
		System.out.println("Matriz traspuesta");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
		}
	}

}
