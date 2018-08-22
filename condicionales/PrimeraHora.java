import java.util.Scanner;

public class PrimeraHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un día de la semana");
		String dia=entrada.nextLine();
		entrada.close();
		switch (dia) {
			case "lunes":
				System.out.println("Los "+dia+" a primera hora hay E.F.");
				break;
			case "martes":
				System.out.println("Los "+dia+" a primera hora hay Matemáticas");
				break;
			case "miércoles":
				System.out.println("Los "+dia+" a primera hora hay Música");
				break;
			case "jueves":
				System.out.println("Los "+dia+" a primera hora hay Inglés");
				break;
			case "viernes":
				System.out.println("Los "+dia+" a primera hora hay Lenguaje");
				break;
			default:
				System.out.println("Ese día no hay clase");
				break;
		}
	}

}
