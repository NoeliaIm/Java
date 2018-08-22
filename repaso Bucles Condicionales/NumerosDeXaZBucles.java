package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Desplegar los números de x hasta z, donde x <=z, a) utilizando for`s b) Utilizando while c) utilizando do while.
 */
public class NumerosDeXaZBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe el número de inicio");
		int inicio = entrada.nextInt();
		System.out.println("Escribe el número del final");
		int fin = entrada.nextInt();
		while (inicio > fin) {
			System.out.println("El número del final tiene que se mayor o igual que el del inicio. Inténtalo de nuevo");
			fin = entrada.nextInt();
		}
		entrada.close();
		System.out.println("Utilizando el bucle for");
		for (int i = inicio; i <= fin; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Utilizando el bucle while");
		int contW = inicio;
		while (contW <= fin) {
			System.out.print(contW + " ");
			contW++;
		}
		System.out.println();
		System.out.println("Utilizando el bucle do while");
		int contDW = inicio;
		do {
			System.out.print(contDW + " ");
			contDW++;
		} while (contDW <= fin);
	}

}
