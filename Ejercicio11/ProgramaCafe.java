package Ejercicio11;

public class ProgramaCafe {

	private EnumCafe enumC;

	private Menu menu;

	private Cafetera cafetera;

	public ProgramaCafe(EnumCafe enumCafe, Menu menu) {

		enumC = enumCafe;
		this.menu = menu;
	}

	public void iniciar() {

		menu.setEnum(enumC.getNombres());
		do{
			menu.printMenu();
			enumC.printIngredientes(getCafe());

		}while(menu.getOpcionSalida() == 2);
	}

	private Cafe getCafe() {

		int posicion = menu.getOpcion();
		switch (posicion) {
			case 0: cafetera = new CafeNegro();
					break;
			case 1: cafetera = new CafeCargado();
					break;
			case 2: cafetera = new CafeExpreso();
					break;
			case 3: cafetera = new CafeNormal();
					break;
		}
		return cafetera.getIngredientes();
	}
}