package Ejercicio11;

public class CafeExpreso implements Cafetera {

	public Cafe getIngredientes(int posicion) {

		return Cafe.values()[posicion];
	}
}