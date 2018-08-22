import java.util.Scanner;

public class NotaBoletin {

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
		if (media>=9 && media<=10) {
			System.out.println("Sobresaliente");
		}else if (media>=7 && media<9) {
			System.out.println("Notable");
		}else if (media>=6 && media<7) {
			System.out.println("Bien");
		}else if (media>=5 && media<6) {
			System.out.println("Suficiente");
		}else {
			System.out.println("Suspenso");
		}
	}

}
