import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un número");
		int num = entrada.nextInt();
		entrada.close();
		int divisible = 0;
		for (int i = 1; i <= num; i++) {
			int resto = num % i;
			if (resto == 0) {
				divisible++;
			}

		}
		if (divisible > 2) {
			System.out.println("El número no es primo");
		} else {
			System.out.println("El número es primo");
		}
	}

}
