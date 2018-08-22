import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num = entrada.nextInt();
		entrada.close();
		int aInvertir=num;
		int numInverso = 0;
		while (aInvertir != 0) {
			int resto = aInvertir % 10;
			aInvertir = aInvertir / 10;
			numInverso = numInverso * 10 + resto;
		}
		if (num==numInverso) {
			System.out.println("El número es capicúa");
		} else {
			System.out.println("El número no es capicúa");
		}
	}

}
