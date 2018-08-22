import java.util.Scanner;

public class Ecuacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Vamos a resolver esta ecuación");
		System.out.println("aX+b=c");
		System.out.println("Dime el valor de a");
		double a = entrada.nextDouble();
		System.out.println("Dime el valor de b");
		double b = entrada.nextDouble();
		System.out.println("Dime el valor de c");
		double c = entrada.nextDouble();
		entrada.close();
		double x = (c - b) / a;
		System.out.println("X = " + x);
	}

}
