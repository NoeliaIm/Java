import java.util.Scanner;

public class NotaProgramacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la nota del primer examen");
		double nota1=entrada.nextDouble();
		System.out.println("¿Qué nota quieres sacar en el trimestre?");
		double notaTrim=entrada.nextDouble();
		entrada.close();
		double nota2=((notaTrim * 100) - (nota1 * 40)) / 60
;
		System.out.println("Para tener un "+notaTrim+" en el trimestre necesitas sacar un "+nota2+" en el segundo examen");
	}

}
