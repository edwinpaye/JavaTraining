package Ejercicio6;

public class Menu {

	private int opcion;

	Programa a = new Programa();

	public Menu() {}

	public void iniciar() {
		a.setA();
	}

	public void setOpcion() {
		opcion = a.getOpcion();
	}

	public void printMenu() {
		iniciar();
		do {
			setOpcion();
			switch (opcion) {
				case 1:	a.setB();
						System.out.println(a.suma());
						break;
				case 2:	a.setB();
						System.out.println(a.multiplicar());
						break;
				case 3:	a.setB();
						System.out.println(a.comparar());
						break;
				case 4:	a.setBInt();
						System.out.println(a.multiplicarEnt());
						break;
				case 5:	break;
				default: System.out.println("\nLa opcion "+opcion+" no esta en el menu intenta de nuevo.\n");
						break;
			}
		} while (opcion != 5);
	}
}