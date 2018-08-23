
/**
 * @author Noelia
 *Hacer un programa en Java que rellene un array de 20 elementos de forma aleatoria con números
entre 0 y 100 y luego lo visualice. Realizar el programa mediante un método rellenarArray que a su
vez llamará al método random, que se encargará de generar el número aleatorio. Visualizar el
contenido del Array en el método main.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] miArray=new int[20];
rellenarArray(miArray);
for (int i = 0; i < miArray.length; i++) {
	System.out.print(miArray[i]+" ");
}
	}
public static int aleatorio() {
	return (int)(Math.random()*100);
}
public static void rellenarArray(int []array) {
	for (int i = 0; i < array.length; i++) {
		array[i]=aleatorio();
	}
}

}
