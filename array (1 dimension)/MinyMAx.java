import java.util.Scanner;

public class MinyMAx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[10];
		int max = 0;
		int min = 99999999;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe 10 números enteros. Después de cada uno pulsa intro.");
		for (int i = 0; i < num.length; i++) {//relleno el array con los números que se introducen por teclado
			num[i] = entrada.nextInt();
			if (num[i] > max) {//busco el mínimo y el máximo según los voy introduciendo
				max = num[i];
			}
			if (num[i] < min) {
				min = num[i];
			}
		}
		entrada.close();
		for (int j = 0; j < num.length; j++) {//recorro el array
			System.out.print(num[j]);//imprimo el número
			if (num[j] != max && num[j] != min) {//si no es el máximo ni el mínimo imprimo un salto de línea
				System.out.print("\n");
			} else if (num[j] == max) {// si es el máximo imprimo un tabulador y la palabra máximo y un salto de línea
				System.out.println("\tmáximo");
			}else if (num[j]==min) { //si es el mínimo imprimo un tabulador y la palabra mínimo y un salto de línea
				System.out.println("\tmínimo");
			}
		}
	}

}
