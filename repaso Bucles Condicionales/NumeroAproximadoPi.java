package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Escribir un programa que permita obtener el valor aproximado de PI,
 *         mediante la serie: 4 - 4/3 + 4/5 – 4/7 + 4/9 – 4/11 + … para n términos.
 */
public class NumeroAproximadoPi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe el número de términos");
		int n = entrada.nextInt();
		entrada.close();
		int suma = 0;
		int signo = -1;
		int impar = 1;
		for (int i = 0; i < n; i++) {
			suma = suma -  signo * 4 /impar;
			System.out.print(suma - signo * 4 + "/" + impar+" ");
			signo = signo * -1;
			impar = impar + 2;
		}
		System.out.println();
		System.out.println(suma);
	}

}
