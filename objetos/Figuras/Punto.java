
public class Punto {
	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Punto() {
		this(0, 0);
	}

	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @param x
	 *        the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y
	 *        the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}

	public double calcularDistanciaDesde(Punto parametro_punto) {
		double distancia;
		distancia = Math.sqrt(Math.pow((this.x - parametro_punto.x), 2) + (Math.pow((this.y - parametro_punto.y), 2)));
		return distancia;
	}
}
