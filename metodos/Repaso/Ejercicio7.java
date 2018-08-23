import java.util.Scanner;

/**
 * @author Noelia
 *Hacer un programa en Java para enseñar a un niño la tabla de multiplicar. El programa deberá
pedirle un número e ir preguntado hasta ese número x 9. Si el niño acierta el resultado, se
pasa al siguiente, en caso contrario se le muestra un mensaje de error y se le da otra oportunidad.
Si falla de nuevo se le muestra el resultado válido. Al final se contabilizarán los errores. Si son
más de dos necesitará repasar más. En caso contrario, se le indica que ha superado la prueba. La
práctica deberá resolverse con métodos que realicen cada uno de los procesos.
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = pedirNum();
		tablaDeMultiplicar(num);

	}

	public static int pedirNum() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime que número quieres respasar");
		int num = entrada.nextInt();
		return num;
	}

	public static void tablaDeMultiplicar(int num) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int totalFallos = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println(num + "X" + i + "=??");
			int resultado = entrada.nextInt();
			int fallo = 0;
			do {
				if (resultado != num * i) {

					if (fallo == 0) {
						System.out.println("Has fallado");
						fallo++;
						totalFallos++;
						System.out.println(num + "X" + i + "=??");
						resultado = entrada.nextInt();
					} else if (fallo == 1) {
						System.out.println("Has vuelto a fallar");
						System.out.println(num + "X" + i + " = " + num * i);
						totalFallos++;
						fallo = 0;
						resultado = num * i;
					}
				}
			} while (resultado != num * i);
		}

		if (totalFallos > 2) {
			System.out.println("Tienes que volver a repasar esta tabla");
		}
	}
}
