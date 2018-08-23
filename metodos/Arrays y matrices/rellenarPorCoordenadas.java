import java.util.Scanner;

/**
 * @author Noelia
 *Hacer un programa que permita rellenar un array de 3 x 3, según el usuario va introduciendo la
coordenada. El valor que se almacenara en cada elemento será la secuencia de los 9 primeros
números naturales, de forma que en la primera casilla que el usuario elija deberá de almacenarse un
1 , en la segunda casilla un 2 , y así sucesivamente. Se deberá de comprobar que una casilla no esté
ocupada. Cuando toda la tabla esté rellenada visualizarla.

 */

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][] = new int[3][3];
		rellenarArray(num);
		leerArray(num);
	}

	public static void rellenarArray(int[][] array) {
		int nume = 1;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Escribe la fila que quieras rellenar:");
			int fila = entrada.nextInt();
			System.out.println("Escribe la columna que quieres rellenar:");
			int columna = entrada.nextInt();
			if (array[fila][columna] == 0) {
				array[fila][columna] = nume;
				nume++;
			} else {
				System.out.println("Esa casilla ya está ocupada");
			}
		} while (nume != 10);
		entrada.close();
	}

	public static void leerArray(int [][]array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}
