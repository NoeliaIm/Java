import java.util.Scanner;

public class UltimaCifra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num = entrada.nextInt();
		entrada.close();
		int resto = num % 10;
		System.out.println("El último número de la cifra que has introducido es " + resto);
	}

}
