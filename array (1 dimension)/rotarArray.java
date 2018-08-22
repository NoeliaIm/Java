import java.util.Scanner;

public class rotarArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[15];
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe 15 números, sepáralos con un intro");
		for (int i = 0; i < num.length; i++) {
			num[i] = entrada.nextInt();
		}
		entrada.close();
		int aux = num[14];
		for (int j = 14; j > 0; j--) {
			num[j] = num[j - 1];

		}
		num[0] = aux;
		for (int k = 0; k < num.length; k++) {
			System.out.println(num[k]);
		}
	}

}
