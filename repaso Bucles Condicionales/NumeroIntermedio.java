package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Leer tres números diferentes (elaborar la validación de datos) y determinar
 *         el valor intermedio(el numero que no es mayor ni menor).
 */
public class NumeroIntermedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un número");
		int num1 = entrada.nextInt();
		System.out.println("Escribe otro número");
		int num2 = entrada.nextInt();
		while (num2 == num1) {
			System.out.println("Los números deben ser diferentes. Vuelve a intentarlo");
			num2 = entrada.nextInt();
		}
		System.out.println("Escribe un número diferente a los dos anteriores");
		int num3 = entrada.nextInt();
		while (num3 == num2 || num3 == num1) {
			System.out.println("Recuerda, el número debe ser diferente a los dos anteriores, introdúcelo de nuevo ");
			num3 = entrada.nextInt();
		}
		entrada.close();
		//int mayor, menor;
		int intermedio;
		if (num1 > num2 && num1 > num3) {
			//mayor = num1;
			if (num2 > num3) {
				//menor = num3;
				intermedio = num2;
			} else {
				intermedio = num3;
			}
			System.out.println("El número intermedio es " + intermedio);
		}

		if (num2 > num3 && num2 > num1) {
			//mayor = num2;
			if (num3 > num1) {
				//menor = num1;
				intermedio = num3;
			} else {
				intermedio = num1;
			}

			System.out.println("El número intermedio es " + intermedio);
		}

		if (num3 > num2 && num3 > num1) {
			//mayor = num3;
			if (num2 > num1) {
				//menor = num1;
				intermedio = num2;
			} else {
				intermedio = num1;
			}
			System.out.println("El número intermedio es " + intermedio);
		}
	}

}
