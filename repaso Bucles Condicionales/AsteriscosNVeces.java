package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Realizar un programa que lea un numero, luego desplegar esa cantidad de *
 */
public class AsteriscosNVeces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un número de veces");
		int veces = entrada.nextInt();
		entrada.close();
		for (int i = 0; i < veces; i++) {
			System.out.print("* ");
		}
	}

}
