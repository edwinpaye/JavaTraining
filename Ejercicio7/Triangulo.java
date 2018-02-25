package Ejercicio7;

import java.lang.Math;

public class Triangulo extends Poligono {
	private double dato1;
	private double dato2;
	private double dato3;

	public Triangulo(double x, double y, double z) {
		super(3);
		dato1 = x;
		dato2 = y;
		dato3 = z;
	}

	public double getDato1() {
		return dato1;
	}

	public double getDato2() {
		return dato2;
	}

	public double getDato3() {
		return dato3;
	}

	@Override
	public String toString() {
		return "Triangulo: \n"+super.toString()+"\nDato 1: "+dato1+", Dato 2: "+dato2+" y Dato 3: "+dato3;
	}

	@Override
	public double area() {
		double p = (dato1+dato2+dato3)/2;
		return Math.sqrt(p*(p-dato1)*(p-dato2)*(p-dato3));
	}
}