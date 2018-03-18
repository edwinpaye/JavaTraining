package Ejercicio11;

public class CafeNormal implements Cafetera {

	public Cafe getIngredientes(int posicion) {

		return Cafe.values()[posicion];
	}
}