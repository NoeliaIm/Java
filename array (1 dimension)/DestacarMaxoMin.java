import java.util.Scanner;

public class DestacarMaxoMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[100];
		rellenarArray(num);
		leerArray(num);
		System.out.println("Quieres destacar el mínimo o el máximo? 1-mínimo, 2-máximo");
		Scanner entrada = new Scanner(System.in);
		int opcion = entrada.nextInt();
		entrada.close();
		switch (opcion) {
			case 1:
				min(num);
				break;
			case 2:
				max(num);
				break;
			default:
				break;
		}
	}

	public static void rellenarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.floor(Math.random() * 501));
		}
	}

	public static void leerArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}

	public static void min(int[] array) {
		int min = 500;
		for (int i = 0; i < array.length; i++) { // recorro el array para sacar el mínimo
			if (array[i] < min) {
				min = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {// recorro el array para escribirlo
			if (array[i] == min) {// si el entero de la posición i es igual que el mínimo la escribo entre asteriscos
				System.out.println("**" + array[i] + "**");
				continue;// continue para que salte el resto de las instrucciones en esta iteración y comience en la siguiente
			}
			System.out.println(array[i] + " ");
		}
	}

	public static void max(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {// recorro el array para sacar el máximo
			if (array[i] > max) {
				max = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {// recorro el array para escribirlo
			if (array[i] == max) {// si el entero de la posición i es igual al máximo la escribo entre asteriscos
				System.out.println("**" + array[i] + "**");
				continue;// continue para que salte el resto de las instrucciones en esta iteración y comience en la siguiente
			}
			System.out.println(array[i] + " ");
		}
	}

}
