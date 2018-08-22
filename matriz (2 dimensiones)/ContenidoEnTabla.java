
public class ContenidoEnTabla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = new int[3][6];
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;
		System.out.print("Array Num\t");
		for (int i = 0; i < 6; i++) {
			System.out.print("Columna " + i + "\t");
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			System.out.print("Fila" + i + "\t\t");
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j]!=0||(i==0&&j==0)||(i==1&&j==4)) {
					System.out.print(num[i][j] + "\t\t");
					
				}else {
					System.out.print("\t\t");
					
				}
				
			}
			System.out.println();
		}
	}

}
