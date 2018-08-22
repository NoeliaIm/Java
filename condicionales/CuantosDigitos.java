import java.util.Scanner;

public class CuantosDigitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num = entrada.nextInt();
		entrada.close();
		int dig = 0;
		if (num<0) {
			num=num*-1;
		}
		if (num <= 99999) {
			while (num > 0) {
				num = num / 10;
				dig++;
			}
		} else {
			System.out.println("El número tiene que tener 5 cifras como máximo");
		}
		System.out.println("El número tiene " + dig + " cifras");
	}

}
