
public class posMinMAxNOREPETIRDIGITOS {
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
		int aleatorio=(int) Math.floor(Math.random() * 1000);
		@SuppressWarnings("unused")
		boolean distinto;
		for (int k = 0; k < i; k++) {
			for (int h = 0; h < j; h++) {
				if (array[k][h]!=aleatorio) {
			distinto=true;
				}
			}
		}
		array[i][j]=aleatorio;
		distinto=false;
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
