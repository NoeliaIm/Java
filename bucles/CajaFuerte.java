import java.util.Scanner;

public class CajaFuerte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int combinacion = 1234;
		int oportunidades = 1;
		Scanner entrada = new Scanner(System.in);
		while (oportunidades <= 4) {
			System.out.println("Escribe la combinación de la caja fuerte");
			int intento = entrada.nextInt();
			if (combinacion == intento) {
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
				break;
			} else {
				System.out.println("Lo siento,esa no es la combinación");
			}
			oportunidades++;
		}
		entrada.close();
	}

}
