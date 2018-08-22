package repaso2eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         elabore un programa que permita introducir un arreglo de 25 elementos de tipo entero.
 *         luego pedir al usuario que introduzca un número. el programa mostrara el numero de veces
 *         que se repite dicho valor en el arreglo
 */
public class BuscaNumEnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[25];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 11);
			System.out.print(num[i] + " ");
		}
		Scanner entrada = new Scanner(System.in);
		System.out.println("\n¿Qué número quieres saber si se repite?");
		int buscado = entrada.nextInt();
		entrada.close();
		int veces = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == buscado) {
				veces++;
			}
		}
		System.out.println("El número " + buscado + " aparece " + veces + " veces.");
	}

}
