package repaso1eval;

import java.util.Scanner;

/**
 * @author tuppe
 *         Contar una lista de n números que ingresan por teclado, rechazando el número 0,
 *         luego obtenga el total de números positivos que ingresaron, total de negativos
 *         y el promedio de cada uno.
 */
public class PositivosNegativosPromedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,total=0, totalposi=0, totalnega=0;// sumaposi=0, sumanega=0;
				
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Introduce un número");
			num=entrada.nextInt();
			total++;
			if (num<0) {
				totalnega++;
				//sumanega+=num;
			}else if (num>0) {
				totalposi++;
				//sumaposi+=num;
			}
		}while(num!=0);
		entrada.close();
		System.out.println("Número total de positivos: "+totalposi);
		System.out.println("Número total de negativos: "+totalnega);
		/*System.out.println("Promedio de positivos "+(double)sumaposi/(total-1));
		System.out.println("Promedio de negativos "+(double)sumanega/(total-1));*/
		System.out.println("Promedio de positivos "+totalposi*100/(total-1)+"%");
		System.out.println("Promedio de negativos "+totalnega*100/(total-1)+"%");
	}

}
