import java.util.Scanner;

/**
 * @author Noelia
 *Modificar el programa anterior para que el resultado se visualice en el programa principal.
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = factorial();
		System.out.println("El factorial es " + fact);
	}

	public static int factorial() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num = entrada.nextInt();
		entrada.close();
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

		return fact;

	}
}
