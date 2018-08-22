package repaso2eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Hacer un programa que lea 10 valores enteros en un array desde el teclado y calcule y muestre: la suma, el valor medio, el mayor y el menor
 */
public class MayorMenorPromedioSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[10];
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe 10 números separados por un intro");
		int suma = 0;
		int promedio = 0;
		int mayor = 0;
		int menor = 999999;
		for (int i = 0; i < num.length; i++) {
			num[i] = entrada.nextInt();
			suma += num[i];
			if (num[i] > mayor) {
				mayor = num[i];
			} else if (num[i] < menor) {
				menor = num[i];
			}
		}
		entrada.close();
		promedio = suma / 10;
		System.out.println("Suma: " + suma);
		System.out.println("Promedio: " + promedio);
		System.out.println("Mayor: " + mayor);
		System.out.println("Menor: " + menor);
	}

}
