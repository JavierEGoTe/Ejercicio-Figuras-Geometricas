
public class Triangulo extends FigurasGeometricas{
	float base=0.0f;
	float altura=0.0f;
	public String calcularArea() {
		area = base*altura;
		return "El area del triangulo es: "+area;
	}
}
