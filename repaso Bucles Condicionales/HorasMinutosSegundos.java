package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Escribir un programa que pida una hora en segundos y la saque por
 *         pantalla en el formato “hh:mm:ss”, es decir horas, minutos y segundos
 */
public class HorasMinutosSegundos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime la hora en segundos");
		int horaseg = entrada.nextInt();
		while (horaseg > 86400) {
			System.out.println("Un día tiene 86400 segundos, si pones más no te diré la hora\n\rInténtalo de nuevo");
			horaseg = entrada.nextInt();
		}
		entrada.close();
		int min=horaseg/60;
		int seg=horaseg%60;
		int horas=min/60;
		min=min%60;
		String horaH, minM,segS;
		if (horas<10) {
			horaH="0"+String.valueOf(horas);
		}else {
			horaH=String.valueOf(horas);
		}
		if (min<10) {
			minM="0"+String.valueOf(min);
		}else {
			minM=String.valueOf(min);
		}
		if (seg<10) {
			segS="0"+String.valueOf(seg);
		}else {
			segS=String.valueOf(seg);
		}
		System.out.println(horaH+":"+minM+":"+ segS);
	}

}
