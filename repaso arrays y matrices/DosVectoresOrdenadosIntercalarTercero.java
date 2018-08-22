package repaso2eval;

/**
 * @author tuppe
 *         Diseñar e implemente un programa para intercalar los elementos de dos vectores A y B, cuyos elementos están ordenador de menor a mayor
 *         y que dé como resultado otro vector C ordenada ascendentemente sin elementos repetidos. Desplegar en pantalla los tres vectores.
 */
public class DosVectoresOrdenadosIntercalarTercero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[20];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) Math.floor((Math.random() * 20) + 1);
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = (int) Math.floor((Math.random() * 20) + 1);
		}
		ordenarArray(a);
		ordenarArray(b);
		System.out.println("Array a");
		leerArray(a);
		System.out.println("Array b");
		leerArray(b);
		intercalarArray(a, b, c);
		System.out.println("Array c");
		leerArray(c);
		quitarIguales(c);
		leerArray(c);
	}

	public static void ordenarArray(int array[]) { // metodo de la baraja
		int aux;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
	}

	public static void leerArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void intercalarArray(int arrayA[], int arrayB[], int arrayC[]) {

		for (int j = 0; j < arrayA.length; j++) {
			
			arrayC[j] = arrayA[j];
		}

		for (int i = 0; i < arrayB.length; i++) {
			arrayC[i + 10] = arrayB[i];
		}

	}

	public static void quitarIguales(int array[]) {

		for (int i = 0; i < array.length; i++) {

		}

	}

}
