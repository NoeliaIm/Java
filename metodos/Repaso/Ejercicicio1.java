
/**
 * @author Noelia
 *Hacer un programa en Java que cargue el siguiente array {5, 4, 3, 7, 9, 12, 34, 56}, escriba la suma
de los elementos situados en índice con valor par y la suma de los elementos situados en índice con
valor impar. Realizar para ello dos métodos: uno que se encargue del cálculo de la suma de los
elementos de índice par y otro que se encargue de la suma de los elementos de índice impar.
Visualizar los resultados en el método main.
 */
public class Ejercicicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []miArray= {5,4,3,7,9,12,34,56};
int sumapar=0, sumaimpar=0;
sumapar=sumaPar(miArray, sumapar);
sumaimpar=sumaImpar(miArray, sumaimpar);
System.out.println("La suma de los lugares pares es: "+sumapar);
System.out.println("La suma de los lugares impares es: "+sumaimpar);
}
public static int sumaPar(int[] miArray, int sumapar) {
	for (int i = 0; i < miArray.length; i+=2) {
		sumapar+=miArray[i];
	}
	return sumapar;
}
public static int sumaImpar(int[] miArray, int sumaimpar) {
	for (int i = 1; i < miArray.length; i+=2) {
		sumaimpar+=miArray[i];
	}
	return sumaimpar;
}
}