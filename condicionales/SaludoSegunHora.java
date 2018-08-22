import java.util.Scanner;

public class SaludoSegunHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime la hora que es en formato 24 horas");
		int hora = entrada.nextInt();
		entrada.close();
		if (hora >= 6 && hora <= 12) {
			System.out.println("Buenos días");
		} else if (hora >= 13 && hora <= 20) {
			System.out.println("Buenas tardes");
		} else if ((hora >= 21 && hora <= 24) || (hora >= 1 && hora <= 5)) {
			System.out.println("Buenas noches");
		} else {
			System.out.println("No has escrito una hora correcta");
		}
	}

}
