import java.util.Scanner;

/**
 * @author Noelia
 *Hacer un programa que realice la suma de dos números. Para ello utilizar un método que devuelva el valor de la suma.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("El resultado de la suma es " + suma());

	}

	public static int suma() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe dos números separados por un intro");
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		entrada.close();
		return a + b;

	}
}
