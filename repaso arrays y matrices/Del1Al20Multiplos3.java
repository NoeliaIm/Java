package repaso2eval;

/**
 * @author tuppe
 *         Escribir un programa que llene un vector con una lista de números del 1 al 20,
 *         luego despliegue este vector indicando a la derecha de cada uno si es divisible por 3 o no
 */
public class Del1Al20Multiplos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			// num[i] = (int) (Math.random() * 21) + 1;
			num[i] = (int) Math.floor((Math.random() * 20) + 1);
			System.out.print(num[i] + "\t");
			if (num[i] % 3 == 0) {
				System.out.println("Múltiplo de 3");
			} else {
				System.out.println("No múltiplo de 3");
			}
		}
	}

}
