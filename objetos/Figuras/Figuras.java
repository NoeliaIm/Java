

public class Figuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto punto1 = new Punto(5, 3);
		Punto punto2 = new Punto(7, 8);
		System.out.println("La distancia entre los dos puntos es "+punto1.calcularDistanciaDesde(punto2));
		Punto punto3=new Punto(9, 8);
		Triangulo triangulo1=new Triangulo(punto1, punto2, punto3);
		System.out.println("El área del triángulo es "+triangulo1.calcularArea(triangulo1));
		System.out.println("El perímetro del triángulo es "+triangulo1.calcularPerimetro(triangulo1));
		Circulo circulo1=new Circulo(6, 3, 5);
		System.out.println("El área del círculo es "+circulo1.calcularArea(circulo1.getRadio()));
		System.out.println("El perímetro del círculo es "+circulo1.calcularPerimetro(circulo1.getRadio()));
		System.out.println("La distancia hasta el punto1 es "+circulo1.calcularDistanciaDesde(punto1));
	}
	
}
