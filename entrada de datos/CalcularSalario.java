import java.util.Scanner;

public class CalcularSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe las horas que has trabajado");
		int horas = entrada.nextInt();
		entrada.close();
		int salarioHora = 12;
		int salarioTotal = horas * salarioHora;
		System.out.println("Has ganado " + salarioTotal + "€");
	}

}
