package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Una fuente de datos registra varias edades, la edad 0 indica el final del ingreso de datos,
 *         realice un programa para determinar el promedio de las edades ingresadas y además el porcentaje
 *         de personas mayores a los 50 años.
 */
public class PromedioEdades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num,suma,cont, mayor50;
		cont=0;
		suma=0;
		mayor50=0;
		do {
			System.out.println("Escribe la edad, 0 para terminar");
			num = entrada.nextInt();
			cont++;
			suma+=num;
			if (num>50) {
				mayor50++;
			}
			
		} while (num != 0);
		entrada.close();
		double promedio=(double)suma/(cont-1);
		System.out.println("La media de edad es "+promedio);
		double porCientoMayor50=(double)(mayor50*100)/(cont-1);
		System.out.println("El porcentaje de personas mayores de 50 es "+porCientoMayor50);
	}

}
