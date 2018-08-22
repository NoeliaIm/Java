import java.util.Scanner;

public class MatrizSimetrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe el tamaño de la matriz");
		int dim = entrada.nextInt();
		int [][]matriz=new int[dim][dim];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Escribe un valor para la fila "+(i+1)+" columna "+(j+1));
				matriz[i][j]=entrada.nextInt();
			}
		}
		entrada.close();
		System.out.println("MATRIZ");
		System.out.println("---------------------");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		int simetria=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j]!=matriz[j][i]) {
					simetria++;
				}
			}
		}
		if (simetria!=0) {
			System.out.println("La matriz no es simétrica");
		}
		else {
			System.out.println("La matriz es simétrica");
		}
		
	}

}
