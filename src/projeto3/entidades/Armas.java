package projeto3.entidades;

public abstract class Armas {
	private int dano;
	public Armas(int dano) {
		this.dano = dano;
	}

	public int getDano() {
		return this.dano;
	}

	public abstract String ataque();
	
	public String toString() {
		return this.getClass().getSimpleName();
	}
	
}
