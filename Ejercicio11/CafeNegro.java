package Ejercicio11;

public class CafeNegro implements Cafetera {

	public Cafe getIngredientes(int posicion) {

		return Cafe.values()[posicion];
	}
}