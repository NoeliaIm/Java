import java.util.Scanner;

public class CuadradoCubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un número");
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		entrada.close();
		for (int i = 0; i <= 5; i++) {
			System.out.println(num + i + "\t" + (num + i) * (num + i) + "\t" + (num + i) * (num + i) * (num + i));
		}
	}

}
