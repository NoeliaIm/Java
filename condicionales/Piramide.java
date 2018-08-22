import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime el carácter con el que quieres dibujar la pirámide");
		String c = entrada.nextLine();
		System.out.println("Dime el sentido en el que quieras la pirámide.\n\r1.Arriba\n\r2.Derecha\n\r3.Abajo\n\r4.Izquierda");
		int sentido = entrada.nextInt();
		entrada.close();
		switch (sentido) {
			case 1:
				System.out.println(" " + c);
				System.out.println(c + c + c);
				break;
			case 2:
				System.out.println(c);
				System.out.println(c + c);
				System.out.println(c);
				break;
			case 3:
				System.out.println(c + c + c);
				System.out.println(" " + c);

				break;
			case 4:
				System.out.println(" " + c);
				System.out.println(c + c);
				System.out.println(" " + c);
				break;
			default:
				System.out.println("Algo no ha ido bien");
				break;
		}
	}

}
