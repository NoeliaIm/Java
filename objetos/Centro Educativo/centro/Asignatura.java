package centro;

public class Asignatura {
	public String nombre;
	public double calificacion;

	public Asignatura(String nombre, double calificacion) {
		this.nombre = nombre;
		this.calificacion = calificacion;
	}

	public Asignatura(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the calificacion
	 */
	public double getCalificacion() {
		return calificacion;
	}

	/**
	 * @param calificacion
	 *        the calificacion to set
	 */
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

}
