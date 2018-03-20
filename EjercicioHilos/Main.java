package EjercicioHilos;

public class Main {

	public static void main(String[] args) {

		HiloHerencia hilo1 = new HiloHerencia("Hilo 1");

		HiloInterfase hilo2 = new HiloInterfase("Hilo 2");

		hilo1.setNumero(10);
		hilo2.setNumero(10);

		hilo1.start();
		hilo2.iniciar();
	}
}