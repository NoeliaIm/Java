package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Dados tres números, determinar el mayor y menor.
 */
public class MayorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un número");
		int num1 = entrada.nextInt();
		System.out.println("Escribe otro número");
		int num2 = entrada.nextInt();
		while (num1 == num2) {
			System.out.println("Los números deben ser diferentes");
			num2 = entrada.nextInt();
		}
		System.out.println("Escribe otro número");
		int num3 = entrada.nextInt();
		while (num3 == num2 || num3 == num1) {
			System.out.println("El número debe ser diferente a los anteriores");
			num3 = entrada.nextInt();
		}
		entrada.close();
		int mayor = 0, menor = 0;
		if (num1 > num2 && num1 > num3) {
			mayor = num1;
			if (num2 > num3) {
				menor = num3;
			} else {
				menor = num2;
			}
		}
		if (num2 > num1 && num2 > num3) {
			mayor = num2;
			if (num1 > num3) {
				menor = num3;
			} else {
				menor = num1;
			}
		}
		if (num3 > num2 && num3 > num1) {
			mayor = num3;
			if (num2 > num1) {
				menor = num1;
			} else {
				menor = num2;
			}
		}
		System.out.println("El número mayor es " + mayor + " y el número menor es " + menor);
	}

}
