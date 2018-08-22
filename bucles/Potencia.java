import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Escribe la base");
		Scanner entrada = new Scanner(System.in);
		int base = entrada.nextInt();
		System.out.println("Escribe el exponente");
		int exponente = entrada.nextInt();
		entrada.close();
		int potencia = base;
		for (int i = 1; i < exponente; i++) {
			potencia *= base;

		}

		System.out.println(potencia);
	}

}
