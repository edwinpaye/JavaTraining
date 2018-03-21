package Ejercicio12;

import java.util.Scanner;

public class Menu {

	Scanner scn = new Scanner(System.in);

	private String dato[];

	public Menu() {}

	public void setEnum(String dato[]) {
		this.dato = dato;
	}

	public void printMenu() {

		int num = 1;
		System.out.println("\nDigite una de las siguientes opciones:\n");

		for (String rnt: dato) {
			System.out.println((num++)+".- "+rnt+".");
		}
	}

	private int getRango(int menor, int mayor) {

		int x;
		do{
			x = scn.nextInt();
			if (x < menor || x > mayor) {
				System.out.println("El digito "+x+" no esta en el rango, intente denuevo.");
			}
		}while(x<menor || x>mayor);
		return x;	
	}

	public int getOpcion() {

		return (getRango(1, dato.length)-1);
	}

	public int getOpcionSalida() {

		System.out.println("\n1. Salir del programa."
			+"\n2. Elegir nueva opcion.");

		return getRango(1, 2);
	}
}