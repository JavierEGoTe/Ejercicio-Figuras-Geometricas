import static java.lang.Math. *;

public class Circulo extends FigurasGeometricas{
	float radio=0.0f;
	double area=0;
	public String calcularArea() {
		area = Math.PI*Math.pow(radio,2);
		return "El area del circulo es: "+area;
	}
}
