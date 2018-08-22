package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Escribir un programa que permita adivinar un numero que se genere internamente al azar,
 *         el cual esta en el rango de 1 a 50. El usuario debe adivinar este numero en base a aproximaciones,
 *         para lo cual se dispone de 5 intentos.
 */
public class AdivinarNumPistas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int aleatorio = (int) Math.floor(Math.random() * 50 + 1);
		System.out.println("Intenta adivinar el número que estoy pensando, entre 1 y 50");
		// System.out.println(aleatorio);
		int intentos = 1;
		int num = 0;
		int superior = 50;
		int inferior = 1;
		do {
			num = entrada.nextInt();
			if (num == aleatorio) {
				System.out.println("Felicidades, has adivinado el número.");
			} else if (num > aleatorio) {
				superior = num;
				System.out.println("El número está entre " + inferior + " y " + superior);
				System.out.println("Te quedan " + (5 - intentos) + " intentos");
			} else if (num < aleatorio) {
				inferior = num;
				System.out.println("El número está entre " + inferior + " y " + superior);
				System.out.println("Te quedan " + (5 - intentos) + " intentos");
			}
			intentos++;
		} while (intentos <= 5);
		entrada.close();
		System.out.println("Lo siento, el número buscado era " + aleatorio);
	}

}
