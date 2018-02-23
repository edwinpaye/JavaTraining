package Ejercicio6;

import java.util.Scanner;

public class Programa {

	Scanner scn = new Scanner(System.in);

	private double real;
	private double imag;
	Complejo a, b, c;

	public Programa() {}

	private Complejo getComplejo() {

		System.out.print("Digite el numero real: ");
		real = scn.nextDouble();
		System.out.print("Digite el numero imaginario: ");
		imag = scn.nextDouble();
		return new Complejo(real, imag);
	}

	private Complejo getInt() {

		System.out.print("Digite el numero entero: ");
		real = scn.nextDouble();
		imag = 0;
		return new Complejo(real, imag);
	}

	public int getOpcion() {

		System.out.print("\nDigite una de las opciones: "
			+"\n1. Sumar el numero complejo ("+a.real+", "+a.imag+") con otro numero complejo."
			+"\n2. Multiplicar el numero complejo ("+a.real+", "+a.imag+") con otro numero complejo."
			+"\n3. Comparar el numero complejo ("+a.real+", "+a.imag+") con otro numero complejo."
			+"\n4. Multiplicar el numero complejo ("+a.real+", "+a.imag+") con un numero entero."
			+"\n5. Salir del programa.");
		return scn.nextInt();
	}

	public void setA() {

		a = getComplejo();
	}

	public void setB() {

		b = getComplejo();
	}

	public void setBInt() {

		b = getInt();
	}

	public String suma() {

		c = a.add(b);
		return "\nLa suma de los numeros complejos ("+a.real+", "+a.imag+") + ("+b.real+", "+b.imag+") es: ("+c.real+", "+c.imag+").\n";
	}

	public String multiplicar() {

		c = a.mult(b);
		return "\nLa multiplicacion de los numeros complejos ("+a.real+", "+a.imag+") X ("+b.real+", "+b.imag+") es: ("+c.real+", "+c.imag+").\n";
	}

	public String comparar() {

		c = a.rest(b);
		if (c.real == 0 && c.imag == 0) {

			return "\nLos numeros complejos ("+a.real+", "+a.imag+") y ("+b.real+", "+b.imag+") son iguales.\n";
		}
		else {
			return "\nLos numeros complejos ("+a.real+", "+a.imag+") y ("+b.real+", "+b.imag+") no son iguales.\n";
		}
	}

	public String multiplicarEnt() {

		c = a.multInt(b);
		return "\nLa multiplicacion del numero complejo y entero ("+a.real+", "+a.imag+") X "+b.real+" es: ("+c.real+", "+c.imag+").\n";
	}
}