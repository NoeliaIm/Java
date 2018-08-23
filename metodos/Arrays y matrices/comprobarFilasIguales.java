
/**
 * @author Noelia
 *Hacer un programa que cargue por teclado un array de 3x3 y compruebe si existe alguna fila donde
todos sus componentes sean iguales.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = new int[3][3];
		rellenarArray(num);
		leerArray(num);
		comprobarIguales(num);
	}

	public static void rellenarArray(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 3);
			}
		}
	}

	public static void leerArray(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println(" ");
		}
	}
	public static void comprobarIguales(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			int primero=array[i][0];
			int iguales=0;
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j]==primero) {
					iguales++;
				}	
			}
			if (iguales==array[i].length) {
				System.out.println("En la fila "+i+" todos los números son iguales");
			}else {
				System.out.println("En la fila "+i+" no todos los números son iguales");
			}
		}
	}
}
