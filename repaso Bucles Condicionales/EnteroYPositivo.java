package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Dado un número entero y positivo que se introduce por teclado, determinar si es par o impar.
 */
public class EnteroYPositivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un número");
		int num = entrada.nextInt();
		while (num < 0) {
			System.out.println("El número debe ser entero y positivo, prueba de nuevo");
			num = entrada.nextInt();
		}
		entrada.close();
		if (num % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
	}

}
