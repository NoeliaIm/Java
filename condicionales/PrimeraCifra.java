import java.util.Scanner;

public class PrimeraCifra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num = entrada.nextInt();
		entrada.close();
		if (num <= 99999) {
			int p = num / 10000;
			System.out.println("La primera cifra de tu número es " + p);
		} else {
			System.out.println("Sólo están permitidos los números de 5 cifras");
		}
	}

}
