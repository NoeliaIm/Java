import java.util.Scanner;

public class CuantosNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Escribe un número");
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		entrada.close();
		int digitos = 1;
		while (num > 10) {
			num /= 10;
			digitos++;
		}
		System.out.println("El número que has escrito tiene "+digitos+" digitos.");
	}

}
