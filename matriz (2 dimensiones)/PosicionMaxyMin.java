
public class PosicionMaxyMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = new int[6][10];
		rellenarArray(num);
		leerArray(num);
		posMin(num);
		posMax(num);
	}

	public static void rellenarArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) Math.floor(Math.random() * 1000);
			}
		}
	}

	public static void leerArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void posMin(int[][] array) {
		int min = 1000;
		int posi = 0;
		int posj = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < min) {
					min = array[i][j];
					posi = i;
					posj = j;
				}
			}
		}
		System.out.println("El número mínimo está en la columna " + (posj + 1) + " fila " + (posi + 1));
	}

	public static void posMax(int[][] array) {
		int max = 0;
		int posi = 0;
		int posj = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
					posi = i;
					posj = j;
				}
			}
		}
		System.out.println("El máximo está en la fila " + (posi + 1) + " columna " + (posj + 1));
	}
}
