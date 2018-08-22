import java.util.Scanner;

public class NotasProgramacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nota del primer control: ");
		double nota1 = entrada.nextDouble();
		System.out.println("Nota del segundo control: ");
		double nota2 = entrada.nextDouble();
		double media = (nota1 + nota2) / 2;
		if (media < 5) {
			System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
			String recu=entrada.next();
			entrada.close();
			if (recu.equals("apto")) {
				System.out.println("Tu nota de programación es 5");
			} else {
				System.out.println("Tu nota de programación es " + media);
			}
		} else {
			System.out.println("Tu nota de programación es " + media);
		}
	}

}
