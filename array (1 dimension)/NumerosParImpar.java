import java.util.Scanner;

public class NumerosParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe 8 números enteros separados por un intro");
		int[] num = new int[8];
		for (int i = 0; i < num.length; i++) {
			num[i] = entrada.nextInt();

		}
		entrada.close();
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.println(num[i] + "\tpar");
			} else {
				System.out.println(num[i] + "\timpar");
			}
		}

	}

}
