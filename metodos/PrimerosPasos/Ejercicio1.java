import java.util.Scanner;

/**
 * @author Noelia
 *Hacer un programa que permita dibujar una línea de “n” asteriscos utilizando un método.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime el número de asteriscos que quieres dibujar");
		int num = entrada.nextInt();
		entrada.close();
		asteriscos(num);
	}

	public static void asteriscos(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}
	}
}
