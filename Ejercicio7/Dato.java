package Ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Dato {

	ArrayList<Poligono> poligono = new ArrayList<Poligono>();
	Scanner scn = new Scanner(System.in);

	public Dato() {}

	public void llenarPoligono() {
		char resp;
		int opcion;
		do{
			do{
				System.out.print("\nDigite que poligono desea:\n"
				+"\n1. Triangulo"
				+"\n2. Rectangulo"
				+"\nOpcion: ");
				opcion = scn.nextInt();
			}while(opcion < 1 || opcion > 2);

			switch(opcion) {
				case 1:	llenarTriangulo();
						break;
				case 2:	llenarRectangulo();
						break;
			}

			System.out.print("\nDesea introducir otro poligono(s/n): ");
			resp = scn.next().charAt(0);

		}while(resp == 's' || resp == 'S');
	}

	public void llenarTriangulo() {
		double l1, l2, l3;

		System.out.print("\nDigite el dato 1 del triangulo; ");
		l1 = scn.nextDouble();
		System.out.print("Digite el dato 2 del triangulo: ");
		l2 = scn.nextDouble();
		System.out.print("Digite el dato 3 del triangulo: ");
		l3 = scn.nextDouble();

		Triangulo triangulo = new Triangulo(l1, l2, l3);

		poligono.add(triangulo);
	}

	public void llenarRectangulo() {
		double l1, l2;

		System.out.print("\nDigite el dato 1 del rectangulo; ");
		l1 = scn.nextDouble();
		System.out.print("Digite el dato 2 del rectangulo: ");
		l2 = scn.nextDouble();

		Rectangulo rectangulo = new Rectangulo(l1, l2);

		poligono.add(rectangulo);
	}

	public void mostrarResultados() {

		for(Poligono p: poligono) {
			System.out.print("\n"+p.toString()
			+"\nArea : "+p.area()+"\n");
		}
	}
}