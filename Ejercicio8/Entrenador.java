package Ejercicio8;

public class Entrenador extends Persona {
	private String estrategia;

	public Entrenador(String w, String x, int y, String z) {
		super.nombre = w;
		super.apellido = x;
		super.edad = y;
		estrategia = z;
	}

	public String getEstrategia() {
		return estrategia;
	}

	@Overrade
	public String toString() {
		return "Entrenador: \n"+super.toString()+"\nEstrategia: "+estrategia;
	}
}