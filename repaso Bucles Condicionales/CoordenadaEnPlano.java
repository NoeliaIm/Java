package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Leer un par ordenado y determinar en qué cuadrante se encuentra.
 *         "Escribir un programa que pida ingresar la coordenada de un punto en el plano,
 *         es decir dos valores enteros x e y (distintos a cero).
 *         Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto."
 * 
 */
public class CoordenadaEnPlano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime el valor de X");
		int x = entrada.nextInt();
		System.out.println("Dime el valor de Y");
		int y = entrada.nextInt();
		entrada.close();
		if (x == 0 && y == 0) {
			System.out.println("Estás en el punto 0");
		} else if (x > 0) {
			if (y > 0) {
				System.out.println("El punto se encuentra en el cuadrante I");
			} else {
				System.out.println("El punto se encuentra en el cuadrante IV");
			}
		} else {
			if (y > 0) {
				System.out.println("Estás en el cuadrante II");
			} else {
				System.out.println("Estás en el cuadrante III");
			}
		}
	}

}
