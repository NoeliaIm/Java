import java.util.Scanner;

public class NumerosHastaNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		int mayorPares = 0;
		int impares = 0;
		int sumaImpares = 0;
		int totalNumeros = 0;
		do {
			System.out.println("Dime un número");
			num = entrada.nextInt();
			if (num % 2 == 0) {
				if (num > mayorPares) {
					mayorPares = num;
				}

			} else {
				sumaImpares += num;
				impares++;
			}
			totalNumeros++;
		} while (num > 0);
		entrada.close();
		System.out.println("Se han introducido " + (totalNumeros - 1));
		System.out.println("El mayor de los números pares es " + mayorPares);
		System.out.println("La media de los números impares es " + (sumaImpares / impares));
	}

}
