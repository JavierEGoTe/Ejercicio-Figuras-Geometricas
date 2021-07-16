
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado cuadrado1 = new Cuadrado();
		cuadrado1.lado = 5.0f;
		System.out.println(cuadrado1.calcularArea());
		
		Circulo circulo1 = new Circulo();
		circulo1.radio = 12.78f;
		System.out.println(circulo1.calcularArea());
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.base = 12.3f;
		triangulo1.altura = 7.5f;
		System.out.println(triangulo1.calcularArea());
	}

}
