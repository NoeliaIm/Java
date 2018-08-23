import java.util.Scanner;

/**
 * @author Noelia
 *Realizar un programa en Java que:
• Nos permita crear un array con el nombre y los apellidos de 4 personas
• Visualice el contenido del array
• Calcule la longitud de cada uno de los elementos del array (nombre y apellidos) y guarde este
dato en otro array.
• Muestre el nombre de mayor longitud.
Construir un método para cada una de las operaciones anteriores.
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres = new String[4];
		rellenarArray(nombres);
		int[] largo = new int[4];
		leerArray(nombres);
		largoNombre(nombres, largo);
		masLargo(largo, nombres);
	}

	public static void rellenarArray(String[] array) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Escribe el nombre y apellidos");
			//@SuppressWarnings("unused")
			//String saltoDeLinea = entrada.nextLine();
			array[i] = entrada.nextLine();
		}

	}

	public static void leerArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	public static void largoNombre(String[]array, int[]arrayLargo) {
		for (int i = 0; i < array.length; i++) {
				arrayLargo[i]=array[i].length();
				System.out.println(array[i]+"="+arrayLargo[i]);
			}
			
			System.out.println("\n\r");
		
	}
	public static void masLargo(int[]arrayLargo, String[]array) {
		int mayor=0;
		int pos=0;
		for (int i = 0; i < arrayLargo.length; i++) {
			if (arrayLargo[i]>mayor) {
				mayor=arrayLargo[i];
				pos=i;
			}
		}
		System.out.println("El nombre más largo es "+ array[pos]);
	}
}
