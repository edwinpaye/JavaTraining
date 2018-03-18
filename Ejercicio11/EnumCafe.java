package Ejercicio11;

enum Cafe {

	NEGRO, CARGADO, EXPRESO, NORMAL,

}

public class EnumCafe {

	Cafe cafe[];
	String sugar = "";
	String coffe = "";
	String milk = "";

	public EnumCafe(Cafe[] cafe) {

		this.cafe = cafe;
	}

	private void Ingredientes(Cafe cafe) {

		switch(cafe) {
			case NEGRO:
				sugar = "Una cuchara de azucar.";
				coffe = "Una cuchara de cafe.";
				milk = "Sin leche.";
				break;
			case CARGADO:
				sugar = "Una cuchara de azucar.";
				coffe = "Dos cucharas de cafe.";
				milk = "100ml de leche.";
				break;
			case EXPRESO:
				sugar = "Una cuchara de azucar.";
				coffe = "Una cuchara de azucar.";
				milk = "100ml de leche.";
				break;
			case NORMAL:
				sugar = "Una y media cuchara de azucar.";
				coffe = "Una y media cuchara de cafe.";
				milk = "150ml de leche.";
				break;
		}
	}

	private Cafe getTipo(int posicion) {
		return Cafe.values()[posicion];
	}

	public String[] getNombres() {
		String salida[] = new String[cafe.length];
		for (int i=0; i<cafe.length; i++) {
			salida[i] = Cafe.values()[i].toString();
		}
		return salida;
	}

	public void printIngredientes(Cafe cafe) {
		Ingredientes(cafe);
		System.out.println("Los ingredientes del cafe "+cafe+" son:\n"+sugar+"\n"+coffe+"\n"+milk);
	}
}