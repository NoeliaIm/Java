import java.util.Scanner;

public class ComprendidosEntre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Escribe un número");
		Scanner entrada = new Scanner(System.in);
		int num1 = entrada.nextInt();
		System.out.println("Escribe otro número");
		int num2 = entrada.nextInt();
		entrada.close();
		if (num1 != num2) {
			if (num1 > num2) {
				while (num2 < num1) {
					System.out.println(num2);
					num2 += 7;
				}
			} else {
				while (num1 < num2) {
					System.out.println(num1);
					num1 += 7;
				}
			}
		} else {
			System.out.println("Los números no pueden ser iguales");
		}
	}

}
