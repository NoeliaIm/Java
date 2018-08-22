package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Programa que lea un número n luego desplegar la tabla de multiplicar de ese número.
 *         Realizar el programa: a) utilizando for b) Utilizando while c) utilizando do while.
 */
public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime el número del que quieras ver la tabla");
		int num = entrada.nextInt();
		entrada.close();
		System.out.println("Utilizando el bucle for");
		for (int i = 0; i <= 10; i++) {
			System.out.println(num + "X" + i + "=" + i * num);
		}
		System.out.println("Utilizando el bucle while");
		int contW = 0;
		while (contW <= 10) {
			System.out.println(num + "X" + contW + "=" + contW * num);
			contW++;
		}
		System.out.println("Utilizando el bucle do while");
		int contDW = 0;
		do {
			System.out.println(num + "X" + contDW + "=" + contDW * num);
			contDW++;
		} while (contDW <= 10);
	}

}
