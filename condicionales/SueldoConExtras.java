import java.util.Scanner;

public class SueldoConExtras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe las horas que has trabajado");
		int horas = entrada.nextInt();
		entrada.close();
		int salarioHora = 12;
		int salarioExtra = 16;
		int horasExtras = 0;
		if (horas > 40) {
			horasExtras = horas - 40;
			horas = 40;
		}
		int salarioHorasNormal = horas * salarioHora;
		int salarioHorasExtras = horasExtras * salarioExtra;
		int salarioTotal = salarioHorasNormal + salarioHorasExtras;
		System.out.println("Has ganado " + salarioTotal + "€");
	}

}
