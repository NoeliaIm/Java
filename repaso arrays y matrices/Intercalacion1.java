package repaso2eval;

public class Intercalacion1 {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 5, 8, 9, 11, 13 };
		int[] array2 = { 2, 4, 6, 8, 10, 12, 17, 19, 21 };
		int ta1 = array1.length;
		int ta2 = array2.length;
		int ta3 = ta1 + ta2;
		int[] array3 = new int[ta3];
		int x = 0, y = 0, z = 0;
		System.out.println("\n Array numero 1: \n");
		for (int i = 0; i < array1.length; i++)
			System.out.print("  " + array1[i]);
		System.out.println("\n Array numero 2: \n");
		for (int j = 0; j < array2.length; j++)
			System.out.print("  " + array2[j]);
		while ((x < ta1) && (y < ta2)) {
			if (array1[x] < array2[y]) {
				array3[z] = array1[x];
				x++;
			} else {
				array3[z] = array2[y];
				y++;
			}
			z++;
		}
		if (x < ta1)
			for (int i = x; i < ta1; i++) {
				array3[z] = array1[i];
				z++;
			}
		else
			for (int i = y; i < ta2; i++) {
				array3[z] = array2[i];
				z++;
			}
		System.out.println("\n Array numero 3: \n");
		for (int i = 0; i < array3.length; i++)
			System.out.print("  " + array3[i]);
	}

}
