package centro;

public class Alumno {
	public String nombre;
	private Asignatura asig1;
	private Asignatura asig2;
	private Asignatura asig3;

	public Alumno(String nombre, Asignatura asig1, Asignatura asig2, Asignatura asig3) {
		this.nombre=nombre;
		this.asig1 = asig1;
		this.asig2 = asig2;
		this.asig3 = asig3;
	}

	public Alumno(String nombre, Asignatura asig1) {
		this.nombre=nombre;
		this.asig1 = asig1;
	}

	public Alumno(String nombre, Asignatura asig1, Asignatura asig2) {
		this.nombre=nombre;
		this.asig1 = asig1;
		this.asig2 = asig2;
	}

	/**
	 * @return the asig1
	 */
	public Asignatura getAsig1() {
		return asig1;
	}

	/**
	 * @return the asig2
	 */
	public Asignatura getAsig2() {
		return asig2;
	}

	/**
	 * @return the asig3
	 */
	public Asignatura getAsig3() {
		return asig3;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", asig1=" + asig1.getNombre() + ", asig2=" + asig2.getNombre() + ", asig3=" + asig3.getNombre() + "]";
	}

}
