package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Dada la siguiente sucesión de números: 2, 4, 8, 6, 36, 72, 70, 4900, 9800,... mediante el uso de funciones,
 *         mostrar en pantalla los términos de esta serie y calcular la suma de N (N se indica por teclado) elementos, es decir, SUMA=2+4+8+6+.....
 *         El programa calcula la suma de la serie anterior para n terminos. Para ello, genera cada uno de los valores de dicha serie hasta el limite ingresado por el usuario.
 *         La logica que sigue la serie es de elevar al cuadrado, multiplicar por dos y restar dos.
 */
public class HacerSerieYSuma_F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuántos números quieres generar en la serie?");
		int num = entrada.nextInt();
		entrada.close();
		int s = 0, a = 2;
		for (int i = 1; i < num; i++) {
			System.out.println(a);
			s = s + a;
			a = Op1(a);
			if (i == num)
				break;
			else {
				System.out.println(a);
				s = s + a;
				a = Op2(a);
				i++;
			}
			if (i == num)
				break;
			else {
				System.out.println(a);
				s = s + a;
				a = Op3(a);
				i++;
			}
		}
		System.out.println("Suma: "+s);
	}

	public static int Op1(int num) {
		return num * num;
	}

	public static int Op2(int num) {
		return num * 2;
	}

	public static int Op3(int num) {
		return num - 2;
	}
}
