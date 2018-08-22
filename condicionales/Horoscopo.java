import java.util.Scanner;

public class Horoscopo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe el mes que naciste (1-12)");
		int mes = entrada.nextInt();
		System.out.println("Escribe el dia que naciste");
		int dia = entrada.nextInt();
		entrada.close();
		switch (mes) {
			case 1:
				if (dia <= 19) {
					System.out.println("Capricornio");
				} else if (dia >= 20) {
					System.out.println("Acuario");
				}
				break;
			case 2:
				if (dia <= 18) {
					System.out.println("Acuario");
				} else if (dia >= 19) {
					System.out.println("Piscis");
				}
				break;
			case 3:
				if (dia <= 20) {
					System.out.println("Piscis");
				} else if (dia >= 21) {
					System.out.println("Aries");
				}
				break;
			case 4:
				if (dia <= 20) {
					System.out.println("Aries");
				} else if (dia >= 21) {
					System.out.println("Tauro");
				}
				break;
			case 5:
				if (dia <= 20) {
					System.out.println("Tauro");
				} else if (dia >= 21) {
					System.out.println("Géminis");
				}
				break;
			case 6:
				if (dia <= 20) {
					System.out.println("Géminis");
				} else if (dia >= 21) {
					System.out.println("Cáncer");
				}
				break;
			case 7:
				if (dia <= 20) {
					System.out.println("Cáncer");
				} else if (dia >= 21) {
					System.out.println("Leo");
				}
				break;
			case 8:
				if (dia <= 21) {
					System.out.println("Leo");
				} else if (dia >= 22) {
					System.out.println("Virgo");
				}
				break;
			case 9:
				if (dia <= 22) {
					System.out.println("Virgo");
				} else if (dia >= 23) {
					System.out.println("Libra");
				}
				break;
			case 10:
				if (dia <= 22) {
					System.out.println("Libra");
				} else if (dia >= 22) {
					System.out.println("Escorpio");
				}
				break;
			case 11:
				if (dia <= 22) {
					System.out.println("Escorpio");
				} else if (dia >= 22) {
					System.out.println("Sagitario");
				}
				break;
			case 12:
				if (dia <= 23) {
					System.out.println("Sagitario");
				} else if (dia >= 21) {
					System.out.println("Capricornio");
				}
				break;
			default:
				break;
		}
	}

}
