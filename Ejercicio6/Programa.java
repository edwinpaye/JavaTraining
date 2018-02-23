package Ejercicio6;

import java.util.Scanner;

public class Programa {

	Scanner scn = new Scanner(System.in);

	private double real;
	private double imag;
	private double entero;
	Complejo a, b, c;

	public Programa() {}

	private Complejo getComplejo() {

		System.out.print("Digite el numero real: ");
		real = scn.nextDouble();
		System.out.print("Digite el numero imaginario: ");
		imag = scn.nextDouble();
		return new Complejo(real, imag);
	}

	private int setInt() {

		System.out.print("Digite el numero entero: ");
		entero = scn.nextDouble();
	}

	private int getOpcion() {

		System.out.print("Digite una de las opciones: ");
		return scn.nextInt();
	}

	public void setA() {

		a = getComplejo();
	}

	public void setB() {

		b = getComplejo();
	}

	public String suma() {

		c = a.add(b);
		return "\nLa suma de los numeros complejos ("+a.real+", "+a.imag+") + ("+b.real+", "+b.imag+") es: ("+c.real+", "+c.imag+").\n"
	}

	public String multiplicar() {

		c = a.mult(b);
		return "\nLa multiplicacion de los numeros complejos ("+a.real+", "+a.imag+") X ("+b.real+", "+b.imag+") es: ("+c.real+", "+c.imag+").\n"
	}

	public String comparar() {

		c = a.rest(b);
		if (c.real == 0 && c.imag == 0) {
			
			return "\nLos numeros complejos ("+a.real+", "+a.imag+") y ("+b.real+", "+b.imag+") son iguales.\n"
		}
		else {
			return "\nLos numeros complejos ("+a.real+", "+a.imag+") y ("+b.real+", "+b.imag+") no son iguales.\n"
		}
	}

	public String multiplicarEnt() {

		c = a.multInt(entero);
		return "\nLa multiplicacion del numero complejo y entero ("+a.real+", "+a.imag+") X "+entero+" es: ("+c.real+", "+c.imag+").\n"
	}
}