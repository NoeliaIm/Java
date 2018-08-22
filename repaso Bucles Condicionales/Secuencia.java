package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Generar las secuencia:
 *         5 5 5 5 5
 *         4 4 4 4
 *         3 3 3
 *         2 2
 *         1
 */
public class Secuencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe el número de la primera fila");
		int primer = entrada.nextInt();
		int num=primer;
		entrada.close();
		for (int i = primer; i >= 1; i--) {
			for (int j = 0; j < num; j++) {
				System.out.print(num + " ");
			}
			System.out.println();
			num--;
		}
	}

}
