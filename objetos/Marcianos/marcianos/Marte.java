package marcianos;

public class Marte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marciano et1 = new Marciano("et1");
		System.out.println("En ese momento hay "+Marciano.numMarcianos+" marcianos");
		Marciano et2 = new Marciano("et2");
		System.out.println("En ese momento hay "+Marciano.numMarcianos+" marcianos");
		Marciano et3 = new Marciano("et3");
		System.out.println("En ese momento hay "+Marciano.numMarcianos+" marcianos");
		et2.muere("et2");
		System.out.println("En ese momento hay "+Marciano.numMarcianos+" marcianos");
		Marciano et4= new Marciano("et4");
		System.out.println("En ese momento hay "+Marciano.numMarcianos+" marcianos");
		et1.vivoOMuerto("et1");
		et2.vivoOMuerto("et2");
		et3.vivoOMuerto("et3");
		et4.vivoOMuerto("et4");
	}

}
