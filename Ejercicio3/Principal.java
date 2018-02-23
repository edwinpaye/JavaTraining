package Ejercicio3;

import java.util.Scanner;

public class Principal {

	public static int indiceCocheBarato(Vehiculo coches[]) {
		float precio;
		int indice = 0;

		precio = coches[0].getPrecio();
		for (int i=0; i<coches.length; i++) {
			if (coches[i].getPrecio() < precio) {
				precio = coches[i].getPrecio();
				indice = i;
			}
		}
		return indice;
	}

	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		String marca, modelo;
		float precio;
		int numeroVehiculos, indiceCMB;

		System.out.print("Digite la cantidad de vehiculos: ");
		numeroVehiculos = entrada.nextInt();

		Vehiculo coches[] = new Vehiculo[numeroVehiculos];

		for (int i=0; i<coches.length; i++) {
			entrada.nextLine();
			System.out.println("Digite Las caracteristicas del coche "+(i+1)+" :");
			System.out.print("Introduzca la Marca: ");
			marca = entrada.nextLine();
			System.out.print("Introduzca el Modelo: ");
			modelo = entrada.nextLine();
			System.out.print("Introduzca el Precio: ");
			precio = entrada.nextFloat();

			coches[i] = new Vehiculo(marca, modelo, precio);
		}
		indiceCMB = indiceCocheBarato(coches);
		System.out.println("\nEl coche mas barato es: ");
		System.out.println(coches[indiceCMB].mostrarDatos());
	}
}
