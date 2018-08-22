import java.util.Scanner;

public class MoverAlfil2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] col = { "a", "b", "c", "d", "e", "f", "g", "h" };
		int[] fila = { 8, 7, 6, 5, 4, 3, 2, 1 };
		int[][] tablero = new int[8][8];
		System.out.println("Escribe la posición del alfil, por ejemplo d5");
		Scanner entrada = new Scanner(System.in);
		String pos = entrada.next();
		entrada.close();
		String nombreCol = pos.substring(0, 1);
		int nombrefil = Integer.parseInt(pos.substring(1));
		// System.out.println(nombreCol);
		// System.out.println(nombrefil);
		int posi = 0;
		int posj = 0;
		for (int i = 0; i < col.length; i++) {
			if (col[i].equals(nombreCol)) {
				posj = i;
			}
		}
		for (int i = 0; i < fila.length; i++) {
			if (fila[i] == nombrefil) {
				posi = i;
			}
		}
		// System.out.println(posi);
		// System.out.println(posj);

		System.out.println("El alfil puede  moverse a las siguientes posiciones:");
		arriIzda(posi, posj, tablero, col, fila);
		abajIzda(posi, posj, tablero, col, fila);
		arriDcha(posi, posj, tablero, col, fila);
		abajDcha(posi, posj, tablero, col, fila);

	}

	public static void arriIzda(int a, int b, int[][] array, String[] array2, int[] array3) {
		for (int i = a; i > 0; i--) {
			for (int j = b; j > 0; j--) {
				if ((a != 0 && b != 0) || (a == 0 && b == 0)) {
					a--;
					b--;
					System.out.print(array2[a] + array3[b] + " ");
				}

			}

		}
	}

	public static void abajIzda(int a, int b, int[][] array, String[] array2, int[] array3) {
		for (int i = a; i < array.length; i++) {
			for (int j = b; j < array[i].length; j++) {
				if ((a != 0 && b != 0) || (a == 0 && b == 0)) {
					a--;
					b++;
					System.out.print(array2[a] + array3[b] + " ");
				}
			}
		}
	}

	public static void arriDcha(int a, int b, int[][] array, String[] array2, int[] array3) {
		for (int i = a; i > 0; i++) {
			for (int j = b; j > 0; j++) {
				if ((a != 0 && b != 0) || (a == 0 && b == 0)) {
					a++;
					b--;
					System.out.print(array2[a] + array3[b] + " ");
				}

			}

		}
	}

	public static void abajDcha(int a, int b, int[][] array, String[] array2, int[] array3) {
		int ultimoA = array.length - a;
		int ultimoB = array.length - b;
		for (int i = a; i <= ultimoA+1; i++) {
			for (int j = b; j <= ultimoB+1; j++) {
				if ((a != 0 && b != 0) || (a == 0 && b == 0)) {
					a++;
					b++;
					System.out.print(array2[a] + array3[b] + " ");
				}
			}
		}
	}
}
