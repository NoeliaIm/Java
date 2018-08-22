import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println("Escribe dos números para hacer operaciones");
		int x=entrada.nextInt();
		int y=entrada.nextInt();
		entrada.close();
		int suma=x+y;
		int resta=x-y;
		int multiplicacion=x*y;
		double division=(double)x/(double)y;
		int resto=x%y;
		System.out.println("La suma de "+x+ " y "+y+" es "+suma);
		System.out.println("La resta de "+x+ " y "+y+" es "+resta);
		System.out.println("La multiplicación de "+x+ " y "+y+" es "+multiplicacion);
		System.out.println("La división de "+x+ " y "+y+" es "+division);
		System.out.println("El resto de la división entre "+x+ " y "+y+" es "+resto);
	}

}
