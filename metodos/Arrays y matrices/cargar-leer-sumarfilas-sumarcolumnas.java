import java.util.Scanner;

/**
 * @author Noelia
 *Hacer un programa que permita cargar por teclado un array de números enteros de 3 filas y 4
columnas, y calcule:
• La suma de cada una de sus filas.
• La suma de cada una de sus columnas.
• Visualizar el array con la suma de las filas y la suma de las columnas.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = new int[4][3];
		cargarArray(num);
		leerArray(num);
		sumaFilas(num);
		sumaColumnas(num);
	}

	public static void cargarArray(int array[][]) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe números separados por un intro para rellenar el array");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = entrada.nextInt();
			}
		}
		System.out.println("Array completo");
		entrada.close();
	}
	public static void leerArray(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}
	public static void sumaFilas(int array[][]) {
		
		for (int i = 0; i < array.length; i++) {
			int suma=0;
			for (int j = 0; j < array[i].length; j++) {
			suma+=array[i][j];
			}
			System.out.println("La suma de la fila "+i+" es igual a "+suma);
		}
	}
public static void sumaColumnas(int array[][]) {
		
		for (int i = 0; i < array[i].length; i++) {
			int suma=0;
			for (int j = 0; j < array.length; j++) {
			suma+=array[j][i];
			}
			System.out.println("La suma de la columna "+i+" es igual a "+suma);
		}
	}

}
