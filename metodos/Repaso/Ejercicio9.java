
/**
 * @author Noelia
 *Hacer un programa en Java que simule el lanzamiento de una moneda 100 veces y contabilice el
número de veces que salió cada cara utilizando un array. Realizar el programa mediante
métodos.
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tirada = new int[100];
		System.out.println("Vamos a tirar un moneda la aire 100 veces");
		tiraMoneda(tirada);
		int cara = cuentaCara(tirada);
		int cruz = cuentaCruz(tirada);
		System.out.println("Cara= " + cara + "\tCruz= " + cruz);
	}

	public static void tiraMoneda(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int num = (int) (Math.random() * 2);
			array[i] = num;
		}
	}

	public static int cuentaCara(int[] array) {
		int cara = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				cara++;
			}
		}
		return cara;
	}

	public static int cuentaCruz(int[] array) {
		int cruz = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				cruz++;
			}
		}
		return cruz;
	}
}
