import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Escribe el número del que quieras ver la tabla.");
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		for (int i = 0; i <= 10; i++) {
			System.out.println(num + "X" + i + "=" + num * i);
		}
		entrada.close();
	}

}
