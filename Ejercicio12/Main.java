package Ejercicio12;

public class Main {

	public static void main(String[] args) {

		ProgramaSemana semana = new ProgramaSemana(new EnumVar(Propied.values()), new Menu());

		semana.iniciar();
	}
}