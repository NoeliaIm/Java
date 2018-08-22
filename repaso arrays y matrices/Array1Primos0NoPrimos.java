package repaso2eval;

/**
 * @author tuppe
 *         elabore un programa que permita introducir un arreglo de 8 elementos de tipo entero.
 *         el programa mostrara un arreglo en donde muestre un 1 para los primos y un 0 para los no primos
 */
public class Array1Primos0NoPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[8];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 21) + 1;
			System.out.print(num[i] + "\t");
		}
		System.out.println("\nEste array muestra un 1 para los primos y un 0 para los no primos");
		int[] primosONo = new int[8];

		for (int i = 0; i < num.length; i++) {
			int divisores = 0;
			for (int j = 1; j < num[i]; j++) {
				if (num[i] % j == 0) {
					divisores++;
				}
				if (divisores > 2) {
					primosONo[i] = 0;
				} else {
					primosONo[i] = 1;
				}
				
			}
			System.out.print(primosONo[i] + "\t");
		}
	}

}
