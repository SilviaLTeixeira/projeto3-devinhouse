package projeto3.entidades;

public class Cajado extends Armas {

	public Cajado(int dano) {
		super(dano);
		
	}
	public String ataque() {
		return "com seu cajado, lan�ando uma bola de fogo";
	}
	public String toString() {
		return "Cajado";
	}

}
