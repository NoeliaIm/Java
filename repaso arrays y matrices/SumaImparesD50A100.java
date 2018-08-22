package repaso2eval;

/**
 * @author tuppe
 *         escriba un programa que permita encontrar la sumatoria de los números impares comprendidos desde 50 a 1000 guardados en un arreglo
 */
public class SumaImparesD50A100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int longitud = (int) (Math.random() * 100) + 1;
		int[] num = new int[longitud];
		int sumaImpar = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 951) + 1;
			if (num[i] % 2 != 0) {
				sumaImpar += num[i];
			}
			System.out.print(num[i] + "\t");
			if (i % 10 == 0 && i != 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("La suma de los impares es "+sumaImpar);
	}

}
