import java.util.Scanner;

public class ParODivisible5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num = entrada.nextInt();
		entrada.close();
		if (num % 2 == 0 && num % 5 == 0) {
			System.out.println("El número es par y divisible por 5");
		} else if (num % 2 == 0) {
			System.out.println("El número es par");
		} else if (num % 5 == 0) {
			System.out.println("El número es divisible por 5");
		} else {
			System.out.println("El número no es par ni divisible por 5");
		}

	}

}
