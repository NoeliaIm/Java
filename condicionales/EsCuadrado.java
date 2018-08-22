import java.util.Scanner;

public class EsCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe el número");
		int num = entrada.nextInt();
		entrada.close();
		if (cuadrado(num)) {
			System.out.println("El número es se puede expresar como cuadrado de "+(int)Math.sqrt(num));
		}else {
			System.out.println("El número no se puede expresar como cuadrado de ningún otro");
		}
	}
public static boolean cuadrado(int num) {
	int raiz=(int)Math.sqrt(num);
	if (raiz*raiz==num) {
		return true;
	}else {
		return false;
	}
}
}
