package EjercicioHilos;

public class HiloHerencia extends Thread {

	String nombre;
	int numero;

	public HiloHerencia(String msg) {

		super (msg);
	}

	public void run() {

		for (int i=1; i<=numero; i++) {
			
			if (i%2 == 0) {

				System.out.println(this.getName()+": "+i);
			}
		}
	}

	public void setNumero(int num) {

		numero = num;
	}
}