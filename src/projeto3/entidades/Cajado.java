package projeto3.entidades;

public class Cajado extends Armas {

	public Cajado(int dano) {
		super(dano);
		
	}
	public String ataque() {
		return "com seu cajado, lançando uma bola de fogo";
	}
	public String toString() {
		return "Cajado";
	}

}
