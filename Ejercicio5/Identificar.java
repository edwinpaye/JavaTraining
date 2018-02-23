package Ejercicio5;

import java.util.Scanner;

public class Identificar {

	Scanner scn = new Scanner(System.in);

	private int haltura;
	private int base;
	private int cantidadTriangulos;
	Calcular calcular[];

	public Identificar() {}

	public void setTriangulo() {
		System.out.print("Digite la cantidad de triangulos: ");
		cantidadTriangulos = scn.nextInt();
		calcular = new Calcular[cantidadTriangulos];
	}

	public void crearTriangulos() {

		for (int i=0; i<cantidadTriangulos; i++) {
			calcular[i] = new Calcular();
			System.out.print("\nDigite la base del triangulo "+(i+1)+" : ");
			base = scn.nextInt();
			System.out.print("\nDigite la haltura del triangulo "+(i+1)+" : ");
			haltura = scn.nextInt();
			calcular[i].setBase(base);
			calcular[i].setHaltura(haltura);
		}
	}

	public void printResultados() {
		for (int i=0; i<cantidadTriangulos; i++) {
			System.out.println("\nEl Area del triangulo "+(i+1)+" es: "+calcular[i].area()
				+"\ny su perimetro es: "+calcular[i].perimetro()+"\n");
		}
	}

	public void trianguloMax() {
		int cont = 0;
		for (int i=1; i<cantidadTriangulos; i++) {
			if (calcular[i].area() > calcular[cont].area()) {
				cont = i;
			}
		}
		System.out.println("El triangulo numero "+(cont+1)+" tiene la mayor superficie de los "+cantidadTriangulos+" triangulos.");
	}
}