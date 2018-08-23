import java.util.Scanner;

/**
 * @author Noelia
 *Hacer un programa en Java para que el ordenador genere un número aleatorio entre 1 y 10. Nosotros
intentaremos acertarlo, contabilizando el número de intentos. Realizar los siguientes métodos:
Un método para generar el número aleatorio.
Otro método que compruebe si hemos acertado.
Recuerda la clase Random:
Random variable=new Random() variable.nextInt(10)+1 (genera un nº aleatorio entre 1 y 10)
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num2 = aleatorio();
		int intento = 0;
		boolean acertado;
		do {
			System.out.println("Intenta acertar el número");
			int num = entrada.nextInt();

			acertado=aciertaNum(num, num2);
			intento++;
		} while (acertado==false);
		System.out.println("Has acertado el número y has usado " + intento + " intentos.");
		entrada.close();
	}

	public static int aleatorio() {
		return (int) (Math.random() * 10 + 1);
	}

	public static boolean aciertaNum(int num, int num2) {
		if (num == num2) {
			return true;
		} else {
			return false;
		}

	}
}
