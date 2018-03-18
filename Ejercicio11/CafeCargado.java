package Ejercicio11;

public class CafeCargado implements Cafetera {

	public Cafe getIngredientes(int posicion) {

		return Cafe.values()[posicion];
	}
}