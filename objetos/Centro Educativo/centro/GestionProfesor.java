package centro;

public class GestionProfesor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asignatura asig1 = new Asignatura("Bases de Datos");
		Asignatura asig2 = new Asignatura("Programación");
		Asignatura asig3 = new Asignatura("Inglés");
		Alumno alumno1 = new Alumno("Noelia Iglesias", asig1, asig2, asig3);
		Profesor profe1 = new Profesor();
		profe1.ponerNotas(alumno1);
		System.out.println(alumno1);
		System.out.println(profe1.media(alumno1));
	}

}
