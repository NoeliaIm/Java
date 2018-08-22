import java.util.Scanner;

public class EsMultiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe el número");
		int num = entrada.nextInt();
		System.out.println("Escribe el otro número");
		int num2 = entrada.nextInt();
		entrada.close();
		if (esMultiplo(num, num2)) {
			System.out.println(num + " es múltiplo de " + num2);
		} else if (esMultiplo(num2, num)) {
			System.out.println(num2 + " es múltiplo de " + num);
		} else {
			System.out.println("Estos números no son múltiplos");
		}
	}

	public static boolean esMultiplo(int a, int b) {
		if (a % b == 0) {
			return true;
		} else {
			return false;
		}
	}

}
