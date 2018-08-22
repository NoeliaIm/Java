import java.util.Scanner;

public class CalcularIva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la base imponible de la factura");
		double base = entrada.nextDouble();
		entrada.close();
		double iva = 0.21;
		double totalFactura = (base * iva) + base;
		System.out.println("El total de la factura es " + totalFactura);
	}

}
