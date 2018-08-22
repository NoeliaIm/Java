package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Obtener la serie: 1,-1,2,-2,3,-3,… para n números
 */
public class SeriePositivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la cantidad de números que quieres ver en la serie");
		int veces = entrada.nextInt();
		entrada.close();
		for (int i = 1; i <= veces; i++) {
			System.out.print(i + " ");
			System.out.print(CambiarSigno(i) + " ");
		}
	}

	public static int CambiarSigno(int num) {
		return -num;
	}
}
