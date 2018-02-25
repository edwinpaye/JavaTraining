package Ejercicio7;

public class Rectangulo extends Poligono {
	private double dato1;
	private double dato2;

	public Rectangulo(double x, double y) {
		super(2);
		dato1 = x;
		dato2 = y;
	}

	public double getDato1() {
		return dato1;
	}

	public double getDato2() {
		return dato2;
	}

	@Override
	public String toString() {
		return "Rectangulo: \n"+super.toString()+"\nDato 1: "+dato1+" y Dato 2: "+dato2;
	}

	@Override
	public double area() {
		return dato1*dato2;
	}
}