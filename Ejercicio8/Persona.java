package Ejercicio8;

public class Persona {

	protected String nombre;
	protected String apellido;
	protected int edad;

	public Persona(String x, String y, int z) {
		nombre = x;
		apellido = y;
		edad = z;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad()) {
		return edad;
	}

	@Override
	public String toString() {
		return "Nombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad;
	}

}