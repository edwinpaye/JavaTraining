package Ejercicio12;

enum Propied {

	LUNES("primer"),
	MARTES("segundo"),
	MIERCOLES("tercer"),
	JUEVES("cuarto"),
	VIERNES("quinto"),
	SABADO("sexto"),
	DOMINGO("septimo"),

	// PERRO("hotkeyquivoro"),
	// LORO("hervivoro"),
	// PEZ("marino"),
	// COCODRILO("carnivoro");

	private String mesage;

	private Propied(String mesage) {
		this.mesage = mesage;
	}

	public String getMesage() {
		return mesage;
	}
}

public class EnumVar {

	Propied propied[];

	public EnumVar(Propied propied[]) {

		this.propied = propied;
	}

	public Propied getPropied(int posicion) {
		return Propied.values()[posicion];
	}

	public String[] getNombres() {
		String salida[] = new String[propied.length];
		for (int i=0; i<propied.length; i++) {
			salida[i] = Propied.values()[i].toString();
		}
		return salida;
	}

	public void printMesage(int posicion) {
		System.out.println("\nEs el "+getPropied(posicion).getMesage()+" dia de la semana.");
	}
}