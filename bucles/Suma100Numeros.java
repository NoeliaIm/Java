import java.util.Scanner;

public class Suma100Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dame un número positivo");
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		entrada.close();
		int suma = 0;
		if (num > 0) {
			for (int i = num; i < num + 100; i++) {
				suma += i;
			}
			System.out.println("La suma de los 100 números siguientes al número que me has dado es " + suma);
		} else {
			System.out.println("El número debe ser positivo");
		}

	}

}
