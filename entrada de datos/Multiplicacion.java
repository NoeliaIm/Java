import java.util.Scanner;

public class Multiplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada=new Scanner(System.in);
System.out.println("Introduce dos números para multiplicar");
int primerNumero=entrada.nextInt();
int segundoNumero=entrada.nextInt();
entrada.close();
int multiplicacion=primerNumero*segundoNumero;
System.out.println("Resultado: "+multiplicacion);
	}

}
