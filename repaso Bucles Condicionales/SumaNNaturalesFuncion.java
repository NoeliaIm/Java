package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Mediante el uso de una función, escribir un programa para sumar los primeros N números naturales.
 *         El resultado desplegar en la función principal.
 */
public final class SumaNNaturalesFuncion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un número");
		int num = entrada.nextInt();
		entrada.close();
		int suma = Sumatorio(num);
		System.out.println("La suma de los " + num + " primeros números naturales es " + suma);
	}

	public static int Sumatorio(int num) {
		int suma = 0;
		for (int i = 0; i <= num; i++) {
			suma += i;
		}
		return suma;
	}
}
