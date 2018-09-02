package maquinaAgua;

public class Maquina {
	private int numBotellas;
	private int recauda;
	private int dineroCambio;

	public Maquina(int numBotellas, int recauda, int dineroCambio) {
		this.numBotellas = numBotellas;
		this.recauda = recauda;
		this.dineroCambio = dineroCambio;
	}

	/**
	 * @return the numBotellas
	 */
	public int getNumBotellas() {
		return numBotellas;
	}

	/**
	 * @param numBotellas
	 *        the numBotellas to set
	 */
	public void setNumBotellas(int numBotellas) {
		this.numBotellas = numBotellas;
	}

	/**
	 * @return the recauda
	 */
	public int getRecauda() {
		return recauda;
	}

	/**
	 * @param recauda
	 *        the recauda to set
	 */
	public void setRecauda(int recauda) {
		this.recauda = recauda;
	}

	/**
	 * @return the dineroCambio
	 */
	public int getDineroCambio() {
		return dineroCambio;
	}

	/**
	 * @param dineroCambio
	 *        the dineroCambio to set
	 */
	public void setDineroCambio(int dineroCambio) {
		this.dineroCambio = dineroCambio;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Maquina [numBotellas=" + numBotellas + ", recauda=" + recauda + ", dineroCambio=" + dineroCambio + "]";
	}

	public void rellenarMaquina(int cuantas) {
		if (getNumBotellas() + cuantas <= 100) {
			setNumBotellas(getNumBotellas() + cuantas);
		} else {
			System.out.println("Con esta reposición se excede la capacidad de la máquina, sólo puedes añadir " + (100 - getNumBotellas()));
		}
	}

	public void comprarBotella(int cuantas, int monedas1, int monedas2) {
		if ((monedas1 + monedas2 * 2) < cuantas) {
			System.out.println("No has introducido dinero suficiente");
		} else if (getDineroCambio() < ((monedas1 + monedas2 * 2)-cuantas)) {
			System.out.println("No existe cambio, introduce importe exacto");
		} else {
			setNumBotellas(getNumBotellas() - cuantas);
			setDineroCambio(getDineroCambio() - ((monedas1 + monedas2 * 2) - cuantas));
			setRecauda(getRecauda()+cuantas);
			System.out.println("Recoga su compra, no olvide su cambio: " + ((monedas1 + monedas2 * 2) - cuantas));
			
		}
		
	}
	public boolean comprobarBotellas(int cuantas) {
		if(getNumBotellas()<cuantas) {
			return false;
		}else {
			return true;
		}
	}

	public void reponerCambio(int dinero) {
		setDineroCambio(getDineroCambio() + dinero);
	}

	public void recaudar() {
		int recaudacion = getRecauda();
		System.out.println("Se han recaudado " + recaudacion + "€.");
		setRecauda(0);
	}

	public int consultarPrecio() {
		return 1;
	}
}
