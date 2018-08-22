
public class SeguidosEnDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[4][4];
		int num = 1;
		//int fila = 0;
		//int columna = 0;

		/*
		 * System.out.println("Esto nos rellena la triangular superior de la diagonal principal");
		 * 
		 * for (int diag = 1; diag < matriz.length; diag++) {
		 * for (int x = 0, y = diag; y < matriz.length; x++, y++) {
		 * matriz[x][y]=num;
		 * num++;
		 * }
		 * 
		 * }
		 * leer(matriz);
		 */

		/*
		 * System.out.println("Esto nos rellena la triangular superior de la diagonal principal");
		 * int diag = 0;
		 * for (int x = diag, y = 0; x < matriz.length; x++, y++) {
		 * matriz[x][y] = num;
		 * num++;
		 * }
		 * leer(matriz);
		 */

		// Esto nos rellena la triangular superior de la diagonal secundaria

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz.length - i; j++) {
				matriz[i][j] = num;
				num++;
			}
		}
		leer(matriz);

		/*
		 * for (int i = 0; i < matriz.length; i++) {
		 * int num=1;
		 * for (int j = 0; j < matriz[i].length; j++) {
		 * matriz[i][j]=num;
		 * num=num+j+1;
		 * }
		 * 
		 * }
		 */
		/*
		 * for (int i = 0; i < matriz.length; i++) {
		 * if (fila == 0 && columna == 0) {
		 * num = num + 1;
		 * matriz[fila][columna] = num;
		 * columna++;
		 * leer(matriz);
		 * } else if (fila == (i - 1)) {
		 * int cont = i;
		 * for (fila = 0; fila <= i; fila++) {
		 * num = num + 1;
		 * matriz[fila][cont] = num;
		 * cont--;
		 * leer(matriz);
		 * }
		 * }
		 * }
		 */

	}

	public static void leer(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
