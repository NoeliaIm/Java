import java.util.Scanner;

/**
 * @author Noelia
 *Hacer un programa en Java que nos permita calcular el factorial de un número que se pide por
teclado. Crear un método al que se le pase como argumento el número y calcule su factorial.
Visualizar el resultado en el método main.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num = entrada.nextInt();
		System.out.println("El factorial es " + factorial(num));
		entrada.close();
	}

	public static int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact*i;
		}
		return fact;
	}
}
