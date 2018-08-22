import java.util.Scanner;

public class MediaDeNumHastaNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double totalNumeros = 0;
		double sumaNumeros = 0;
		double num = 0;
		while (num >= 0) {
			System.out.println("Introduce un número.(Negativo para terminar)");
			num = entrada.nextInt();
			sumaNumeros += num;
			totalNumeros++;

		} 
		entrada.close();
		System.out.println("La media de los números introducidos es " + (sumaNumeros-num) / (totalNumeros-1));
	}

}
