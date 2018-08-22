import java.util.Scanner;

public class TiempoEnCaer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la altura desde la que tiramos el objeto");
		double h = entrada.nextDouble();
		entrada.close();
		double g = 9.81;
		double t = Math.sqrt((2 * h) / g);
		System.out.println("El objeto tarda " + t + " s en caer");
	}

}
