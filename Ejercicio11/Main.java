package Ejercicio11;

public class Main {

	public static void main(String[] args) {

		ProgramaCafe cafe = new ProgramaCafe(new EnumCafe(Cafe.values()), new Menu());

		cafe.iniciar();
	}
}