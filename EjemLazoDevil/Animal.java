package EjemLazoDevil;

public class Animal {

	Mascota x;
	Gato y;

	public Animal(Mascota x, Gato y) {
		this.x = x;
		this.y = y;
	}

	public void darDeComer() {
		x.comer();
		y.comer();
	}
}