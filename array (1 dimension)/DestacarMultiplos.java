import java.util.Scanner;

public class DestacarMultiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[20];
		rellenarArray(num);
		leerArray(num);
		System.out.println();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Que quieres destacar?\n\r1-Multiplos de 5\n\r2-Multiplos de 7");
		int opcion = entrada.nextInt();
		entrada.close();
		switch (opcion) {
			case 1:
				multiplos5(num);
				break;
			case 2:
				multiplos7(num);
				break;
			default:
				break;
		}
	}

	public static void rellenarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.floor(Math.random() * 401));
		}
	}

	public static void leerArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void multiplos5(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 5 == 0) {
				System.out.print("[" + array[i] + "]");
				continue;
			}
			System.out.print(array[i] + " ");
		}
	}

	public static void multiplos7(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 7 == 0) {
				System.out.print("[" + array[i] + "]");
				continue;
			}
			System.out.print(array[i] + " ");
		}
	}
}
