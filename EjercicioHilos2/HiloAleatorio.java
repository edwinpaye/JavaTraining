package EjercicioHilos2;

public class HiloAleatorio extends Thread {

	String nombre;
	int numero[];

	public HiloAleatorio(String msg) {
		super (msg);
	}

	public void run() {

		for (int i=0; i<numero.length-3; i++) {

			numero[i] = getVarAleatorio();
			numero[numero.length-2] += numero[i];
			numero[numero.length-1] += Math.pow(numero[i], 2);
			System.out.println(this.getName()+": "+"("+(i+1)+") "+numero[i]);
		}
		numero[0] = (int)(numero[numero.length-1]/(numero.length-3));
		System.out.println("La suma de los elementos es: "+numero[numero.length-2]+", la media de los elementos: "+(int)(numero[numero.length-2]/(numero.length-3))
			+"\nLa suma de los cuadrados de los elementos es: "+numero[numero.length-1]+", la media de los cuadrados: "+numero[0]);
	}

	public void setNumero(int num) {
		numero = new int[num+3];
	}

	private int getVarAleatorio() {
		return (int)(Math.random()*10) + 1;
	}
}