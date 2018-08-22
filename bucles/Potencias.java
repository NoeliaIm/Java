import java.util.Scanner;

public class Potencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la base");
		int base = entrada.nextInt();
		System.out.println("Escribe el exponente");
		int exponente = entrada.nextInt();
		entrada.close();
		int potencia = base;
		for (int i = 1; i < exponente; i++) {
			potencia *= base;
			System.out.println(base + " elevado a " + (i+1) + " es igual a " + potencia);

		}
	}

}
