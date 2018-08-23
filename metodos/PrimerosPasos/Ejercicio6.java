import java.util.Scanner;

/**
 * @author Noelia
 *Hacer un programa que lea dos números y muestre un menú con las siguientes opciones:
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Para cada una de las opciones del menú utilizar un método.
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce dos números separados por un intro");
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int opcion = 0;
		do {
			System.out.println("Elige una opcion:\n\r1.Sumar\n\r2.Restar\n\r3.Multiplicar\n\r4.Dividir\n\r5.Salir");
			opcion = entrada.nextInt();
			switch (opcion) {
				case 1:
					int suma = sumar(a, b);
					System.out.println("El resultado de la suma es " + suma);
					break;
				case 2:
					int resta = restar(a, b);
					System.out.println("El resultado de la resta es " + resta);
					break;
				case 3:
					int multiplicacion = multiplicar(a, b);
					System.out.println("El resultado de la multiplicación es " + multiplicacion);
					break;
				case 4:
					double division = dividir(a, b);
					System.out.println("El resultado de la división es " + division);
					break;
				case 5:
					break;
				default:
					System.out.println("Esa opción no está entre las posibles");
					break;
			}
		} while (opcion != 5);
		entrada.close();
	}

	public static int sumar(int a, int b) {
		return a + b;
	}

	public static int restar(int a, int b) {
		return a - b;
	}

	public static int multiplicar(int a, int b) {
		return a * b;
	}

	public static double dividir(int a, int b) {
		return  a / b;
	}
}
