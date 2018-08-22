import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un número");
		long num = entrada.nextLong();
		entrada.close();
		long resto = 0;
		long delReves = 0;
		long aInvertir = num;
		while (aInvertir != 0) {
			resto = aInvertir % 10;
			aInvertir = aInvertir / 10;
			delReves = delReves * 10 + resto;

		}

		System.out.println(delReves);
		long sumaPares = 0;
		while (delReves != 0) {
			int resto2 = (int) delReves % 10;
			if (resto2 % 2 == 0) {
				System.out.print(resto2 + " ");
				sumaPares += resto2;
			}
			delReves = delReves / 10;

		}
		System.out.println("La suma de los pares es " + sumaPares);
	}
}
