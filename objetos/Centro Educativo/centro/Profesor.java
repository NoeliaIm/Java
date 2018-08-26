package centro;

public class Profesor {
	public void ponerNotas(Alumno alumno) {
		alumno.getAsig1().calificacion = Math.floor(Math.random() * 11);
		if (alumno.getAsig2() != null) {
			alumno.getAsig2().calificacion = Math.floor(Math.random() * 11);
		}
		if (alumno.getAsig3() != null) {
			alumno.getAsig3().calificacion = Math.floor(Math.random() * 11);
		}
	}

	public double media(Alumno alumno) {
		double media, sumaNotas = 0;
		int asignaturas = 0;
		if (alumno.getAsig1() != null) {
			sumaNotas += alumno.getAsig1().calificacion;
			asignaturas++;
		}
		if (alumno.getAsig2() != null) {
			sumaNotas += alumno.getAsig2().calificacion;
			asignaturas++;
		}
		if (alumno.getAsig3() != null) {
			sumaNotas += alumno.getAsig3().calificacion;
			asignaturas++;
		}
		media = sumaNotas / asignaturas;
		return media;
	}
}
