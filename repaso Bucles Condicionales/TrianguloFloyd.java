package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Mediante una función desplegar en pantalla N números naturales, en la siguiente forma:
 *         1
 *         2 3
 *         4 5 6
 *         …………
 *         El Triángulo de Floyd, llamado así en honor a Robert Floyd, es un triángulo rectángulo formado con números naturales.
 *         Para crear un triángulo de Floyd, se comienza con un 1 en la esquina
 *         superior izquierda y se continúa escribiendo la secuencia de los números naturales
 *         de manera que cada línea contenga un número más que la anterior.
 */
public class TrianguloFloyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe el número de filas que quieres");
		int filas = entrada.nextInt();
		entrada.close();
		Floyd(filas);
	}

	public static void Floyd(int filas) {
		int t=1;
		for (int i = 1; i <= filas; i++) {
			for (int j = t; j <= t+i-1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
			t+=i;
		}
	}
}
