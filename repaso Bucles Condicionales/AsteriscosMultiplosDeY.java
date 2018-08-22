package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Dado un valor n y otro valor y, desplegar en pantalla números correlativos desde 1 hasta n,
 *         reemplazando por un * cada vez que corresponda desplegar un número múltiplo de y.
 */
public class AsteriscosMultiplosDeY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la cantidad de números");
		int veces = entrada.nextInt();
		System.out.println("Escribe el número para ocultar sus múltiplos de la lista");
		int multiplo = entrada.nextInt();
		entrada.close();
		for (int i = 1; i < veces; i++) {
			if (i % multiplo == 0) {
				System.out.print("* ");
			} else {
				System.out.print(i + " ");
			}
		}
	}

}
