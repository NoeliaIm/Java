import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¿Cuántos números de la serie de Fibonacci quieres ver?");
		Scanner entrada = new Scanner(System.in);
		int repeticiones = entrada.nextInt();
		entrada.close();
		int primero = 0;
		int segundo = 1;
		int tercero = 0;
		System.out.println(primero);
		System.out.println(segundo);
		for (int i = 3; i <= repeticiones; i++) {
			tercero = primero + segundo;
			System.out.println(tercero);
			primero = segundo;
			segundo = tercero;
		}
	}

}
