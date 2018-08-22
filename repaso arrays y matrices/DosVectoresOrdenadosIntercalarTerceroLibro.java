package repaso2eval;

import java.util.Scanner;

public class DosVectoresOrdenadosIntercalarTerceroLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[200];
		int k, aux, cc = 0, cia = 0, cib = 0, pg = 0;
		System.out.println("Introduzca la longitud del primer y segundo vector: ");
		int n = in.nextInt();
		int m = in.nextInt();
		System.out.println("Introduzca los datos del primer vector(1-100): ");
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();//relleno por teclado el primer vector
		}
		System.out.println("Introduzca los datos del segundo vector(1-100): ");
		for (int f = 0; f < m; f++) {
			b[f] = in.nextInt();//relleno por teclado el segundo vector
		}
		in.close();
		k = n / 2;//ordenamos el primer vector con el método shell
		while (k > 0) {
			for (int x = 0; x < n; x++) {
				if ((k + x) <= (n - 1)) {
					if (a[x] > a[x + k]) {
						aux = a[x + k];
						a[x + k] = a[x];
						a[x] = aux;
						cc = cc + 1;
					}
				}
			}

			if (cc == 0)
				k = (int) (k / 2);
			cc = 0;
		}
		k = m / 2;
		while (k > 0) {//ordenamos el segundo vector con el método shell
			for (int x = 0; x < m; x++) {
				if ((k + x) <= (m - 1)) {
					if (b[x] > b[x + k]) {
						aux = b[x + k];
						b[x + k] = b[x];
						b[x] = aux;
						cc = cc + 1;
					}
				}
			}

			if (cc == 0)
				k = (int) (k / 2);
			cc = 0;
		}
		pg = 0;
		for (int nb = 0; nb < n + m; nb++) {//relleno el vector c con ceros, hasta el total de índices (longitud de a + longitud de b)
			c[nb] = 0;
		}
		for (int i = 0; i < n; i++) {//iteración las veces de la longitud del primer vector
			for (int nb = 0; nb < n + m; nb++) {//iteración las veces de la longitud de los dos vectores
				if (a[i] == c[nb]) {//si el valor del indice del primer vector es igual a el vector c del índice que corresponde en la segunda iteración
					cia++;
				}
			}
			if (cia == 0) {
				c[pg] = a[i];
				cia = 0;
				pg = pg + 1;
			} else {
				cia = 0;
			}
		}
		for (int i = 0; i < m; i++) {
			for (int nb = 0; nb < n + m; nb++) {
				if (b[i] == c[nb]) {
					cib++;
				}
			}
			if (cib == 0) {
				c[pg] = b[i];
				cib = 0;
				pg = pg + 1;
			} else {
				cib = 0;
			}
		}
		k = (m + n) / 2;
		while (k > 0) {//ordenamos el vector resultante de combinar los anteriores
			for (int x = 0; x < m + n; x++) {
				if ((k + x) <= (n + m - 2)) {
					if (c[x] > c[x + k]) {
						aux = c[x + k];
						c[x + k] = c[x];
						c[x] = aux;
						cc = cc + 1;
					}
				}
			}

			if (cc == 0)
				k = (int) (k / 2);
			cc = 0;
		}
		System.out.println("Los vectores son: ");
		for (int f = 0; f < n; f++) {
			System.out.print(a[f] + " ");
		}
		System.out.println("");
		for (int i = 0; i < m; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < pg; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
