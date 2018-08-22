package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Determinar si un año es bisiesto (verificar las condiciones)
 *         Verifica si su división entre 4 da por resultado un número entero 
 *         Verifica si el año se puede dividir entre 400. Si un año es divisible entre 100,
 *         pero no entre 400, por ejemplo, 1900, entonces NO es un año bisiesto.
 *         Si un año es divisible tanto entre 100 como entre 400, entonces SÍ es un año bisiesto.
 *         Por ejemplo, el año 2000 fue en efecto bisiesto.
 *         Dicho de otro modo, son bisiestos todos los años divisibles por 4, 
 *         excluyendo los que sean divisibles por 100, pero no los que sean divisibles por 400.
 */
public class AñoBisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un año");
		int anio = entrada.nextInt();
		entrada.close();
		if (anio % 400 == 0 ) {
			System.out.println("El año es bisiesto");
		} else if(anio%400==0 && anio%100!=0){
			System.out.println("El año es bisiesto");
		}else {
			System.out.println("El año no es bisiesto");
		}
	}

}
