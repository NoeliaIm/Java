package marcianos;

public class Marciano {
	private boolean vivo = false;
	private String nombre;
	public static int numMarcianos = 0;
	private final String soy = "marciano";

	public Marciano(String nombre) {
		this.nombre = nombre;
		this.vivo = true;
		numMarcianos++;
		nace();
	}

	/**
	 * @return the vivo
	 */
	public boolean isVivo() {
		return vivo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the numMarcianos
	 */
	public static int getNumMarcianos() {
		return numMarcianos;
	}

	/**
	 * @return the soy
	 */
	public String getSoy() {
		return soy;
	}

	public void nace() {
		System.out.println("Hola, he nacido, soy el marciano " + nombre);
	}

	public void muere(String nombre) {
		if (isVivo()) {
			vivo = false;
			numMarcianos--;
			System.out.println("El marciano " + nombre + " ha muerto");
		}
	}
	public void vivoOMuerto(String nombre) {
		if (isVivo()) {
			System.out.println("El marciano "+nombre+" está vivo");
		}
		else {
			System.out.println("El marciano "+nombre+" está muerto");
		}
	}
}
