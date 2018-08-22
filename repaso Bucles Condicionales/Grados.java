package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Convertir grados Centigrados en grados Fahrenheit
 */
public class Grados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime la temperatura en grados centígrados");
		double centigrados = entrada.nextInt();
		entrada.close();
		double fahrenheit = ((9 *centigrados) / 5) + 32;
		System.out.println("Grados Fahrenheit: " + fahrenheit);
	}

}
