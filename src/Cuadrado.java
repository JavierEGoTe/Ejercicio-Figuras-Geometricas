import static java.lang.Math. *;

public class Cuadrado extends FigurasGeometricas{
	float lado=0.0f;
	public String calcularArea() {
		area = lado*lado;
		return "El area del circulo es: "+area;
	}
}
