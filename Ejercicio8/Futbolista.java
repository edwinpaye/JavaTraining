package Ejercicio8;

public class Futbolista extends Persona {
	private String dorsal;
	private String posicion;

	public Futbolista(String v, String w, int x, String y, String z) {
		super.nombre = v;
		super.apellido = w;
		super.edad = x; 
		dorsal = y;
		posicion = z;
	}

	public String getDorsal() {
		return dorsal;
	}

	public String getPosicion() {
		return posicion;
	}

	@Override
	public String toString() {
		return "Futbolista: \n"+super.toString()+"\nDorsal: "+dorsal+"\nPosicion: "+posicion;
	}
}