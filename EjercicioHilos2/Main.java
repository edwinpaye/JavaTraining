package EjercicioHilos2;

public class Main {

	public static void main(String[] args) {

		HiloAleatorio hilo1 = new HiloAleatorio("Hilo 1");
		HiloAleatorio hilo2 = new HiloAleatorio("Hilo 2");

		hilo1.setNumero(5);
		hilo2.setNumero(7);

		hilo1.start();
		hilo2.start();
	}
}