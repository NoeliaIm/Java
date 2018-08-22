import java.util.Scanner;

public class DiezNumInverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num[] = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Escribe un número entero");
			num[i] = entrada.nextInt();
		}
		entrada.close();
		for (int i = num.length-1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
	}

}
