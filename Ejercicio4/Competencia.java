package Ejercicio4;

import java.util.Scanner;

public class Competencia {

	private int numeroAtletas;

	Scanner scan = new Scanner(System.in);
	Atletas atletas[];

	public Competencia() {}

	public void Numero() {
		System.out.print("\nDigite la cantidad de Atletas: ");
		numeroAtletas = scan.nextInt();
		atletas = new Atletas[numeroAtletas];
	}
	
	public int getTiempoCarrera() {
		return (int)(Math.random()*10) + 1;
	}

	public void Registrar() {
		for (int i=0; i<numeroAtletas; i++) {
			atletas[i] = new Atletas();

			System.out.print("\n"+(i+1)+" Nombre del Atleta: ");
			String nombreA = scan.next();
			atletas[i].setNombre(nombreA);

			System.out.print("\n"+(i+1)+" Numero del Atleta: ");
			int numeroA = scan.nextInt();
			atletas[i].setNumero(numeroA);

			int tiempoRandom = getTiempoCarrera();
			atletas[i].setTiempo(tiempoRandom);
		}
	}

	public void Resultado() {
		Atletas ganador = atletas[0];
		for (int i=0; i<numeroAtletas; i++) {
			System.out.println("......."+atletas[i].getTiempo());
			if (atletas[i].getTiempo() < ganador.getTiempo()) {
				ganador = atletas[i];
			}
		}

		System.out.print("\nEl ganador es: "+ganador.getNombre()
		+"\nEl numero del ganador es: "+ganador.getNumero()
		+"\nEl tiempo del ganador es: "+ganador.getTiempo()+"\n");
	}
}
