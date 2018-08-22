package repaso1eval;

import java.util.Scanner;

public class ASegundos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la hora en el formato HH:MM:SS");
		String hora = entrada.next();
		entrada.close();
		int horas = Integer.parseInt(hora.substring(0, 2));
		int mins = Integer.parseInt(hora.substring(3, 5));
		int segs = Integer.parseInt(hora.substring(6, 8));
		// System.out.println(horas + " " + mins + " " + segs);
		horas = horas * 3600;
		mins = mins * 60;
		segs = horas + mins + segs;
		System.out.println("Son " + segs + " segundos");
	}

}
