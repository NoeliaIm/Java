import java.util.Scanner;

/**
 * @author Noelia
 *Hacer un programa en Java que permita cargar dos arrays de 5 elementos cada uno y visualizarlos.
Para ello crear un método que permita “rellenarlos” y otro que nos permita mostrar su contenido.
 */
public class Ejericicio3 {
public static void main(String[] args) {
	int array1 []=new int[5];
	int array2 []=new int[5];
	rellenarArray(array1);
	rellenarArray(array2);
	verArray(array1);
	verArray(array2);
	
}
public static void rellenarArray(int[]array) {
	
	@SuppressWarnings("resource")
	Scanner entrada=new Scanner(System.in);
	for (int i = 0; i < array.length; i++) {
		System.out.println("Escribe un número");
		array[i]=entrada.nextInt();
	}
	
}
public static void verArray(int[]array) {
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]+",");
	}
	System.out.println("");
}

}
