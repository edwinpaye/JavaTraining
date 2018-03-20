package EjercicioHilos;

public class HiloInterfase implements Runnable {

	Thread t;
	int numero;

	public HiloInterfase(String nombre) {

		t = new Thread(this, nombre);
	}

	public void iniciar() {
		t.start();
	}

	public void run() {

		for (int i=1; i<=numero; i++) {
			
			if (i%2 == 1) {

				System.out.println(t.getName()+": "+i);
			}
		}
	}

	public void setNumero(int num) {

		numero = num;
	}
}