package repaso2eval;

/**
 * @author tuppe
 *         elabore un programa que permita introducir 20 elementos de tipo entero en un arreglo, el programa mostrara impreso el arreglo en orden inverso
 */
public class ArrayOrdenInverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[20];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 21) + 1;
			System.out.print(num[i] + "\t");
		}
		System.out.println();
		for (int i = num.length-1; i >= 0; i--) {
			System.out.print(num[i] + "\t");
		}
	}

}
