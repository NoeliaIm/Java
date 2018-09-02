package maquinaAgua;

import java.util.Scanner;

public class FuncionamientoMaquina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maquina maqui1 = new Maquina(0, 0, 0);
		/*maqui1.rellenarMaquina(100);
		maqui1.reponerCambio(12);
		System.out.println(maqui1);
		maqui1.comprarBotella(1, 0, 1);
		System.out.println(maqui1);
		maqui1.comprarBotella(50, 20, 30);
		maqui1.comprarBotella(50, 20, 10);
		maqui1.comprarBotella(50, 50,2);
		maqui1.rellenarMaquina(100);
		maqui1.rellenarMaquina(51);
		System.out.println(maqui1);*/
		
		Scanner entrada=new Scanner(System.in);
		int opcion;
	    do {
	    	System.out.println("Elige una opción \n\r 1.Rellenar Máquina\n\r2.Saber precio de un botella\n\r3.Comprar botellas\n\r"
					+ "4.Introducir cambio\n\r5.Recuadar\n\r6.Ver estado máquina\n\r7.Salir");
	    	opcion=entrada.nextInt();
	    	switch (opcion) {
				case 1:
					System.out.println("¿Cuántas botellas quieres introducir?");
					int cuantas=entrada.nextInt();
					maqui1.rellenarMaquina(cuantas);
					break;
				case 2:
					System.out.println("Una botella cuesta "+maqui1.consultarPrecio()+"€");
					break;
				case 3:
					System.out.println("¿Cuántas botellas quieres comprar?");
					int cuantasBot=entrada.nextInt();
					while (!maqui1.comprobarBotellas(cuantasBot)) {
						System.out.println("No hay existencias suficientes para la venta");
						System.out.println("Introduce un número de botellas inferior a existencias: "+maqui1.getNumBotellas());
						cuantasBot=entrada.nextInt();
					}
					System.out.println("¿Cuántas monedas de 1€ has introducido?");
					int monedas1=entrada.nextInt();
					System.out.println("¿Cuántas monedas de 2€ has introducido?");
					int monedas2=entrada.nextInt();
					maqui1.comprarBotella(cuantasBot, monedas1, monedas2);
					break;
				case 4:
					System.out.println("¿Cuánto dinero quieres introducir?");
					int dinero=entrada.nextInt();
					maqui1.reponerCambio(dinero);
					break;
				case 5:
					maqui1.recaudar();
					break;
				case 6:
					System.out.println(maqui1);
					break;
				default:
					break;
			}
	    }while(opcion!=7);
	    
		entrada.close();
		
	}

}
