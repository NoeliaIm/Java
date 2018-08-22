package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Intercambiar el contenido de dos variables
 */
public class IntercambiarContenido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un número entero");
		int num1 = entrada.nextInt();
		System.out.println("Escribe un número entero");
		int num2 = entrada.nextInt();
		entrada.close();
		int aux=num1;
		num1=num2;
		num2=aux;
		System.out.println("Variables intercambiadas: "+num1+" "+num2);
	}

}
