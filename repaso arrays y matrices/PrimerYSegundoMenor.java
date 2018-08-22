package repaso2eval;

/**
 * @author tuppe
 *         elabore un programa que permita encontrar el primer y segundo menor de un arreglo de 15 elementos
 */
public class PrimerYSegundoMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[15];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 20);
			System.out.print(num[i] + " ");
		}
		int primerMenor = 21;
		int segundoMenor = 22;
		for (int i = 0; i < num.length; i++) {
			if (num[i] < primerMenor && primerMenor < segundoMenor) {
				primerMenor = num[i];
			} else if (num[i] < segundoMenor && num[i]>primerMenor) {
				segundoMenor = num[i];
			}
		}
		System.out.println("\nPrimer menor: " + primerMenor);
		System.out.println("Segundo menor: " + segundoMenor);
	}

}
