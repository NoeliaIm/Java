import java.util.Scanner;

/**
 * @author Noelia
 *Hacer un programa que permita pintar un rectángulo de “f” filas y “c” columnas, utilizando un método llamado pintasterisco, que permitirá pintar los asteriscos que tiene una fila.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime el alto del rectángulo");
		int alto = entrada.nextInt();
		System.out.println("Dime el ancho del rectángulo");
		int ancho = entrada.nextInt();
		rectangulo(alto,ancho);
		entrada.close();
	}

	public static void rectangulo(int fila, int columna) {
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
