package Ejercicio7;

public abstract class Poligono {

	protected int numeroDatos;

	public Poligono(int x) {
		numeroDatos = x;
	}

	public int getNumeroDatos() {
		return numeroDatos;
	}

	@Override
	public String toString() {
		return "Numero de Datos: "+numeroDatos;
	}

	public abstract double area();
}