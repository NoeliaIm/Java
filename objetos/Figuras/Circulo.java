
public class Circulo {
	private Punto centro;
	private double radio;

	public Circulo() {
		centro = new Punto();
		this.radio = 0;
	}

	public Circulo(double x, double y, double radio) {
		centro = new Punto(x, y);
		this.radio = radio;
	}

	/**
	 * @return the centro
	 */
	public Punto getCentro() {
		return centro;
	}

	/**
	 * @param centro
	 *        the centro to set
	 */
	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * @param radio
	 *        the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double calcularArea(double radio) {
		double area;
		area = Math.pow(radio, 2) * Math.PI;
		return area;
	}

	public double calcularPerimetro(double radio) {
		double perimetro;
		perimetro = 2 * Math.PI * radio;
		return perimetro;
	}

	public double calcularDistanciaDesde(Punto parametro_punto) {
		double distancia;
		distancia = centro.calcularDistanciaDesde(parametro_punto);
		return distancia;
	}
}
