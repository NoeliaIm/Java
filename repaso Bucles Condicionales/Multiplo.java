package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Dado un numero x determinar si es múltiplo de otro numero y.
 */
public class Multiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un número");
		int x = entrada.nextInt();
		System.out.println("Escribe otro número");
		int y = entrada.nextInt();
		entrada.close();
		if (x % y == 0) {
			System.out.println(x + " es múltiplo de " + y);
		} else if (y % x == 0) {
			System.out.println(y + " es múltiplo de " + x);
		} else {
			System.out.println("Los números no son múltiplos");
		}
	}

}
