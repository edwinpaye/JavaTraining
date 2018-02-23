package Ejercicio5;

import java.lang.Math;

public class Calcular {

	private int base;
	private int haltura;
	private float area;
	
	public Calcular() {}

	public void setBase(int x) {
		base = x;
	}
	public void setHaltura(int x) {
		haltura = x;
	}
	public int getBase() {
		return base;
	}
	public int getHaltura() {
		return haltura;
	}
	public float area() {
		area = (float)(base * haltura)/2;
		return area;
	}
	public float perimetro() {
		return base + (2*(float) Math.sqrt((haltura*haltura)+(base*base)/4));
	}
}