package Ejercicio8;

public class Doctor extends Persona {
	private String titulacion;
	private int exp;

	public Doctor(String v, String w, int x, String y, int z) {
		super.nombre = v;
		super.apellido = w;
		super.edad = x;
		titulacion = y;
		exp = z;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public int getExp() {
		return exp;
	}

	@Override
	public String toString() {
		return "Doctor: \n"+super.toString()+"\nTitulacion: "+titulacion+"\nExperiencia: "+exp;
	}
}