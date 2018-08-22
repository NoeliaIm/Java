package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *Escribir un programa que pida el tipo de cambio para que dada una 
cantidad en Bolivianos y la convierta en Dolares y viceversa. 
 
 */
public class CambioMoneda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println("Escribe el tipo de cambio");
		double tipo=entrada.nextDouble();
		System.out.println("Escribe la cantidad que deseas cambiar");
		double cantidad=entrada.nextDouble();
		double cambio=cantidad*tipo;
		System.out.println(cambio);
		entrada.close();
	}

}
