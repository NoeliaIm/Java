import java.util.Scanner;

public class PositivoONegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int positivos = 0;
		int negativos = 0;
		int total = 1;
		int num = 0;
		while (total <= 10) {
			System.out.println("Escribe un número");
			num = entrada.nextInt();
			if (num >= 0) {
				positivos++;
			} else {
				negativos++;
			}
			total++;
		}
		entrada.close();
		System.out.println("Has introducido " + positivos + " números positivos y " + negativos + " números negativos");
	}

}
