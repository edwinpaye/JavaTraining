package Ejercicio12;

public class ProgramaSemana {

	private EnumVar enumVar;
	private Menu menu;

	public ProgramaSemana(EnumVar enumVar, Menu menu) {

		this.enumVar = enumVar;
		this.menu = menu;
	}

	public void iniciar() {

		menu.setEnum(enumVar.getNombres());
		do{
			menu.printMenu();
			enumVar.printMesage(menu.getOpcion());

		}while (menu.getOpcionSalida() == 2);
	}
}