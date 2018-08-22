import java.util.Scanner;

public class AleatoriosCambiados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[100];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 20);
			System.out.print(num[i] + " ");
		}
		System.out.println("\n¿Qué valores quieres cambiar?Elige uno a cambiar por el otro, separados por intro");
		Scanner entrada = new Scanner(System.in);
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		entrada.close();
		for (int j = 0; j < num.length; j++) {
			if (num[j] == num1) {
				num[j] = num2;
				System.out.print("\"" + num[j] + "\""
						+ " ");
				continue;
			}
			System.out.print(num[j] + " ");
		}
	}

}
