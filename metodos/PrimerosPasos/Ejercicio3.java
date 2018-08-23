import java.util.Scanner;

/**
 * @author Noelia
 *Hacer un programa que realice la suma de dos números. Para ello utilizar un método que no devuelva ningún valor, y no pase ningún parámetro.
 */
public class Ejercicio3 {
	public static void main(String[] args) {
		suma();

	}

	public static void suma() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe los sumandos separados por un intro");
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		entrada.close();
		int suma = a + b;
		System.out.println("La suma de los número es " + suma);
	}
}
