
/**
 * @author Noelia
 *Hacer un programa que cargue un array de 3x5 con números aleatorios enteros menores que 10.
Crear y visualizar su transpuesta. (Cambiar filas por columnas)
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num [][]=new int [3][5];
		rellenarArray(num);
		leerArray(num);
		System.out.println("----------------");
		cambiarArray(num);

	}
	public static void rellenarArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 10);
			}
		}
	}

	public static void leerArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void cambiarArray(int[][] array) {
		int[][]array2=new int[5][3];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				
				array2[j][i]=array[i][j];	
			}
		}
		leerArray(array2);
	}

}
