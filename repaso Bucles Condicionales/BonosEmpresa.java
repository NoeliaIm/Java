package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Obtener el total en bonos que paga la empresa a sus empleados,
 *         además desea conocer cuantos empleados tienen más de 20 años de antigüedad y
 *         el porcentaje que reciben estos, respecto al total en bonos que paga la empresa. (Utilizar centinela).
 *         El programa pide leer el minimo de años que un trabajador debe trabajar como minimo para recibir un bono
 *         y la cantidad de años que trabajaron cada trabajador (hasta 100 trabajadores) para después mediante operaciones
 *         aritméticas, mostrar en pantalla lo que se requiere en el problema.
 */
public class BonosEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuántos años hay que trabajar en esta empresa para obtener el bono?(Entre 0 y 25 años)");
		int anios = entrada.nextInt();
		entrada.close();
		int mas20 = 0;
		int conBono = 0;
		int[] trabajadores = new int[100];
		for (int i = 0; i < trabajadores.length; i++) {
			trabajadores[i] = (int) Math.floor(Math.random() * 26);
			if (trabajadores[i] > 20) {
				mas20++;
			}
			if (trabajadores[i] > anios) {
				conBono++;
			}
		}
		System.out.println("La empresa paga " + conBono + " bonos");
		System.out.println("Trabajadores con más de 20 años de antiguedad: " + mas20);
		System.out.println("Que son el " + (mas20 * 100) / conBono + "% del total que reciben");
	}
}
