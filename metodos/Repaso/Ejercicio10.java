import java.util.Scanner;

/**
 * @author Noelia
 *Hacer un programa en Java que permita cargar un array de 15 elementos con números aleatorios
entre 1 y 100 y permita borrar de la lista un elemento que ocupa determinada posición, que se
introducirá por teclado, desplazando todos los demás. Realizar el programa mediante métodos que
resuelvan cada uno de los procesos.
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] miArray = new int[15];
		rellenarArray(miArray);
		verArray(miArray);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime una posición de ese array que quieras borrar");
		int pos = entrada.nextInt();
		entrada.close();
		borrarPosicion(miArray, pos);
		verArray(miArray);
	}

	public static void rellenarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100 + 1);
		}
	}


	public static void borrarPosicion(int[] array, int pos) {
		for (int i = pos; i < array.length-1; i++) {
			array[i]=array[i+1];
			
		}
		
	}

	public static void verArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n\r");
	}

}
