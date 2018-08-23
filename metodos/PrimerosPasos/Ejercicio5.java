import java.util.Scanner;

/**
 * @author Noelia
 *Escribir un programa que realice la suma de dos números. Para ello utilizar un método que devuelva el valor de la suma, y pase los dos números a sumar como parámetros.
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe dos números separados por un intro");
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		entrada.close();
		System.out.println("La suma de los números es " + suma(a, b));
	}

	public static int suma(int a, int b) {
		return a + b;
	}
}
