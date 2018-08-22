import java.util.Scanner;

public class DeKbAMb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe los Kb");
		int Kb = entrada.nextInt();
		entrada.close();
		double Mb =(double) Kb * 0.001;
		System.out.println(Kb + " Kb son " + Mb + "Mb");
		
	}

}
