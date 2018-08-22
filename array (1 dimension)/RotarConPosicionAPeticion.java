import java.util.Scanner;

public class RotarConPosicionAPeticion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[10];
		int iinicial = 0;
		int ifinal = 0;
		boolean valido;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe 10 números enteros separados por un intro");
		for (int i = 0; i < num.length; i++) {
			num[i] = entrada.nextInt();
		}

		do {
			valido = true;
			System.out.println("Introduzca la posición inicial (0-9): ");
			iinicial = entrada.nextInt();
			if (iinicial < 0 || iinicial > 9) {
				System.out.println("El número debe estar entre 0 y 9");
				valido = false;
			}
			System.out.println("Introduzca la posición final (0-9): ");
			ifinal = entrada.nextInt();
			if (ifinal < 0 || ifinal > 9) {
				System.out.println("El número debe estar entre 0 y 9");
				valido = false;
			}
			if (iinicial >= ifinal) {
				System.out.println("El número inicial debe ser menor que el número final");
				valido = false;
			}
		} while (!valido);
		entrada.close();

		System.out.println("\nArray inicial");// muestro el array inicial
		System.out.print("Índice:");
		for (int i = 0; i < num.length; i++) {
			System.out.print("\t" + i);
		}
		System.out.print("\nValor:");
		for (int i = 0; i < num.length; i++) {
			System.out.print("\t" + num[i]);
		}
		/*
		 * para rotar el array necesito una variable del mismo tipo para que no se salga del largo del array al rotar
		 * en ella almaceno el último elemento del array
		 */
		int aux = num[9];
		for (int i = 9; i > 0; i--) {

			if (i == iinicial) {
				num[ifinal] = num[i];
				

			}
			if (i == ifinal) {
				continue;
			}
			num[i] = num[i - 1];

		}
		num[0] = aux;
		System.out.println("\nArray final");// muestro el array final
		System.out.print("Índice:");
		for (int i = 0; i < num.length; i++) {
			System.out.print("\t" + i);
		}
		System.out.print("\nValor:");
		for (int i = 0; i < num.length; i++) {
			System.out.print("\t" + num[i]);
		}
	}

}
