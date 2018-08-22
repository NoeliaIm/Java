package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Dado un número entero que se introduce por teclado, determinar si es positivo, negativo o nulo.
 */
public class PositivoNegativoNulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un número");
		int num = entrada.nextInt();
		entrada.close();
		if (num < 0) {
			System.out.println("El número es negativo");
		} else if (num > 0) {
			System.out.println("El número es positivo");
		} else {
			System.out.println("Has escrito un cero????");
		}
	}

}
