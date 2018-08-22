
public class SumaFilasColumnas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = new int[4][5];
		rellenarArray(num);
		leerArray(num);
		sumaColumna(num);
		int sumaFilas=0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				sumaFilas+=sumaFila(num[i]);
			}
		}
		int sumaFilaCol=sumaTotal(num);
		System.out.print(sumaFilaCol+sumaFilas);
	}

	public static void rellenarArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) Math.floor((Math.random() * 900) + 100);
			}
		}
	}

	public static void leerArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}

			System.out.println(sumaFila(array[i]));

		}

	}

	public static int sumaFila(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma;
	}
	
	public static void sumaColumna(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			int suma = 0;
			for (int j = 0; j < array.length; j++) {
				suma += array[i][j];
			}
			System.out.print(suma + " ");

		}
	}

	public static int sumaTotal(int[][] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				suma += array[i][j];
			}

		}
		return suma;
	}
}
