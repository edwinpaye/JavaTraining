package Ejercicio6;

public class Complejo {

	private double real;
	private double imag;

	public Complejo(double x, double y) {
		this.real = x;
		this.imag = y;
	}

	public Complejo add(Complejo z) {
		return new Complejo(this.real + z.real, this.imag + z.imag);
	}

	public Complejo mult(Complejo z) {
		return new Complejo(this.real * z.real, this.imag * z.imag);
	}

	public Complejo rest(Complejo z) {
		return new Complejo(this.real - z.real, this.imag - z.imag);
	}
	
	public Complejo multInt(double z) {
		return new Complejo(this.real * z, this.imag * z);
	}
}
