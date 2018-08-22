import java.util.Scanner;

public class TemperaturaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp = new int[12];
		System.out.println("Dime la temperatura media de cada mes del año 2017. Separa los números con un intro");
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < temp.length; i++) {
			temp[i] = entrada.nextInt();

		}
		entrada.close();
		for (int j = 0; j < temp.length; j++) {
			for (int k = 0; k < temp[j]; k++) {
				System.out.print("*");
				
			}
			System.out.println("\n");
		}

	}

}
