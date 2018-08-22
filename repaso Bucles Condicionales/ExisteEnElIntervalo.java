package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Dado un número entero que se introduce por teclado, determinar si se encuentra en el intervalo cerrado 51 - 100.
 */
public class ExisteEnElIntervalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un número");
		int num = entrada.nextInt();
		entrada.close();
		if (num >= 51 && num <= 100) {
			System.out.println("El número se encuentra entre el 51 y el 100");
		} else {
			System.out.println("El número no se encuentra entre el 51 y el 100");
		}
	}

}
