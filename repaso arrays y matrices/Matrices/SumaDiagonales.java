package repaso2eval.Matrices;

import java.util.Scanner;

/**
 * @author tuppe
 *         Escribir un programa para que mediante funciones se llene una matriz de N filas
 *         por M columnas con números aleatorios reales, mostrar en pantalla la matriz,
 *         luego se sumen las diagonales de esta matriz.
 */
public class SumaDiagonales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime el número de filas");
		int fila = entrada.nextInt();
		System.out.println("Dime el número de columnas");
		int col = entrada.nextInt();
		entrada.close();
		int[][] matriz = new int[fila][col];
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 11);
				System.out.print(matriz[i][j] + "\t");
			}
		}
		// Suma de la diagonal principal
		int sumaPrin = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					sumaPrin += matriz[i][j];
				}
			}
		}
		System.out.println("\nSuma de la diagonal principal: " + sumaPrin);
		// Suma de la diagonal secundaria
		int sumaSec = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j == (col - i - 1)) {//col es el número de columnas de la matriz
					sumaSec += matriz[i][j];
				}
			}
		}
		System.out.println("Suma de la diagonal secundaria: " + sumaSec);
		System.out.println("Sumamos la diagonal secundaria con el método "+sumaDS(matriz));
		System.out.println("Hacemos un array con las diagonales");
		//Para una matriz cuadrada:
		System.out.println("Primera Diagonal");
		for(int i = 0; i <matriz.length; i++){
		    System.out.println(matriz[i][i]); 
		}


		System.out.println("Segunda Diagonal");
		int i = 0;
		for(int j = matriz.length-1; j >=0; j--){
		    System.out.println(matriz[i][j]);
		    i++;
		}
	}
	 static int sumaDS(int[][]M){
	        int suma = 0;
	        for(int i = 0; i < M.length; i++){
	            for(int j = 0; j < M[i].length; j++){
	                if( i+j == M.length - 1){
	                    suma = suma + M[i][j];
	                }
	            }
	        }
	        return suma;
	    }
}
