import java.util.Scanner;

public class AreaRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la base del rectángulo");
		int base = entrada.nextInt();
		System.out.println("Escribe la altura del rectángulo");
		int altura = entrada.nextInt();
		entrada.close();
		int area = base * altura;
		System.out.println("El área del rectángulo es " + area);
	}

}
