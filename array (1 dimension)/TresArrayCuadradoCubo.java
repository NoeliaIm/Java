
public class TresArrayCuadradoCubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[20];
		int cuadrado[] = new int[20];
		int cubo[] = new int[20];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}
		for (int j = 0; j < cuadrado.length; j++) {
			cuadrado[j] = num[j] * num[j];
		}
		for (int k = 0; k < cubo.length; k++) {
			cubo[k] = num[k] * num[k] * num[k];
		}
		for (int l = 0; l < num.length; l++) {
			System.out.println(num[l] + "\t" + cuadrado[l] + "\t" + cubo[l]);
		}

	}

}
