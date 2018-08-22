package repaso2eval;

/**
 * @author tuppe
 *         hacer un programa que lea diez valores enteros en un array y los muestre en pantalla. después que los ordene de menor a mayor y los vuelva a mostrar.
 *         y finalmente que los ordene de mayor a menor y los muestre por tercera vez. para ordenar la lista usar una función que implemente el método de la burbuja
 */
public class OrdenarAmbosSentidosBurbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[10];
		System.out.println("Primer Array");

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 101) + 1;
			System.out.print(num[i] + " ");
		}
		System.out.println("\n\rOrdenado");
		int aux;
		for (int i = 0; i < num.length - 1; i++)
			for (int j = 0; j < num.length - 1 - i; j++)
				if (num[j] > num[j + 1]) {
					aux = num[j];
					num[j] = num[j + 1];
					num[j + 1] = aux;

				}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println("\n\rOrdenado en orden inverso");

		int p = 1, sw = 1, aux2 = 0;
		while ((sw == 1) && (p < num.length)) {
			sw = 0;
			for (int i = 0; i < num.length - p; i++)
				if (num[i] < num[i + 1]) {
					aux2 = num[i];
					num[i] = num[i + 1];
					num[i + 1] = aux2;
					sw = 1;
				}
			p = p + 1;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

	/*
	 * public static void ordenarArray(int array[])
	 * {
	 * int aux;
	 * for (int i= 0; i < array.length-1; i++)
	 * for (int j= 0; j< array.length-1-i; j++)
	 * if (array[j] > array[j+1])
	 * {
	 * aux= array[j];
	 * array[j]= array[j+1];
	 * array[j+1]= aux;
	 * }
	 * }
	 */
	/*
	 * public static void ordenarArray(int array[]) {
	 * int p = 1, sw = 1, aux;
	 * while ((sw == 1) && (p < array.length)) {
	 * sw = 0;
	 * for (int i = 0; i < array.length - p; i++)
	 * if (array[i] > array[i + 1]) {
	 * aux = array[i];
	 * array[i] = array[i + 1];
	 * array[i + 1] = aux;
	 * sw = 1;
	 * }
	 * p = p + 1;
	 * }
	 * }
	 */
}
