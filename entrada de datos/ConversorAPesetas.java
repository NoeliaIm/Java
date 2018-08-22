import java.util.Scanner;

public class ConversorAPesetas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println("Dime los euros que quieres convertir a pesetas");
		double aPesetas= 166.386;
		double euros=entrada.nextDouble();
		entrada.close();
		double pasarEuros= euros*aPesetas;
		System.out.println(euros+"€"+" son "+pasarEuros+" de las antiguas pesetas");
	}

}
