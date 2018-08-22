import java.util.Scanner;

public class ConversorAEuros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime las pesetas que quieres convertir a euros");
		Scanner entrada=new Scanner(System.in);
		double aEuros= 166.386;
		double pesetas=entrada.nextDouble();
		entrada.close();
		double pasarEuros= pesetas/aEuros;
		System.out.println(pesetas+" de las antiguas pesetas son "+pasarEuros+"€");
	}

}
