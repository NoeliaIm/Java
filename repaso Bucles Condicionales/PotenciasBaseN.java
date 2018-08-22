package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Escribir un programa que dados dos números, uno real (base) y un entero positivo (exponente),
 *         saque por pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido.
 */
public class PotenciasBaseN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la base");
		int base = entrada.nextInt();
		System.out.println("Escribe el exponente último");
		int exponente = entrada.nextInt();
		entrada.close();
		for (int i = 1; i < exponente+1; i++) {
			int potencia = (int) Math.pow(base, i);
			System.out.println(base + " elevado a " + i + " es igual a " + potencia);
		}
	}

}
