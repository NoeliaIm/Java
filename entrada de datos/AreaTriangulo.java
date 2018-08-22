import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la longitud de cada lado del triángulo");
		int lado1 = entrada.nextInt();
		int lado2 = entrada.nextInt();
		int lado3 = entrada.nextInt();
		entrada.close();
		int area = (lado1 + lado2 + lado3) / 2;
		System.out.println("El área del triángulo es " + area);
	}

}
