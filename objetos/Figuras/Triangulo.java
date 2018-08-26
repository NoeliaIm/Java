
public class Triangulo {
	private Punto punto1;
	private Punto punto2;
	private Punto punto3;

	public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
		this.punto1 = punto1;
		this.punto2 = punto2;
		this.punto3 = punto3;
	}

	public Triangulo() {
		punto1 = new Punto();
		punto2 = new Punto();
		punto3 = new Punto();
	}

	public Triangulo(double x1, double y1, double x2, double y2, double x3, double y3) {
		punto1 = new Punto(x1, y1);
		punto2 = new Punto(x2, y2);
		punto3 = new Punto(x3, y3);
	}

	/**
	 * @return the punto1
	 */
	public Punto getPunto1() {
		return punto1;
	}

	/**
	 * @param punto1
	 *        the punto1 to set
	 */
	public void setPunto1(Punto punto1) {
		this.punto1 = punto1;
	}

	/**
	 * @return the punto2
	 */
	public Punto getPunto2() {
		return punto2;
	}

	/**
	 * @param punto2
	 *        the punto2 to set
	 */
	public void setPunto2(Punto punto2) {
		this.punto2 = punto2;
	}

	/**
	 * @return the punto3
	 */
	public Punto getPunto3() {
		return punto3;
	}

	/**
	 * @param punto3
	 *        the punto3 to set
	 */
	public void setPunto3(Punto punto3) {
		this.punto3 = punto3;
	}

	public double calcularArea(Triangulo triangulo) {
		double base, altura, area;
		base = punto1.calcularDistanciaDesde(triangulo.punto2);
		altura = punto1.calcularDistanciaDesde(punto3);
		area = base * altura;
		return area;
	}

	public double calcularPerimetro(Triangulo triangulo) {
		double lado1, lado2, lado3, perimetro;
		lado1 = punto1.calcularDistanciaDesde(punto2);
		lado2 = punto2.calcularDistanciaDesde(punto3);
		lado3 = punto3.calcularDistanciaDesde(punto1);
		perimetro = lado1 + lado2 + lado3;
		return perimetro;
	}
}
