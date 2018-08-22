package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Dado un número entero que se introduce por teclado, determinar si es negativo o superior a 100.
 */
public class NegativoOMasCien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un número para veficar las condiciones de entrada");
		int num = entrada.nextInt();
		entrada.close();
		if (num < 0) {
			System.out.println("El número es negativo");
		} else if (num > 0 && num < 100) {
			System.out.println("El número es positivo y menor que 100");
		} else {
			System.out.println("El número es mayor que 100");
		}
	}

}
