package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Leer una cierta cantidad de estaturas (detenga el proceso mediante un centinela)
 *         y determine el promedio de estaturas por debajo de 1,60 mts. y
 *         el promedio de estaturas en general.
 */
public class Estaturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double estatura = 0;
		double suma = 0;
		int total = 0;
		int debajo160 = 0;
		double sumadebajo160 = 0;
		do {
			System.out.println("Introduce la estatura, 0 para terminar");
			estatura = entrada.nextDouble();
			suma += estatura;
			total++;
			if (estatura < 1.60) {
				debajo160++;
				sumadebajo160 += estatura;
			}
		} while (estatura != 0);
		entrada.close();
		System.out.println("El promedio de estaturas es " + suma / (total - 1));
		System.out.println("El promedio de estaturas de menos de 1,60 es " + sumadebajo160 / (debajo160-1));
	}

}
