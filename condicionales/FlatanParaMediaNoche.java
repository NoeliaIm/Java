import java.util.Scanner;

public class FlatanParaMediaNoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la hora 1-24h");
		int hora = entrada.nextInt();
		System.out.println("Escribe los minutos");
		int min = entrada.nextInt();
		entrada.close();
		int horasPara12 = 24 - hora;
		int minParaHora = 60 - min;
		int segParaLasDoce = (horasPara12 * 3600) + (minParaHora * 60);
		System.out.println("Faltan " + segParaLasDoce + " segundos para las doce de la noche");
	}

}
