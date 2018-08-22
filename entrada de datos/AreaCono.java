import java.util.Scanner;

public class AreaCono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la altura de cono");
		double h = entrada.nextDouble();
		System.out.println("Escribe el radio de la circunferencia");
		double r = entrada.nextDouble();
		entrada.close();
		double volumen = (Math.PI * (r * r) * h) / 3;
		System.out.println("El volumen del cono es " + volumen);
	}

}
