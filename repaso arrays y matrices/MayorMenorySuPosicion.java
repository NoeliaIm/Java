package repaso2eval;

/**
 * @author tuppe
 *         elabore un programa que encuentre al número mayor y menor de un arreglo y luego muestre en qué posición se encontraban estos números originalmente.
 */
public class MayorMenorySuPosicion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[20];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 101) + 1;
			System.out.print(num[i] + " ");
		}
		System.out.println();
		int mayor = 0;
		int menor = 102;
		int posicionMayor = 0;
		int posicionMenor = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > mayor) {
				mayor = num[i];
				posicionMayor = i;
			}
			if (num[i] < menor) {
				menor = num[i];
				posicionMenor = i;
			}
		}
		System.out.println("Mayor: " + mayor + " Posición " + posicionMayor);
		System.out.println("Menor: " + menor + " Posición " + posicionMenor);
	}

}
