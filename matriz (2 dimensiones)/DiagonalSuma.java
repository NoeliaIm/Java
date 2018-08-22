import java.util.Scanner;

public class DiagonalSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime el número de filas");
		int filas = entrada.nextInt();
		System.out.println("Dime el número de columnas");
		int col = entrada.nextInt();
		entrada.close();
		int[][] matriz = new int[filas][col];
		rellenarArray(matriz);
		System.out.println("La suma de la diagonal principal es "+sumaDiagonal(matriz));
		System.out.println("La suma de la diagonal secundaria es "+sumaDiagonal2(matriz,col));
		sumaDebajoyEncima(matriz);
	}

	public static void rellenarArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) Math.floor((Math.random() *10));
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int sumaDiagonal(int [][]array) {
		int sumaPrin=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i==j) {
					sumaPrin+=array[i][j];
				}
			}
		}
		return sumaPrin;
	}
	public static int sumaDiagonal2(int [][]array,int col) {
		int sumaSec=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if( j==(col-i-1)) {
					sumaSec+=array[i][j];
				}
			}
		}
		return sumaSec;
	}
	public static void sumaDebajoyEncima(int[][]array) {
		int sumaDebajo=0;
		int sumaEncima=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i>j) {
					sumaDebajo+=array[i][j];
				}else if(i>j||i!=j) {
					sumaEncima+=array[i][j];
				}
			}
		}
		System.out.println("La suma de los números por debajo de la diagonal principal es "+sumaDebajo);
		System.out.println("La suma de los números por encima de la diagonal principal es "+sumaEncima);
	}
	
}
