import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame la nota del primer trimestre");
		double nota1 = entrada.nextDouble();
		System.out.println("Dame la nota del segundo trimestre");
		double nota2 = entrada.nextDouble();
		System.out.println("Dame la nota del tercer trimestre");
		double nota3 = entrada.nextDouble();
		entrada.close();
		double media = (nota1 + nota2 + nota3) / 3;
		System.out.println("La nota media de la evaluación es " + media);
	}

}
