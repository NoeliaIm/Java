package repaso2eval;

/**
 * @author tuppe
 *         elabore un programa que imprima en orden inverso una cadena de caracteres
 */
public class OrdenInversoCadenaCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "Dabale arroz a la zorra el abad";
		int longitud = cadena.length();
		char[] letras = new char[longitud];
		for (int i = 0; i < letras.length; i++) {
			letras[i] = cadena.charAt(i);
		}
		for (int i = 0; i < letras.length; i++) {
			System.out.print(letras[i] + " ");
		}
		System.out.println("\nOrden inverso");
		for (int i = letras.length-1; i >=0 ; i--) {
			System.out.print(letras[i]+" ");
		}
	}

}
