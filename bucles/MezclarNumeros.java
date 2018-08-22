import java.util.Scanner;

public class MezclarNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un número");
		long num1 = entrada.nextLong();
		System.out.println("Escribe otro número de igual longitud");
		long num2 = entrada.nextLong();
		entrada.close();
		long delReves1 = 0;
		long delReves2 = 0;
		int longitud = 0;
		long numPares = 0;
		long numImpares = 0;
		while (num1 > 0) {
			delReves1 = (delReves1 * 10) + (num1 % 10);
			num1 /= 10;
			longitud++;
		}
		while (num2 > 0) {
			delReves2 = (delReves2 * 10) + (num2 % 10);
			num2 /= 10;
		}
		for (int i = 0; i < longitud; i++) {
			int digito = (int) delReves1 % 10;
			if (digito % 2 == 0) {
				numPares = (numPares * 10) + digito;

			} else {
				numImpares = (numImpares * 10) + digito;
			}
			delReves1 /= 10;
			digito = (int) delReves2 % 10;
			if (digito % 2 == 0) {
				numPares = (numPares * 10) + digito;

			} else {
				numImpares = (numImpares * 10) + digito;
			}
			delReves2 /= 10;

		}
		System.out.println("El número formado por los dígitos pares es " + numPares);
		System.out.println("El números formado por los dígitos impares es "+numImpares);
	}

}
