package repaso2eval;

/**
 * @author tuppe
 *         Escribir un programa que llene un vector con la siguiente secuencia numérica: 1, 5, 3, 7, 5, 9, 7, ..., 23.
 *         La secuencia debe detenerse al llegar al 23. Luego desplegar el vector en pantalla.
 *         La lógica de esta serie es que empezando en el valor 1, si el número de índice es impar suma 4 y si es par resta 2.
 */
public class SerieIndiceParOImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[30];
		int numAnt = 1;
		num[0] = 1;
		for (int i = 1; i <= num.length - 1; i++) {

			if (i % 2 != 0) {
				numAnt = numAnt + 4;
				num[i] = numAnt;
			}
			if (i % 2 == 0) {
				numAnt = numAnt - 2;
				num[i] = numAnt;
			}

		}
		for (int j = 0; j < num.length; j++) {
			if (num[j] <= 23) {
				System.out.print(num[j] + " ");
			}
		}

	}
}

/*
 * Programa realizado por Sergio W. Ossio Marin class A_32
 * public static void main (String args []) {
 * int [] vector = new int [100];
 * int s = 1;
 * vector [0] = 1;
 * for (int i = 1 ; i <= 20 ; i++) {
 * if (i % 2 != 0) {
 * s = s + 4;
 * vector [i] = s;
 * }
 * if (i % 2 == 0) {
 * s = s - 2;
 * vector [i] = s;
 * }
 * }
 * for (int j = 0 ; j < 20 ; j++) {
 * System.out.print (" " + vector [j]);
 * }
 * }
 */