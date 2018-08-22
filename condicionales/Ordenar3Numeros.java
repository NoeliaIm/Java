import java.util.Scanner;

public class Ordenar3Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe tres números enteros separados por un Intro");
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		entrada.close();
		int mayor=0, medio=0, menor=0;
		if (a > b && a > c) {
			mayor = a;
			if (b > c) {
				medio = b;
				menor = c;
			}else {
				medio=c;
				menor=b;
			}
		}
		if (b > a && b > c) {
			mayor = b;
			if (a > c) {
				medio = a;
				menor = c;
			}else {
				medio=c;
				menor=a;
			}
		}
		if (c > b && c > b) {
			mayor = c;
			if (b > a) {
				medio = b;
				menor = a;
			}else {
				medio=a;
				menor=b;
			}
		}
		System.out.println(mayor+"-"+medio+"-"+menor);
	}

}
