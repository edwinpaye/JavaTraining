package Ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	ArrayList<Persona> persona = new ArrayList<Persona>();
	Scanner scn = new Scanner(System.in);

	public Menu() {}

	public void datosPersona() {	
		int opcion;
		char resp;
		do{
			do{
				System.out.print("\nDigite la opcion que desea:\n"
					+"\n1. Viaje de equipo"
					+"\n2. Entrenamiento"
					+"\n3. Partido de futbol"
					+"\n4. Planificar entrenamiento"
					+"\n5. Entrevista"
					+"\n6. Curar lesion"
					+"\nOpcion: ");
				opcion = scn.nextInt();
			}while(opcion < 1 || opcion > 6);

			switch(opcion) {
				case 1:	viajeDeEquipo();
						break;
				case 2:	entrenamiento();
						break;
				case 3:	partidoDeFutbol();
						break;
				case 4:	planificarEntrenamiento();
						break;
				case 5:	entrevista();
						break;
				case 6:	curarLesion();
						break;
			}

			System.out.print("\nDesea adicionar otra opcion del menu(s/n): ");
			resp = scn.next().charAT(0);

		}while(resp == 's' || resp == 'S');
	}

	private void viajeDeEquipo() {
	}
	private void entrenamiento() {
	}
	private void partidoDeFutbol() {
	}
	private void planificarEntrenamiento() {
	}
	private void entrevista() {
	}
	private void curarLesion() {
	}
}