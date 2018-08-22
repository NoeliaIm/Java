import java.util.Scanner;

public class DeMbAKb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe los Mb");
		int mb = entrada.nextInt();
		entrada.close();
		int kb = mb * 1000;
		System.out.println(mb + " Mb son " + kb + "Kb");
	}

}
