package repaso2eval;

/**
 * @author tuppe
 *         elabore un programa que permita introducir un arreglo de 10 elementos,
 *         el programa mostrara un histograma de esos datos (el histograma se interpretara
 *         con la salida de n asteriscos donde n es el valor de cada elemento del arreglo)
 *         ej: el arreglo es 2,3,4 el histograma será 2->** 3->*** 4->****
 */
public class HistogramaDeAsteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 11) + 1;
			System.out.print(num[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
