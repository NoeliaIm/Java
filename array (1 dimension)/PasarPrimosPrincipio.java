import java.util.Scanner;

public class PasarPrimosPrincipio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] num = new int[10];
		int[] primos = new int[10];
		int[] noPrimos = new int[10];
		int primo = 0;
		int noPrimo = 0;
		int divisores = 0;
		System.out.println("Escribe 10  números enteros separados por un intro");
		for (int i = 0; i < num.length; i++) {
			num[i] = entrada.nextInt();
		}
		entrada.close();
		System.out.print("Indice:");
		for (int i = 0; i < num.length; i++) {
			System.out.print("\t " + i);
		}
		System.out.print("\nValor:");
		for (int i = 0; i < num.length; i++) {
			System.out.print("\t " + num[i]);
		}
		for (int i = 0; i < num.length; i++) {

			for (int j = 1; j <= num[i]; j++) {
				if (num[i] % j == 0) {
					divisores++;
				}
			}
				if (divisores > 2) {
					noPrimos[noPrimo++] = num[i];
					divisores = 0;

				} else {
					primos[primo++] = num[i];
					divisores = 0;
				}
			
		}
		for (int i = 0; i < primo; i++) {
			num[i] = primos[i];
		}
		for (int i = primo; i < 10; i++) {
			num[i] = noPrimos[i - primo];
		}
		System.out.println("\n");
		System.out.print("Indice:");
		for (int i = 0; i < num.length; i++) {
			System.out.print("\t " + i);
		}
		System.out.print("\nValor:");
		for (int i = 0; i < num.length; i++) {
			System.out.print("\t " + num[i]);
		}
	}

}
