package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Desarrollar un programa que, utilizando una función muestre en pantalla N filas de números naturales impares, de los siguientes números y en la forma siguiente:
 *         1
 *         1 3
 *         1 3 5
 *         . . . . . .
 *         N (número de filas) se debe indicar por teclado.
 */
public class NFilasNumerosImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un número de filas");
		int filas = entrada.nextInt();
		while (filas == 0) {
			System.out.println("No se pueden crear 0 filas. Inténtalo de nuevo");
			filas = entrada.nextInt();
		}
		entrada.close();
		System.out.println("Utilizando el bucle for");
		/*
		 * for (int i = 1; i < filas; i++) {
		 * if (i == 1) {
		 * System.out.println(i);
		 * }
		 * for (int j = 1; j <= i + 3; j++) {
		 * 
		 * if (j % 2 != 0) {
		 * System.out.print(j + " ");
		 * }
		 * // System.out.print(j+1+" ");
		 * }
		 * System.out.println();
		 * }
		 */
		// int a = 1, b = 2;
		for (int f = 1; filas >= f; f++) {
			System.out.println("");
			for (int c = 1; f * 2 >= c; c++) {
				{
					if ((c % 2) != 0)
						System.out.print(c + " ");
				}
			}
		}
	}

}
