import java.util.Scanner;

/**
 * @author Noelia
 *Hacer un programa que permita calcular el factorial, utilizando una función. El resultado se deberá visualizar en la función.
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial();
	}

	public static void factorial() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num = entrada.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

		System.out.println("El factorial es " + fact);
		entrada.close();
	}
}