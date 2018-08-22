import java.util.Scanner;

public class FacturaProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la base imponible");
		double base = entrada.nextDouble();
		System.out.println("Escribe el tipo de Iva \n\r 21, 10 o 4");
		double iva = entrada.nextDouble();
		System.out.println("Escribe si tienes código promocional \n\r nopro, mitad, meno5, 5porc");
		String promo = entrada.next();

		double descuento = 0;
		double totalIva = 0;
		switch ((int) iva) {
			case 21:
				totalIva = base * 0.21;
				break;
			case 10:
				totalIva = base * 0.10;
				break;
			case 4:
				totalIva = base * 0.04;
				break;
			default:
				System.out.println("No has escrito un tipo de IVA correcto");
				break;
		}

		if (promo.equals("nopro")) {
			descuento = base * 0;
		} else if (promo.equals("mitad")) {
			descuento = base * 0.50;
		} else if (promo.equals("meno5")) {
			descuento = 5;
		} else if (promo.equals("5porc")) {
			descuento = base * 0.05;
		} else {
			System.out.println("No has escrito correctamente las condiciones para el descuento");
		}
		entrada.close();
		System.out.println("Base Imponible:\t" + base);
		System.out.println("Iva (" + iva + "%):\t" + totalIva);
		System.out.println("Precio con iva:\t" + (base + totalIva));
		System.out.println("Código promoción (" + promo + "):\t-" + descuento);
		System.out.println("TOTAL:\t" + (base + totalIva - descuento));

	}

}
