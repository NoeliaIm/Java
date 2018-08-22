package repaso2eval;

/**
 * @author tuppe
 *         elabore un programa que permita encontrar el primer y segundo mayor de un arreglo de 15 elementos
 */
public class PrimerYSegundoMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[15];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 20) + 1;
			System.out.print(num[i] + " ");
		}
		int primerMayor = 1;
		int segundoMayor = 0;
		for (int i = 0; i < num.length; i++) {
			if (primerMayor < num[i] && segundoMayor <= primerMayor) {
				primerMayor = num[i];
			}
			else if (num[i] >= segundoMayor && num[i] < primerMayor) {
				segundoMayor = num[i];
			}
		}
		System.out.println("\n\rPrimer Mayor: " + primerMayor);
		System.out.println("Segundo Mayor: " + segundoMayor);
	}

}
