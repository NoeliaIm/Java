import java.util.Scanner;

/**
 * @author Noelia
 *Hacer un programa en Java que introduzca números enteros positivos en un vector de 10 elementos.
Luego pida por teclado una posición y nos visualice el contenido de esa posición. Realizar el
programa mediante métodos que resuelvan cada uno de los procesos.
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		rellenarArray(array);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime la posición del array que deseas saber");
		int pos = entrada.nextInt();
		System.out.println("En la posición " + pos + " se encuentra el número " + contenidoPos(array, pos));
		entrada.close();
	}

	public static void rellenarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10 + 1);

		}
	}

	public static int contenidoPos(int[] array, int num) {
		return array[num];
	}
}
