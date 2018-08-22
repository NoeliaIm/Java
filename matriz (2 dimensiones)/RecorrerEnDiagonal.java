import java.util.Scanner;

public class RecorrerEnDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime la dimensión de la matriz");
		int dim = entrada.nextInt();
		entrada.close();
		int[][] matriz = new int[dim][dim];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=(int)(Math.random()*10);
			}
		}
		//recorre las diagonales que comienzan en la primera fila y terminan en la última columna
		for (int diag = dim; diag > 0; diag--) {
			for (int x = diag, y = 0; x <= dim; x++, y++) {
				System.out.printf("%d ", matriz[y][x]);
				System.out.printf("\n");
			}
		}
		//recorre las que comienzan en la primera columna y terminan en la última fila. 
		for (int diag = 1; diag <= dim; diag++) {
			for (int x = 0, y = diag; y <= dim; x++, y++) {
				System.out.printf("%d ", matriz[y][x]);
			}
			System.out.printf("\n");
		}
	}

}
/*recorrido IZQ - DER

Código JAVA: 
Ver original
for(i =0; i<f; i++){
 for (int i = 0; i < f; i++) {
    for (int j = 0; j < c-i ; j++) {
    }
}
 

Recorrido DER - IZQ

Código JAVA: 
Ver original
for (int i = 0; i < f; i++) {
    for (int j = c-i; j<c; j++) {
    }
}
 

*/